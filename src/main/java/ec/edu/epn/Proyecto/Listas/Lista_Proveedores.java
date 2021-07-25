package ec.edu.epn.Proyecto.Listas;

import ec.edu.epn.Proyecto.Inventario.Proveedor;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lista_Proveedores {

    public boolean existenciaProveedor(String nombre_proveedor){
        for(int i = 0; i< this.proveedores.size(); i++ ) {
            if (nombre_proveedor.equals(this.proveedores.get(i).getRazon_Social()) ) {
                return false;
            }
        }
        return true ;
    }
    public ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();

        public void añadirProveedor(Proveedor proveedor){
           proveedores.add(proveedor);
        }

    public void mostrarProveedores() {
        System.out.println("--------------------PROVEEDORES REGISTRADOS-------------------------");
        System.out.println("RUC\t\t\t\t\t Razón Social\t\t\t\t\t dirección\t\t\t\t Cuenta");

        for(int i = 0; i < this.proveedores.size(); ++i) {
            PrintStream var10000 = System.out;
            String var10001 = ((Proveedor)this.proveedores.get(i)).RUC;
            var10000.println(var10001 + "\t\t\t" + ((Proveedor)this.proveedores.get(i)).razon_Social + "\t\t\t" + ((Proveedor)this.proveedores.get(i)).direccion + "\t\t\t" + ((Proveedor)this.proveedores.get(i)).n_cuenta);
        }

    }

        public void GuardarDatos() throws IOException {
            File ArchivoProveedores = new File("Proveedores.txt");
            try {
                BufferedWriter escritura = new BufferedWriter(new FileWriter(ArchivoProveedores));
                for (int i =0; i< proveedores.size();i++){
                    escritura.write(proveedores.get(i).RUC + "," + proveedores.get(i).razon_Social + "," +
                            proveedores.get(i).direccion + "," + proveedores.get(i).n_cuenta + "\n");

                }
                escritura.close();
            }
            catch (ExceptionInInitializerError e){
                System.out.println(e);
            }



        }

        public void LeerDatos() throws IOException{
            File ArchivoProveedores = new File("Proveedores.txt");
            try {
                BufferedReader lectura = new BufferedReader(new FileReader(ArchivoProveedores));
                String linea;
                while(lectura.ready()){

                    linea=lectura.readLine();
                    StringTokenizer st=new StringTokenizer(linea,",");
                    String  RUC =st.nextToken();
                    String razon_social =st.nextToken();
                    String direccion =st.nextToken();
                            //Integer.parseInt(st.nextToken());
                    String n_cuenta = st.nextToken();
                    Proveedor proveedor = new Proveedor(RUC,razon_social,direccion,n_cuenta);
                    this.proveedores.add(proveedor);
                }
                /*for (int i =0; i< proveedores.size();i++){
                    escritura.write(proveedores.get(i).RUC + "," + proveedores.get(i).razon_Social + "," +
                            proveedores.get(i).direccion + "," + proveedores.get(i).n_cuenta + "\n");

                }*/
                lectura.close();
            }
            catch (ExceptionInInitializerError e){
                System.out.println(e);
            }
        }


}


