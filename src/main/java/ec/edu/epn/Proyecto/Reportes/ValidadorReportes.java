package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Listas.Lista_Productos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorReportes {

    public double totalProductos(Lista_Productos listaproductos) {
        double salida = 0;
        for (int i = 0; i < listaproductos.productos.size(); i++) {
            salida += listaproductos.productos.get(i).cantidad * listaproductos.productos.get(i).precio;
        }
        return salida;
    }

    public int productosNoExpirados(Lista_Productos listaproductos) {
        int aux = 0;
        return  aux;
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