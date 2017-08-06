package com.supermercado.sm.model.pojo;

import com.supermercado.sm.model.pojo.Cliente;
import com.supermercado.sm.model.pojo.DetalleFactura;
import com.supermercado.sm.model.pojo.Empleado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-05T22:54:08")
@StaticMetamodel(EncabezadoFactura.class)
public class EncabezadoFactura_ { 

    public static volatile SingularAttribute<EncabezadoFactura, Date> fechaCompra;
    public static volatile SingularAttribute<EncabezadoFactura, DetalleFactura> noDetallFactr;
    public static volatile SingularAttribute<EncabezadoFactura, BigDecimal> impuestoDeVenta;
    public static volatile SingularAttribute<EncabezadoFactura, Cliente> idCliente;
    public static volatile SingularAttribute<EncabezadoFactura, Empleado> empleadAtiend;
    public static volatile SingularAttribute<EncabezadoFactura, Integer> idEncbzd;
    public static volatile SingularAttribute<EncabezadoFactura, Integer> precioTotal;

}