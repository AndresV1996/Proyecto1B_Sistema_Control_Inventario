package ec.edu.epn.Proyecto.Inventario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificador {

    public boolean verificarCadenaLetras(String nombre){
       for (int i = 0; i < nombre.length(); i++)
       {
           char caracter = nombre.toUpperCase().charAt(i);
           if (verificarCaracter((int) caracter)) return false; //Se ha encontro// do un caracter que no es letra

       }
       return true;
   }

    private boolean verificarCaracter(int caracter) {
        if (caracter != 165 && (caracter < 65 || caracter > 90) && caracter !=32){
            System.out.println("Cadena ingresada contiene numeros, ingrese nuevamente");
            return true;
        }
        return false;
    }

    public boolean verificarPrecio(double precio){
        if(precio <=0){
            System.out.println("el precio no puede ser negativo, ingrese nuevamente");
            return false;
        }
        return true;
   }

    public boolean verificarCantidad(int cantidad){
        if(cantidad <0){
            System.out.println("la cantidad no puede ser negativo, ingrese nuevamente");
            return false;
        }
        return true;
    }

    public boolean verificarCantidad_Retiro(int cantidad_retiro , int cantidad_stock){
       if(cantidad_retiro>cantidad_stock || cantidad_retiro <0 ){
           System.out.println("La cantidad solicitada es mayor al stock disponible o es negativa, ingrese nuevamente");
           return  false;
       }
        return true;

    }

    public boolean verificarCodigoProducto(int codigo, int size){

       if(codigo > size || codigo < 1){
           System.out.println("Codigo de producto no existente, ingrese nuevamente");
           return false;
       }
       return true;
    }

    public boolean verificarCantidad_Aumento(int cantidad_aumenta){
       if(cantidad_aumenta<=0){
           System.out.println("Cantidad ingresada incorrecta, ingresa nuevamente");
           return false;
       }
       return true;
    }

    public boolean validateInvoiceId(String invoiceId){
        boolean exit;
        Pattern pa= Pattern.compile("[0-9]{3}[-][0-9]{3}[-][0-9]{9}");
        Matcher mat = pa.matcher(invoiceId);
        if(mat.matches()==true){
            exit=true;
        }
        else{
            exit=false;
        }
        return  exit;
    }
    private int[] extractDate(String date) {
        String[] separatedData = date.split("/");
        int[] data=new int[3];
        data[0] = Integer.parseInt(separatedData[0]);
        data[1] = Integer.parseInt(separatedData[1]);
        data[2] = Integer.parseInt(separatedData[2]);
        return data;
    }
    private boolean esBisiesto(String fecha1) {
        int year= extractDate(fecha1)[2];
        boolean isLeap;
        isLeap=((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
        return isLeap;
    }
    public boolean correctDate(String date1) {
        int year= extractDate(date1)[2];
        int day= extractDate(date1)[0];
        int month= extractDate(date1)[1];
        int validDate=0;
        if (year >= 2020) {
            validDate ++;
        }
        if (month >= 1 && month <= 12) { validDate ++; }
        switch (month) {
            case 2:
                if ( esBisiesto(date1)) {
                    if (day >= 1 && day <= 29) { validDate ++; }
                } else {
                    if (day >= 1 && day <= 28) { validDate ++; }
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day >= 1 && day <= 30) { validDate ++; }
                break;
            default:
                if (day >= 1 && day <= 31) { validDate ++; }
        }
        if (validDate==3) { return true;}
        return false;
    }


}
