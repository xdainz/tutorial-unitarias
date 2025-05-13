package com.inventario.inventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.inventario.model.Producto;
import com.inventario.inventario.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

    public Optional<Producto> findById(Long id){
        return productoRepository.findById(id);
    }

    public Boolean existsById(Long id){
        return productoRepository.existsById(id);
    }

}
