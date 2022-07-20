package com.erick.boutique.model.response;

import com.erick.boutique.model.entity.Categoria;
import com.erick.boutique.model.entity.Genero;
import com.erick.boutique.model.entity.Talla;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponse {

    private String nombre;

    private String marca;

    private int stock;

    private String codigoBarras;

    private int precio;

    private Categoria idcategoria;

    private Talla idTalla;

    private Genero idGenero;
}
