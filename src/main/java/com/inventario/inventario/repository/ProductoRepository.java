package com.inventario.inventario.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.inventario.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    List<Producto> findAll();

    // "Optional" ayuda cuando el retorno puede ser nulo
    Optional<Producto> findById(Long id);

    boolean existsById(Long id);

}
