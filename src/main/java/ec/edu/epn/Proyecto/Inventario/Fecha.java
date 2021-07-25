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

    public boolean fechaCorrecta() {
        int fechaValida=0;
        if (año >= 2020) {
            fechaValida ++;
        }
        if (mes >= 1 && mes <= 12) { fechaValida ++; }
        switch (mes) {
            case 2:
                if ( añoBisiesto()) {
                    if (dia >= 1 && dia <= 29) { fechaValida ++; }
                } else {
                    if (dia >= 1 && dia <= 28) { fechaValida ++; }
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia >= 1 && dia <= 30) { fechaValida ++; }
                break;
            default:
                if (dia >= 1 && dia <= 31) { fechaValida ++; }
        }
        if (fechaValida==3) { return true;}
        return false;
    }
}
