package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Inventario.Fecha;
import ec.edu.epn.Proyecto.Listas.Lista_Productos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReporteProductos {




        public void reporteProductos(Lista_Productos listaproductos){
            System.out.println("=======================REPORTE DE PRODUCTOS====================================");
            System.out.println("Restaurante Don Pepe");
            System.out.println("Fecha del reporte: " + new Date(System.currentTimeMillis()));
            System.out.println("codigo\t\t\t nombre\t\t\t precio\t\t\t cantidad\t\t\t tipo_producto\t\t\t fecha expiracion");
            for(int i=0; i<listaproductos.productos.size(); i++){
                System.out.println(listaproductos.productos.get(i).codigo +"\t\t\t" + listaproductos.productos.get(i).nombre +"\t\t\t" + listaproductos.productos.get(i).precio + "\t\t\t" +
                        "\t\t" + listaproductos.productos.get(i).cantidad + "\t\t\t"+ listaproductos.productos.get(i).tipo_Producto + "\t\t\t" + listaproductos.productos.get(i).FechaExpiracion);
            }
            System.out.println();
            System.out.println("El valor del inventario actual es: $ "+totalProductos(listaproductos));
            System.out.println("El número de productos expirados es: "+productosExpirados(listaproductos));
            System.out.println("Número de productos aun vigentes: " + productosNoExpirados(listaproductos));

        }






    public double totalProductos(Lista_Productos listaproductos) {
        double salida=0;
        for (int i = 0; i < listaproductos.productos.size(); i++) {
            double valor = listaproductos.productos.get(i).cantidad * listaproductos.productos.get(i).precio;
            salida = salida + valor;
        }
        return salida;
    }

    public int productosNoExpirados(Lista_Productos listaproductos) {
        int sizeLista = listaproductos.productos.size();
        int productos_expirados = productosExpirados(listaproductos);
        return sizeLista-productos_expirados;
    }

    public int productosExpirados(Lista_Productos listaproductos) {
        int aux = 0;

        Date fechaactual = new Date(System.currentTimeMillis());
        for (int i = 0; i < listaproductos.productos.size(); i++) {


            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaInicioDate = null;  //String a date
            try {
                fechaInicioDate = date.parse(listaproductos.productos.get(i).FechaExpiracion);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            //comprueba si es que inicio esta después que fecha actual
            if (fechaInicioDate.after(fechaactual)) {

            } else {
                aux += 1;
            }

        }
        return aux;
    }
    }

