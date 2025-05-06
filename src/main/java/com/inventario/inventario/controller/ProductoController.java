package com.inventario.inventario.controller;

import java.util.List;
import com.inventario.inventario.model.Producto;
import com.inventario.inventario.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RequestMapping("/api/inventario")
@RestController

public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto guardar(@RequestBody Producto p) {
        return productoService.guardarProducto(p);
    }

    @GetMapping
    public List<Producto> getProductos() {
        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public Producto getProductoId(@PathVariable int id) {
        return productoService.buscarProducto(id);
    }

    @PutMapping("/{id}")
    public Producto putProducto(@PathVariable int id, @RequestBody Producto producto) {
        return productoService.modificarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable int id) {
        return productoService.eliminarProducto(id);
    }
}
