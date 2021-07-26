package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Listas.Lista_Despachos;

import javax.xml.bind.SchemaOutputResolver;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;

public class ReporteDespachoProductos {

    public void reporteDespachos(Lista_Despachos despachos){
        System.out.println();
        System.out.println("====================REPORTE DE DESPACHOS DE PRODUCTOS==================");
        System.out.println("Restaurante Don Pepe");
        System.out.println("Fecha del reporte: " + new Date(System.currentTimeMillis()));
        despachos.mostrarDespachos() ;
        System.out.println();
        System.out.println("Cantidad de productos despachados en este mes: " + ZonedDateTime.now().getMonth() + " : "
                + cantidadDespachoxMes(despachos));
        System.out.println("El producto mas despachado en este mes de " + ZonedDateTime.now().getMonth() +" es " +
                productoMayorDemanda(despachos));
        System.out.println("El producto que tuvo menos despachos en este mes de " + ZonedDateTime.now().getMonth() +" es "
        + productoMenosDespachado(despachos));
    }

    private String productoMenosDespachado(Lista_Despachos despachos) {
        int valor = 0;
        int indice= -1;
        int ind=0;
        int sumaProductos[] = new int[despachos.lista_despachos.size()];
        String arregloProductos[] = new String[despachos.lista_despachos.size()];
        for (int i =0; i < despachos.lista_despachos.size(); i++) {
            if(!Arrays.asList(arregloProductos).contains(despachos.lista_despachos.get(i).producto_Despachado)){
                arregloProductos[ind]= despachos.lista_despachos.get(i).producto_Despachado;
                ind++;
            }
        }
        for(int j=0; j <despachos.lista_despachos.size(); j++){
            for(int k =0 ; k<arregloProductos.length; k++){
                if(despachos.lista_despachos.get(j).producto_Despachado.equals(arregloProductos[k])){
                    sumaProductos[k] = sumaProductos[k]+despachos.lista_despachos.get(j).cantidad_despachada;
                }
            }
        }
        valor=sumaProductos[0];
        for(int i =0 ;i <sumaProductos.length ; i++){
            if(valor>sumaProductos[i] && sumaProductos[i]>0){
                valor=sumaProductos[i];
                indice=i;
            }
        }
        return arregloProductos[indice]+": "+valor;
    }

    public int cantidadDespachoxMes(Lista_Despachos despachos){
        int fecha[] = new int[3];
        int suma = 0;
        for(int i =0; i<despachos.lista_despachos.size(); i++){
            fecha=extraerFecha(despachos.lista_despachos.get(i).fecha_despacho);
            if(ZonedDateTime.now().getMonth().getValue()==fecha[1] && ZonedDateTime.now().getYear()==fecha[0]){
                suma += despachos.lista_despachos.get(i).cantidad_despachada ;
            }
        }
        return suma;
    }


    private int [] extraerFecha(String fecha) {
        String[] datos_separados = fecha.split("-");
        int [] fecha_separada = new int[3];
        fecha_separada[0] = Integer.parseInt(datos_separados[0]);
        fecha_separada[1] = Integer.parseInt(datos_separados[1]);
        fecha_separada[2] = Integer.parseInt(datos_separados[2]);
        return fecha_separada;
    }

    public String productoMayorDemanda(Lista_Despachos despachos){
        int valor = 0;
        int indice= -1;
        int ind=0;
        int sumaProductos[] = new int[despachos.lista_despachos.size()];
        String arregloProductos[] = new String[despachos.lista_despachos.size()];
        for (int i =0; i < despachos.lista_despachos.size(); i++) {
            if(!Arrays.asList(arregloProductos).contains(despachos.lista_despachos.get(i).producto_Despachado)){
                arregloProductos[ind]= despachos.lista_despachos.get(i).producto_Despachado;
                ind++;
            }
        }
        for(int j=0; j <despachos.lista_despachos.size(); j++){
            for(int k =0 ; k<arregloProductos.length; k++){
                if(despachos.lista_despachos.get(j).producto_Despachado.equals(arregloProductos[k])){
                    sumaProductos[k] = sumaProductos[k]+despachos.lista_despachos.get(j).cantidad_despachada;
                }
            }
        }
        for(int i =0 ;i <sumaProductos.length ; i++){
                if(valor<sumaProductos[i] ){
                    valor=sumaProductos[i];
                    indice=i;
                }
        }
        return arregloProductos[indice]+": "+valor;
    }
}
