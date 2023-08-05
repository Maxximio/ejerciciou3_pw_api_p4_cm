package uce.edu.unidad3.pw_u3_p4_pa_cm.service;

import java.util.List;

import uce.edu.unidad3.pw_u3_p4_pa_cm.model.Vehiculo;
import uce.edu.unidad3.pw_u3_p4_pa_cm.service.to.VehiculoTo;

public interface IVehiculoService {
    
    public List<Vehiculo> consultarTodos();

    public List<VehiculoTo> consultarTodosTo();

    public Vehiculo consultarPlaca(String placa);

}
