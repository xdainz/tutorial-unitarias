package com.inventario.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.inventario.model.Producto;
import com.inventario.inventario.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardarProducto(Producto p) {
        return productoRepository.create(p);
    }

    public List<Producto> listarProductos() {
        return productoRepository.readAll();
    }

    public Producto buscarId(int id) {
        return productoRepository.readId(id);
    }
}
