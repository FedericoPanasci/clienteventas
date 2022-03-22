package com.ventas.ventas.controller;

import com.ventas.ventas.entity.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class ProductoController {
    @GetMapping("/all")
    List<Producto> all(){
        return Arrays.asList(new Producto(1, "remera", "vans", 5));
    }

    @PostMapping("/nuevaVenta")
    Producto save(@RequestBody Producto producto){
        return save(producto);
    }
}
