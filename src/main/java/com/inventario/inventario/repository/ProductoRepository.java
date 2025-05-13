package com.inventario.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.inventario.inventario.model.Producto;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    public Producto create(Producto producto) {
        productos.add(producto);
        System.out.println(productos.toString());
        return producto;
    }

    public List<Producto> readAll() {
        return productos;
    }

    public Producto read(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Producto update(int id, Producto productoIngresado) {
        Producto placeholder = this.read(id);
        if (placeholder != null) {
            placeholder.setNombre(productoIngresado.getNombre());
            placeholder.setPrecio(productoIngresado.getPrecio());
            placeholder.setStock(productoIngresado.getStock());
            return productoIngresado;
        }
        return null;
    }

    public String delete(int id) {
        if (productos.removeIf(kill -> kill.getId() == id)) {
            return "Producto eliminado";
        }
        return null;
    }

}
