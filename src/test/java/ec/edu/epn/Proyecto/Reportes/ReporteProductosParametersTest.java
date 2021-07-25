package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Inventario.Producto;
import ec.edu.epn.Proyecto.Listas.Lista_Productos;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value=Parameterized.class)
public class ReporteProductosParametersTest {

    private  Lista_Productos productl;
    private double valor;
    public static Lista_Productos productlist = new Lista_Productos();
    public static Lista_Productos productlist1=new Lista_Productos();
    public static Lista_Productos productlist2=new Lista_Productos();
    public static Lista_Productos productaux=new Lista_Productos();
    Producto producto1=new Producto("001","MORTADELA",29.45,"SUPERMAXI",40,"MARCA2","TIPO2","2023-02-08");
    Producto producto2=new Producto("002","CAFE",10.3,"SUPERMAXI",10,"MARCA1","TIPO1","2022-08-11");
    Producto producto3=new Producto("003"," ATUN",17.9,"SUPERMAXI",56,"MARCA2","TIPO2","2023-01-09");
    Producto producto4=new Producto("004","CHOCOLATE",23.56,"LA FAVORITA",17,"MARCA1","TIPO1","2022-10-11");


    @Before
    public void setup(){

        productlist.añadirProducto(producto1);
        productlist.añadirProducto(producto2);
        productlist1.añadirProducto(producto2);
        productlist1.añadirProducto(producto4);
        productlist2.añadirProducto(producto2);
        productlist2.añadirProducto(producto3);
        productlist2.añadirProducto(producto4);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects=new ArrayList<Object[]>();
        objects.add(new Object[]{productlist,1281});
        objects.add(new Object[]{productlist1,503.52});
        objects.add(new Object[]{productlist2,1505.91});


        return objects; }

    public ReporteProductosParametersTest(Lista_Productos productl, double valor) {
        this.productl = productl;
        this.valor = valor;
    }

    @Test
    public void given_double_when_total_amount_then_ok(){

        ReporteProductos reportep=new ReporteProductos();
        assertEquals(reportep.totalProductos(productl),valor,0.2);

    }
    @After
    public void despues(){
        productl=productaux;
        productlist=productaux;
        productlist1=productaux;
        productlist2=productaux;

    }

}