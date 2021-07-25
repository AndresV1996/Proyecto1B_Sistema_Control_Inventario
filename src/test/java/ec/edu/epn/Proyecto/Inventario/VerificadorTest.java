package ec.edu.epn.Proyecto.Inventario;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VerificadorTest {
    Verificador validator;
    @Before
    public void setup(){
        validator =new Verificador();
    }
    @Test
    public void given_invoice_id_when_validation_then_ok(){
        assertTrue(validator.validateInvoiceId("123-978-958645837"));
    }

    @Test
    public void given_invoice_invalid_id_when_validation_then_ok(){
        assertFalse(validator.validateInvoiceId("123-978-9586458"));
    }

    @Test
    public void given_invoice_date_when_validation_date_then_ok(){
        assertEquals(true,validator.correctDate("05/10/2021"));
    }
}