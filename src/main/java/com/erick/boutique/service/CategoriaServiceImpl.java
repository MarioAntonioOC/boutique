package com.erick.boutique.service;

import com.erick.boutique.model.dao.CategoriaDao;
import com.erick.boutique.model.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> findAll() {
        return categoriaDao.findAll();
    }
}
