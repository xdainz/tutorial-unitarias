package com.inventario.inventario.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventario.inventario.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
// los metodos on heredados de JpaRepository

}
