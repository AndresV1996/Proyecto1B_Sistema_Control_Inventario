package ec.edu.epn.Proyecto.Inventario;

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



}
