package org.example.dreamgear.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Productos")
public class Productos {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PRECIO")
    private String precio;
    @Column(name = "IMAGEN")
    private String imagen;

    public Productos(Integer id, String nombre, String precio, String imagen){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public Productos() {

    }
}
