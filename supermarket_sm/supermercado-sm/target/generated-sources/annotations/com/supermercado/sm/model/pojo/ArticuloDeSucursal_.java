package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.Articulo;
import com.supermercado.sm.model.pojo.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-06T13:27:57")
@StaticMetamodel(ArticuloDeSucursal.class)
public class ArticuloDeSucursal_ { 

    public static volatile SingularAttribute<ArticuloDeSucursal, Sucursal> codSucursl;
    public static volatile SingularAttribute<ArticuloDeSucursal, Integer> idArtSuc;
    public static volatile SingularAttribute<ArticuloDeSucursal, Integer> stock;
    public static volatile SingularAttribute<ArticuloDeSucursal, Articulo> codArticulo;

}