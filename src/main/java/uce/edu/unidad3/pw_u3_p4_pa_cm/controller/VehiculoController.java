package uce.edu.unidad3.pw_u3_p4_pa_cm.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uce.edu.unidad3.pw_u3_p4_pa_cm.model.Vehiculo;
import uce.edu.unidad3.pw_u3_p4_pa_cm.service.IVehiculoService;
import uce.edu.unidad3.pw_u3_p4_pa_cm.service.to.VehiculoTo;

@RestController
@RequestMapping(path = "/vehiculos")
public class VehiculoController {

    @Autowired
    private IVehiculoService vehiculoService;
    
    @GetMapping ( produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<VehiculoTo>> buscarTodos() {
        List<VehiculoTo> lista = this.vehiculoService.consultarTodosTo();
        for (VehiculoTo veTo : lista) {
            Link myLink = linkTo(methodOn(VehiculoController.class).buscarPorPlaca(veTo.getPlaca())).withRel("materias");
            veTo.add(myLink);
        }
        return new ResponseEntity<>(lista, null, 200);
    }

    @GetMapping ( path = "/{placa}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Vehiculo buscarPorPlaca(@PathVariable String placa) {
        
        return this.vehiculoService.consultarPlaca(placa);
    }

}
