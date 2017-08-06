package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.Departamento;
import com.supermercado.sm.model.pojo.EncabezadoFactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T22:54:08")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> clave;
    public static volatile ListAttribute<Empleado, EncabezadoFactura> encabezadoFacturaList;
    public static volatile SingularAttribute<Empleado, Integer> idEmpled;
    public static volatile SingularAttribute<Empleado, String> role;
    public static volatile SingularAttribute<Empleado, String> correo;
    public static volatile SingularAttribute<Empleado, Float> salario;
    public static volatile SingularAttribute<Empleado, Departamento> codDepart;
    public static volatile SingularAttribute<Empleado, String> nombre;

}