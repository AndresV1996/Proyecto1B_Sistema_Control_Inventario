package ec.edu.epn.Proyecto.Facturacion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FacturaTest {
    private Factura invoice;
    @Before
    public void setup(){
        invoice =new Factura();
    }

    @Test
    public void given_one_doubles_when_calculateIva_then_ok(){
        assertEquals(40.8744,invoice.calculateIva(340.62),0);
    }

    @Test
    public void given_two_doubles_when_calculateTotal_then_ok(){
        assertEquals(381.4944,invoice.calculateTotal(340.62,40.8744),0);
    }
}