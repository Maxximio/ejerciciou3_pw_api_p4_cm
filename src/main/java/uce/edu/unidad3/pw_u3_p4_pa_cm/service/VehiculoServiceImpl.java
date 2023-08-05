package uce.edu.unidad3.pw_u3_p4_pa_cm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.unidad3.pw_u3_p4_pa_cm.model.Vehiculo;
import uce.edu.unidad3.pw_u3_p4_pa_cm.repository.IVehiculoRepo;
import uce.edu.unidad3.pw_u3_p4_pa_cm.service.to.VehiculoTo;

/**
 * VehiculoServiceImpl
 */

@Service
public class VehiculoServiceImpl implements IVehiculoService{

    @Autowired
    private IVehiculoRepo vehiculoRepo;

    @Override
    public List<Vehiculo> consultarTodos() {
       return this.vehiculoRepo.consultarTodos();
    }

    @Override
    public Vehiculo consultarPlaca(String placa) {
        return this.vehiculoRepo.consultarPlaca(placa);
    }

    private VehiculoTo convertir(Vehiculo vehi){
        VehiculoTo veTo = new VehiculoTo();
        
        veTo.setId(vehi.getId());
        veTo.setPlaca(vehi.getPlaca());
        veTo.setMarca(vehi.getMarca());
        veTo.setAnioFabricacion(vehi.getAnioFabricacion());
        veTo.setPropietario(vehi.getPropietario());

        return veTo;
   }

    @Override
    public List<VehiculoTo> consultarTodosTo() {
        List<Vehiculo> lista = this.vehiculoRepo.consultarTodos();
        List<VehiculoTo> listaTO =  lista.stream().map(estudiante -> this.convertir(estudiante)).collect(Collectors.toList());
        return listaTO;
    }

}