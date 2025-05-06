package com.inventario.inventario.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Producto {
    private int id;
    private String nombre;
    private int precio;
    private int stock;
    private String marca;
}
