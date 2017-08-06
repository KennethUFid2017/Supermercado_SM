package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.ArticuloDeSucursal;
import com.supermercado.sm.model.pojo.DetalleFactura;
import com.supermercado.sm.model.pojo.ImagenArticulo;
import com.supermercado.sm.model.pojo.Prooveedor;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-06T13:27:57")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Prooveedor> codProvedor;
    public static volatile SingularAttribute<Articulo, Short> precUnitar;
    public static volatile SingularAttribute<Articulo, BigDecimal> impuesto;
    public static volatile ListAttribute<Articulo, ArticuloDeSucursal> articuloDeSucursalList;
    public static volatile SingularAttribute<Articulo, Integer> codArticl;
    public static volatile SingularAttribute<Articulo, String> categoria;
    public static volatile ListAttribute<Articulo, ImagenArticulo> imagenArticuloList;
    public static volatile ListAttribute<Articulo, DetalleFactura> detalleFacturaList;
    public static volatile SingularAttribute<Articulo, String> nombre;

}