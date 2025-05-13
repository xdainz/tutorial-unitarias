package com.inventario.inventario.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventario.inventario.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

    // CRUD

    // Create
        // El metodo save viene creado por defecto y no hace falta implementarlo
        // El metodo saveAll guarda la lista de productos ingresados
    
    // Read
    List<Producto> findAll();

    Optional<Producto> findById(Long id); // "Optional" ayuda cuando el retorno puede ser nulo

        // findAllById() retorna una lista con los productos q esten en la lista ingresada

    // Update

    // Delete
    
    

    boolean existsById(Long id);

}
