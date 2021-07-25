package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Inventario.Despacho_Productos;
import ec.edu.epn.Proyecto.Listas.Lista_Despachos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReporteDespachoProductosTest {
    public Lista_Despachos despachos = null;

    Despacho_Productos despacho1 = new Despacho_Productos("CAFE",140,"2021-07-25");
    Despacho_Productos despacho2 = new Despacho_Productos("CARNE",10,"2021-07-14");
    Despacho_Productos despacho3 = new Despacho_Productos("CAFE",4,"2021-07-18");
    Despacho_Productos despacho4 = new Despacho_Productos("ENLATADOS",24,"2021-05-12");
    Despacho_Productos despacho5 = new Despacho_Productos("TOMATES",3,"2021-06-25");
    Despacho_Productos despacho6 = new Despacho_Productos("CARNE",15,"2021-07-14");
    Despacho_Productos despacho7 = new Despacho_Productos("CARNE",10,"2021-07-14");

    ReporteDespachoProductos reportedespachos = new ReporteDespachoProductos();
@Before
public void setUp(){

    despachos = new Lista_Despachos();
    despachos.lista_despachos.add(despacho1);
    despachos.lista_despachos.add(despacho2);
    despachos.lista_despachos.add(despacho3);
    despachos.lista_despachos.add(despacho4);
    despachos.lista_despachos.add(despacho5);
    despachos.lista_despachos.add(despacho6);
    despachos.lista_despachos.add(despacho7);

}

    @Test
    public void given_Date_when_countProducts_then_ok(){
    assertEquals(179 , reportedespachos.cantidadDespachoxMes(despachos));
    }

    @Test
    public void given_String_when_max_product_then_ok(){

        assertEquals("CAFE: 144" , reportedespachos.productoMayorDemanda(despachos));
    }
}