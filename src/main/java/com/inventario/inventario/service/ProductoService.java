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

    @Autowired
    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

}
