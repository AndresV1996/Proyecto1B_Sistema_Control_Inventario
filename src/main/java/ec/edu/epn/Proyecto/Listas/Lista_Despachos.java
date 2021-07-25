package ec.edu.epn.Proyecto.Listas;

import ec.edu.epn.Proyecto.Inventario.Despacho_Productos;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lista_Despachos {

    public ArrayList<Despacho_Productos> lista_despachos = new ArrayList<Despacho_Productos>();

    public void añadirDespacho(Despacho_Productos despachos){
        lista_despachos.add(despachos);
    }
    public void GuardarDatosDespacho() throws IOException {
        File ArchivoDespachos = new File("Control_Despachos.txt");
        try {
            BufferedWriter escritura_Despachos = new BufferedWriter(new FileWriter(ArchivoDespachos));
            for (int i =0; i< lista_despachos.size();i++){
                escritura_Despachos.write(lista_despachos.get(i).producto_Despachado + "," +
                        lista_despachos.get(i).cantidad_despachada + "," + lista_despachos.get(i).fecha_despacho + "\n");

            }
            escritura_Despachos.close();
        }
        catch (ExceptionInInitializerError e){
            System.out.println(e);
        }
    }
    public void LeerDatos_Despacho() throws IOException{
        File ArchivoDespacho = new File("Control_Despachos.txt");
        try {
            BufferedReader lectura = new BufferedReader(new FileReader(ArchivoDespacho));
            String linea;
            while(lectura.ready()){

                linea=lectura.readLine();
                StringTokenizer st=new StringTokenizer(linea,",");
                String  producto =st.nextToken();
                int cantidad =Integer.parseInt(st.nextToken());
                String fecha =st.nextToken();
                Despacho_Productos despachos = new Despacho_Productos(producto, cantidad, fecha);
                this.lista_despachos.add(despachos);
            }
            lectura.close();
        }
        catch (ExceptionInInitializerError e){
            System.out.println(e);
        }
    }

    public void mostrarDespachos(){
        System.out.println("-------------------DESPACHOS-------------------------");
        System.out.println("Producto\t\t\t\t\t cantidad_despachada\t\t\t\t\t fecha de retiro");

        for(int i=0; i< lista_despachos.size(); i++){
            Despacho_Productos despacho = new Despacho_Productos();
            despacho= lista_despachos.get(i);
            despacho.dispatch_information();

        }
    }




}
