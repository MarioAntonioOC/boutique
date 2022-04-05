package com.erick.boutique.model.dao;

import com.erick.boutique.model.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Integer> {
}
