package ec.edu.epn.Proyecto.Execute;

import ec.edu.epn.Proyecto.Inventario.Despacho_Productos;
import ec.edu.epn.Proyecto.Inventario.Producto;
import ec.edu.epn.Proyecto.Listas.Lista_Despachos;
import ec.edu.epn.Proyecto.Listas.Lista_Productos;
import ec.edu.epn.Proyecto.Reportes.ReporteDespachoProductos;
import ec.edu.epn.Proyecto.Reportes.ReporteProductos;

public class Project_Execute {
    public static void main(String[] args) {
        Lista_Productos lista_productos;
        ReporteProductos productReport = new ReporteProductos();

        Lista_Despachos lista_despachos = new Lista_Despachos();
        ReporteDespachoProductos distpatchReport = new ReporteDespachoProductos();
        Producto producto1 = new Producto("001", "MORTADELA", 29.45, "SUPERMAXI", 40, "MARCA2", "TIPO2", "2021-07-08");
        Producto producto2 = new Producto("002", "CAFE", 10.3, "SUPERMAXI", 60, "MARCA1", "TIPO1", "2021-08-11");
        Producto producto3 = new Producto("003", " ATUN", 17.9, "SUPERMAXI", 56, "MARCA2", "TIPO2", "2021-06-09");
        Producto producto4 = new Producto("004", "TOCINO", 23.56, "LA FAVORITA", 17, "MARCA1", "TIPO1", "2021-10-11");
        Producto producto5 = new Producto("005", "JAMON", 29.45, "SUPERMAXI", 40, "MARCA2", "TIPO2", "2021-11-08");
        Producto producto6 = new Producto("006", "ACEITE", 10.3, "SUPERMAXI", 10, "MARCA1", "TIPO1", "2021-08-11");
        Producto producto7 = new Producto("007", "CHOCOLATE", 17.9, "SUPERMAXI", 125, "MARCA2", "TIPO2", "2021-07-09");
        Producto producto8 = new Producto("008", "MANTEQUILLA", 2.50, "LA FAVORITA", 20, "MARCA1", "TIPO1", "2021-07-11");
        Producto producto9 = new Producto("009", "TALLARIN", 29.45, "SUPERMAXI", 40, "MARCA2", "TIPO2", "2021-08-08");
        Producto producto10 = new Producto("010", "NUECES", 10.3, "SUPERMAXI", 10, "MARCA1", "TIPO1", "2022-08-11");
        Producto producto11 = new Producto("011", " HARINA", 17.9, "SUPERMAXI", 56, "MARCA2", "TIPO2", "2022-09-09");
        Producto producto12 = new Producto("012", "PAN", 0.08, "LA FAVORITA", 57, "MARCA1", "TIPO1", "2021-10-11");
        lista_productos = new Lista_Productos();
        lista_productos.añadirProducto(producto1);
        lista_productos.añadirProducto(producto2);
        lista_productos.añadirProducto(producto3);
        lista_productos.añadirProducto(producto4);
        lista_productos.añadirProducto(producto5);
        lista_productos.añadirProducto(producto6);
        lista_productos.añadirProducto(producto7);
        lista_productos.añadirProducto(producto8);
        lista_productos.añadirProducto(producto9);
        lista_productos.añadirProducto(producto10);
        lista_productos.añadirProducto(producto11);
        lista_productos.añadirProducto(producto12);
        productReport.reporteProductos(lista_productos);
        Despacho_Productos despacho1 = new Despacho_Productos("MORTADELA",30,"2021-07-25");
        Despacho_Productos despacho2 = new Despacho_Productos("TOCINO",5,"2021-07-14");
        Despacho_Productos despacho3 = new Despacho_Productos("CAFE",4,"2021-07-18");
        Despacho_Productos despacho4 = new Despacho_Productos("ATUN",24,"2021-05-12");
        Despacho_Productos despacho5 = new Despacho_Productos("ACEITE",3,"2021-06-25");
        Despacho_Productos despacho6 = new Despacho_Productos("CHOCOLATE",15,"2021-07-14");
        Despacho_Productos despacho7 = new Despacho_Productos("CHOCOLATE",10,"2021-07-14");
        lista_despachos.añadirDespacho(despacho1);
        lista_despachos.añadirDespacho(despacho2);
        lista_despachos.añadirDespacho(despacho3);
        lista_despachos.añadirDespacho(despacho4);
        lista_despachos.añadirDespacho(despacho5);
        lista_despachos.añadirDespacho(despacho6);
        lista_despachos.añadirDespacho(despacho7);
        distpatchReport.reporteDespachos(lista_despachos);
    }
}
