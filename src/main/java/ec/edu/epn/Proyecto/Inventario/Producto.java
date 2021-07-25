package ec.edu.epn.Proyecto.Inventario;

public class Producto {

    public String nombre;
    public double precio;
    public String proveedor;
    public int cantidad;
    public String marca ;
    public String tipo_Producto;
    public String FechaExpiracion;
    public String codigo;

    public void product_Information() {
        System.out.println(codigo +"\t\t\t" + nombre +"\t\t\t" + precio + "\t\t\t" +
                proveedor +"\t\t\t" + cantidad + "\t\t\t" + marca +
                "\t\t\t" + tipo_Producto + "\t\t\t" + FechaExpiracion);
    }
    public Producto(){

    }
   public void registrarProducto(String codigo, String nombre, double precio , String proveedor, int cantidad , String marca , String tipo_Producto,
                    String fecha){
        this.codigo= codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.proveedor=proveedor;
        this.cantidad=cantidad;
        this.marca=marca;
        this.tipo_Producto=tipo_Producto;
        this.FechaExpiracion= fecha;

    }


}
