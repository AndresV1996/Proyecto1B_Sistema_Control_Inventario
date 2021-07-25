package ec.edu.epn.Proyecto.Inventario;

public class Proveedor {
    public String RUC;
    public String razon_Social;
    public String direccion;
    public String n_cuenta;

    public Proveedor(String RUC, String razon , String direccion , String n_cuenta){
        this.RUC=RUC;
        this.razon_Social=razon;
        this.direccion=direccion;
        this.n_cuenta=n_cuenta;
    }

    public String getRazon_Social() {
        return razon_Social;
    }


}
