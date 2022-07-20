package com.erick.boutique.controller;

import com.erick.boutique.model.entity.Categoria;
import com.erick.boutique.model.entity.Genero;
import com.erick.boutique.model.entity.Producto;
import com.erick.boutique.model.entity.Talla;
import com.erick.boutique.service.CategoriaService;
import com.erick.boutique.service.GeneroService;
import com.erick.boutique.service.ProductoService;
import com.erick.boutique.service.TallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private TallaService tallaService;

    @Autowired
    private GeneroService generoService;

    @GetMapping("/getProducto")
    public ResponseEntity<List<Producto>> listaProducto() {
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getCategoria")
    public ResponseEntity<List<Categoria>> listaCategoria() {
        return new ResponseEntity<>(categoriaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getTalla")
    public ResponseEntity<List<Talla>> listaTallas() {
        return new ResponseEntity<>(tallaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getGenero")
    public ResponseEntity<List<Genero>> listaGenero() {
        return new ResponseEntity<>(generoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Producto> CrearProducto(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoService.save(producto), HttpStatus.CREATED);
    }

    @PutMapping("/update/{idProducto}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable int idProducto, @RequestBody Producto producto) {
        Producto productoEncontrado = productoService.findById(idProducto);

        if (productoEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            productoEncontrado.setNombre(productoEncontrado.getNombre());
            productoEncontrado.setMarca(productoEncontrado.getMarca());
            productoEncontrado.setStock(productoEncontrado.getStock());
            productoEncontrado.setCodigoBarras(productoEncontrado.getCodigoBarras());
            productoEncontrado.setPrecio(productoEncontrado.getPrecio());
            productoEncontrado.setIdcategoria(productoEncontrado.getIdcategoria());
            productoEncontrado.setIdTalla(productoEncontrado.getIdTalla());
            return new ResponseEntity<>(productoService.save(productoEncontrado), HttpStatus.CREATED);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/{idProducto}")
    public ResponseEntity<?> actualizarProducto(@PathVariable int idProducto) {
        productoService.delete(idProducto);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}