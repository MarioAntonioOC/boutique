package com.erick.boutique.model.dao;

import com.erick.boutique.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Integer> {


}
