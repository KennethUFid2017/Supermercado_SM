package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.Articulo;
import com.supermercado.sm.model.pojo.EncabezadoFactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-06T13:27:57")
@StaticMetamodel(DetalleFactura.class)
public class DetalleFactura_ { 

    public static volatile ListAttribute<DetalleFactura, EncabezadoFactura> encabezadoFacturaList;
    public static volatile SingularAttribute<DetalleFactura, Integer> noDetallFact;
    public static volatile SingularAttribute<DetalleFactura, Articulo> codArticulo;
    public static volatile SingularAttribute<DetalleFactura, Integer> cantTotDeArtic;

}