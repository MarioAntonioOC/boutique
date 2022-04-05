package com.erick.boutique.service;

import com.erick.boutique.model.dao.CategoriaDao;
import com.erick.boutique.model.dao.GeneroDao;
import com.erick.boutique.model.entity.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    GeneroDao generoDao;


    @Override
    public List<Genero> findAll() {
        return generoDao.findAll();
    }
}
