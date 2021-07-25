package ec.edu.epn.Proyecto.Listas;
import ec.edu.epn.Proyecto.Facturacion.Factura;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lista_FacturasTest {
    Lista_Facturas invoiceList ;
    Factura invoice1 =new Factura("848-345-423434532","supermaxi",45.56,"10/10/2020");
    Factura invoice2 =new Factura("123-345-345654564","tia",70,"08/10/2021");
    Factura invoice3 =new Factura("546-345-345654564","tia",34.87,"07/08/2021");
    @Before
    public void setup(){
        invoiceList =new Lista_Facturas();
        invoiceList.invoices.add(invoice1);
        invoiceList.invoices.add(invoice2);

    }
    @Test
    public void given_invoice_id_when_invoice_search_then_ok(){
        assertEquals(invoice1, invoiceList.searchInvoice("848-345-423434532"));
    }

    @Test
    public void given_invoice_when_invoice_add_then_ok(){
        assertEquals("Factura registrada con exito", invoiceList.addInvoice(invoice3));
    }

    @Test
    public void given_invoice_already_register_when_invoice_add_then_ok(){
        assertEquals("Id de factura ya registrado", invoiceList.addInvoice(invoice2));
    }
}