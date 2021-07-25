package ec.edu.epn.Proyecto.Reportes;

import ec.edu.epn.Proyecto.Inventario.Fecha;
import ec.edu.epn.Proyecto.Listas.Lista_Productos;

public class ReporteProductos {






    public class Reporte {
        public Fecha fecha;
        public ValidadorReportes vr;
        public Reporte() {
            fecha=new Fecha();
            vr=new ValidadorReportes();
        }


        public void reporteProductos(Lista_Productos listaproductos){
            System.out.println("Reporte Clientes");
            System.out.println("codigo\t\t\t nombre\t\t\t precio\t\t\t cantidad\t\t\t tipo_producto\t\t\t fecha expiracion");
            for(int i=0; i<listaproductos.productos.size(); i++){
                System.out.println(listaproductos.productos.get(i).codigo +"\t\t\t" + listaproductos.productos.get(i).nombre +"\t\t\t" + listaproductos.productos.get(i).precio + "\t\t\t" +
                        "\t\t\t" + listaproductos.productos.get(i).cantidad + "\t\t\t"+
                        "\t\t\t" + listaproductos.productos.get(i).tipo_Producto + "\t\t\t" + listaproductos.productos.get(i).FechaExpiracion);
            }
            System.out.println("El valor del inventario actual es: "+vr.totalProductos(listaproductos));
            System.out.println("El numero de productos expirados es: "+vr.productosExpirados(listaproductos));

        }





        }
    }

