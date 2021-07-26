package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Inventario.Producto;
import ec.edu.epn.Proyecto.Listas.Lista_Productos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReporteProductosTest {

    private Lista_Productos productlist=null;
    Producto producto1=new Producto("001","MORTADELA",29,"SUPERMAXI",40,"MARCA2","TIPO2","2020-12-09");
    Producto producto2=new Producto("002","CAFE",23,"SUPERMAXI",10,"MARCA1","TIPO1","2022-10-11");
    ReporteProductos vr=new ReporteProductos();
    @Before
    public void setup(){

        productlist=new Lista_Productos();
        productlist.añadirProducto(producto1);
        productlist.añadirProducto(producto2);
    }
    @Test
    public void given_ExpirationDate_when_verifydate_then_ok(){
        ReporteProductos vr=new ReporteProductos();
        assertEquals(1, productlist.productosExpirados());

    }

}