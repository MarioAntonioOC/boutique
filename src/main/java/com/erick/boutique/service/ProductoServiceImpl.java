package com.erick.boutique.service;

import com.erick.boutique.model.dao.ProductoDao;
import com.erick.boutique.model.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDao productoDao;
    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public Producto findById(int idProducto) {
        return productoDao.findById(idProducto).orElse(null);
    }

    @Override
    public List<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    public void delete(int idProducto) {
    productoDao.deleteById(idProducto);
    }
}
