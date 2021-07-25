package ec.edu.epn.Proyecto.Inventario;

import ec.edu.epn.Proyecto.Listas.Lista_Productos;

import java.io.IOException;


public class Despacho_Productos {
    public void dispatch_information() {
        System.out.println(producto_Despachado +"\t\t\t\t\t" +
                cantidad_despachada + "\t\t\t\t\t\t\t\t\t" +
                fecha_despacho);
    }


    public int codigo;
     public String producto_Despachado;
     public int cantidad_despachada;
     public String fecha_despacho;
    public Verificador verificar = new Verificador();
   Fecha fecha = new Fecha();

    public void registrar_Despacho(int codigo_producto, int cantidad_despachar, Lista_Productos inventario ){
    this.codigo=codigo_producto;
    this.cantidad_despachada=cantidad_despachar;
    this.producto_Despachado=inventario.productos.get(codigo-1).nombre;
    this.fecha_despacho= fecha.FechaActual();
    }

    public Despacho_Productos(String producto_Despachado, int cantidad_despachada, String fecha_despacho) {
        this.producto_Despachado = producto_Despachado;
        this.cantidad_despachada = cantidad_despachada;
        this.fecha_despacho = fecha_despacho;
    }

    public Despacho_Productos() {
    }

    public void disminuirStock(Lista_Productos inventario) throws IOException {
        int cantidad_inicial =inventario.productos.get(this.codigo-1).cantidad;
        if(verificar.verificarCantidad_Retiro(this.cantidad_despachada,cantidad_inicial)==true){
            inventario.productos.get(codigo-1).cantidad= cantidad_inicial-this.cantidad_despachada;
            inventario.GuardarDatos();
    }






    }


}
