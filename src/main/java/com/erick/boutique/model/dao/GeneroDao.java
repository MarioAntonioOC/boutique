package com.erick.boutique.model.dao;

import com.erick.boutique.model.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroDao extends JpaRepository<Genero, Integer> {
}
