package com.inventario.inventario.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.assertj.core.api.Assertions.assertThat;

import com.inventario.inventario.model.Producto;
import com.inventario.inventario.repository.ProductoRepository;

public class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;
    
    @InjectMocks
    private ProductoService productoService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGuardarProducto(){
        Producto producto = new Producto(null, "Playstation 2", 20000L, 32, "Sony");
        Producto productoGuardado = new Producto(1L, "Playstation 2", 20000L, 32, "Sony");

        when(productoRepository.save(producto)).thenReturn(productoGuardado);

        Producto resultado = productoService.save(producto);

        assertThat(resultado.getId()).isEqualTo(1L);

        verify(productoRepository).save(producto);
    }
}