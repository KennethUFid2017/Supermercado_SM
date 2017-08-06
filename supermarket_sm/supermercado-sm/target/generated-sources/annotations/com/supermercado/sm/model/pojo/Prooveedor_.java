package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.Articulo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T22:54:08")
@StaticMetamodel(Prooveedor.class)
public class Prooveedor_ { 

    public static volatile ListAttribute<Prooveedor, Articulo> articuloList;
    public static volatile SingularAttribute<Prooveedor, Integer> codProvedr;
    public static volatile SingularAttribute<Prooveedor, String> web;
    public static volatile SingularAttribute<Prooveedor, String> correo;
    public static volatile SingularAttribute<Prooveedor, String> direccion;
    public static volatile SingularAttribute<Prooveedor, String> logo;
    public static volatile SingularAttribute<Prooveedor, String> nombre;
    public static volatile SingularAttribute<Prooveedor, String> telef;

}