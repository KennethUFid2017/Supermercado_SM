package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.ArticuloDeSucursal;
import com.supermercado.sm.model.pojo.Departamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-06T13:27:57")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, Integer> codSucursl;
    public static volatile ListAttribute<Sucursal, Departamento> departamentoList;
    public static volatile ListAttribute<Sucursal, ArticuloDeSucursal> articuloDeSucursalList;
    public static volatile SingularAttribute<Sucursal, String> direccion;
    public static volatile SingularAttribute<Sucursal, String> nombre;
    public static volatile SingularAttribute<Sucursal, String> telef;

}