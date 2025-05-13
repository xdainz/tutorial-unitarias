package com.inventario.inventario.controller;

import java.util.List;
import com.inventario.inventario.model.Producto;
import com.inventario.inventario.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/inventario")
@RestController

public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos(){
        List<Producto> productos = productoService.findAll();

        if (!productos.isEmpty()){
            return new ResponseEntity<>(productos, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
