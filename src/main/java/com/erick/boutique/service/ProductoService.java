package com.erick.boutique.service;

import com.erick.boutique.model.entity.Producto;

import java.util.List;

public interface ProductoService {

    public Producto save(Producto producto);

    public Producto findById(int idProducto);

    public List<Producto> findAll();

    public void delete(int idProducto);

}
