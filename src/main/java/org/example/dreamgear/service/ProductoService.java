package org.example.dreamgear.service;

import org.example.dreamgear.model.Productos;
import org.example.dreamgear.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class ProductoService {
    private final ProductosRepository productosRepository;

    @Autowired
    public ProductoService(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public List<Productos> getAllProducts() {
        return productosRepository.findAll();

    }
}
