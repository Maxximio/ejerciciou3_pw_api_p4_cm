package uce.edu.unidad3.pw_u3_p4_pa_cm.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.unidad3.pw_u3_p4_pa_cm.model.Vehiculo;

/**
 * VehiculoRepoImpl
 */

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Vehiculo> consultarTodos() {
        TypedQuery<Vehiculo> myQuery = this.em
                .createQuery("SELECT a FROM Vehiculo a  ", Vehiculo.class);

        return myQuery.getResultList();
    }

    @Override
    public Vehiculo consultarPlaca(String placa) {
        TypedQuery<Vehiculo> myQuery = this.em
                .createQuery("SELECT a FROM Vehiculo a WHERE a.placa =:placa", Vehiculo.class);
        myQuery.setParameter("placa", placa);
        return myQuery.getSingleResult();
    }

}