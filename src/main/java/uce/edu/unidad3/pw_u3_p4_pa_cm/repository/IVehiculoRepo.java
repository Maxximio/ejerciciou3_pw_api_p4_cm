package uce.edu.unidad3.pw_u3_p4_pa_cm.repository;

import java.util.List;

import uce.edu.unidad3.pw_u3_p4_pa_cm.model.Vehiculo;

public interface IVehiculoRepo {
    
    public List<Vehiculo> consultarTodos();

    public Vehiculo consultarPlaca(String placa);

}
