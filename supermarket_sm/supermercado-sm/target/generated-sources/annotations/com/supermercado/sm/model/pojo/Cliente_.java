package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.EncabezadoFactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T22:54:08")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, EncabezadoFactura> encabezadoFacturaList;
    public static volatile SingularAttribute<Cliente, Integer> idClient;
    public static volatile SingularAttribute<Cliente, String> cedula;
    public static volatile SingularAttribute<Cliente, Integer> cantidadDeCompras;
    public static volatile SingularAttribute<Cliente, String> nombre;

}