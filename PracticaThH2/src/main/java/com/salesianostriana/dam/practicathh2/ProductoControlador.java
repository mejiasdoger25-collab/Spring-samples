package com.salesianostriana.dam.practicathh2;

import com.salesianostriana.dam.practicathh2.Producto;
import com.salesianostriana.dam.practicathh2.ProductoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductoControlador {

    private final ProductoRepository repository;

    public ProductoControlador(ProductoRepository repository) {
        this.repository = repository;
    }

    @GetMapping({"/", "/indexTesting"})
    public String index(Model model) {
        List<Producto> productos = repository.findAll();
        model.addAttribute("productos", productos);
        return "indexTesting";
    }
}