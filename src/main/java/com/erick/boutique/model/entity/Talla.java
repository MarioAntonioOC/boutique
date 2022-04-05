package com.erick.boutique.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TALLA")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTalla")
    private int idTalla;

    @Column(name = "nombreTalla")
    private String nombreTalla;

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public String getNombreTalla() {
        return nombreTalla;
    }

    public void setNombreTalla(String nombreTalla) {
        this.nombreTalla = nombreTalla;
    }
}
