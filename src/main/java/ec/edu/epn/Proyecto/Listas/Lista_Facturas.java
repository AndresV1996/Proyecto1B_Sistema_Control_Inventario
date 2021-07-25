package ec.edu.epn.Proyecto.Listas;

import ec.edu.epn.Proyecto.Facturacion.Factura;

import java.util.ArrayList;

public class Lista_Facturas {
    public ArrayList<Factura> invoices;

    public Lista_Facturas() {
        this.invoices = new ArrayList<>();
    }


    public String addInvoice(Factura invoice){
        for(int i = 0; i<this.invoices.size(); i++){
            if(invoice.invoiceId.equals(this.invoices.get(i).invoiceId)){
                return "Id de factura ya registrado";
            }
        }
        this.invoices.add(invoice);
        return "Factura registrada con exito";
    }



    /*public Invoice searchInvoice(String invoiceId){
       for(int i = 0; i<this.invoices.size(); i++){
           if(invoiceId.equals(this.invoices.get(i).invoiceId)){
               return this.invoices.get(i);
           }
        }
        return null;
    }*/

    public Factura searchInvoice(String invoiceId){
        Factura invoice = new Factura();
        for(int i = 0; i<this.invoices.size(); i++){
            if(invoiceId.equals(this.invoices.get(i).invoiceId)){
                invoice =this.invoices.get(i);
            }
        }
        return invoice;
    }



    public void showInvoices(){
        System.out.println("invoiceId "+ "provider "+ "subtotal "+ "iva "+ "total "+ "date");
        for(int i=0; i<invoices.size(); i++){
            Factura invoice=new Factura();
            invoice=invoices.get(i);
            invoice.mostrarFactura();
        }
    }

}
