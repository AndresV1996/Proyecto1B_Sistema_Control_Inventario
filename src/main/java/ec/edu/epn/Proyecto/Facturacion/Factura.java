package ec.edu.epn.Proyecto.Facturacion;

public class Factura {
    public void mostrarFactura(){
        System.out.println(invoiceId+ provider + subtotal+ iva+ total + date);
}


    public String invoiceId;
    public String provider;
    public double subtotal;
    public double iva;
    public double total;
    public String date;

    public Factura(String invoiceId, String provider, double subtotal, String date) {
        this.invoiceId = invoiceId;
        this.provider = provider;
        this.subtotal=subtotal;
        this.iva= calculateIva(this.subtotal);
        this.total = calculateTotal(this.subtotal,this.iva);
        this.date=date;
    }

    public Factura() {
    }

    public double calculateIva(double subtotal){
        return subtotal*(0.12);
    }

    public double calculateTotal(double subtotal, double iva){
        return subtotal+iva;
    }



    public String getInvoiceId() {
        return invoiceId;
    }
}
