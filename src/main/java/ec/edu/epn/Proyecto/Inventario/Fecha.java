package ec.edu.epn.Proyecto.Inventario;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    //constructor por defecto
    public Fecha() {

    }

    //constructor con parametros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    private boolean añoBisiesto() {
        boolean esBisiesto;
         esBisiesto=((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)));
         return esBisiesto;
    }


    public String FechaActual() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }

}
