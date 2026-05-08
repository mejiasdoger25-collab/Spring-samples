package com.salesianostriana.dam.practicathh2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String precio;
    
    //lombok bug
    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}