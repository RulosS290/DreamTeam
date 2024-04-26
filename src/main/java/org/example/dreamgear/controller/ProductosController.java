package org.example.dreamgear.controller;

import org.example.dreamgear.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class ProductosController {
    private final ProductoService productoService;

    @Autowired
    public ProductosController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("Producto-Servicios")
    public String index(Model model) {
        return "productos-servicios";
    }
}
