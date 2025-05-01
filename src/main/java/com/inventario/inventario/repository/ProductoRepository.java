package com.inventario.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.inventario.inventario.model.Producto;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    ProductoRepository() {
        productos.add(new Producto(1, "Laptop Gamer", 490000, 15, null));
        productos.add(new Producto(2, "Smartphone Pro", 323000, 30, null));
        productos.add(new Producto(3, "Auriculares Inalámbricos", 69990, 50, null));
        productos.add(new Producto(4, "Tablet 10 pulgadas", 199990, 25, null));
        productos.add(new Producto(5, "Teclado Mecánico RGB", 60000, 40, null));
    }

    public Producto create(Producto producto) {
        productos.add(producto);
        System.out.println(productos.toString());
        return producto;
    }

    public List<Producto> readAll() {
        return productos;
    }

    public Producto readId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
