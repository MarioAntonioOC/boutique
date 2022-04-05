package com.erick.boutique.service;

import com.erick.boutique.model.dao.TallaDao;
import com.erick.boutique.model.entity.Talla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TallaServiceImpl implements TallaService {

    @Autowired
    private TallaDao tallaDao;

    @Override
    public List<Talla> findAll() {
        return tallaDao.findAll();
    }
}
