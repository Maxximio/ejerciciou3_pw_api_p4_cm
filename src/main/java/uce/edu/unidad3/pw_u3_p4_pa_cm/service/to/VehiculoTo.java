package uce.edu.unidad3.pw_u3_p4_pa_cm.service.to;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

/**
 * VehiculoTo
 */
public class VehiculoTo extends RepresentationModel<VehiculoTo> implements Serializable{

private static final long serialVersionUID=1L;

    private Integer id;
    private String placa;
    private String marca;
    private String anioFabricacion;
    private String propietario;

    //set y get
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
    
}