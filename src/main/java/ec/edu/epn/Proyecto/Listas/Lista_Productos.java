package ec.edu.epn.Proyecto.Listas;

import ec.edu.epn.Proyecto.Inventario.Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lista_Productos {

    public void modificarStock(int codigo , int cantidad) throws IOException {
        productos.get(codigo-1).cantidad +=cantidad;
        GuardarDatos();
    }

    public void mostrarProductos(){
        System.out.println("-------------------------------------------------------PRODUCTOS-------------------------------------------------");
        System.out.println("codigo\t\t\t nombre\t\t\t precio\t\t\t proveedor\t\t\t\t\t cantidad\t\t\t marca\t\t\t tipo_producto\t\t\t fecha expiracion");

        for(int i=0; i<productos.size(); i++){
            productos.get(i).product_Information();

        }
    }



    public ArrayList<Producto> productos = new ArrayList<Producto>();

    public void añadirProducto(Producto producto){
       productos.add(producto);
        System.out.println( "Producto registrado con exito  ");
    }

    public void GuardarDatos() throws IOException {
        File ArchivoProductos = new File("Productos.txt");
        try {
            BufferedWriter escritura = new BufferedWriter(new FileWriter(ArchivoProductos));
            for (int i =0; i< productos.size();i++){
                escritura.write(productos.get(i).nombre +"," + productos.get(i).precio + "," +
                        productos.get(i).proveedor +"," + productos.get(i).cantidad + "," + productos.get(i).marca
                + "," + productos.get(i).tipo_Producto + "," + productos.get(i).FechaExpiracion+"\n");

            }
            escritura.close();
        }
        catch (ExceptionInInitializerError e){
            System.out.println(e);
        }
    }



}
