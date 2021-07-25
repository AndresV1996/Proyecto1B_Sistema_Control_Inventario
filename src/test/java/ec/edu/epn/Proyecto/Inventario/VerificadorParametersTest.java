package ec.edu.epn.Proyecto.Inventario;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class VerificadorParametersTest {
    private String invoiceID; private boolean expected; private Verificador validator;
    @Before
    public void setup(){
        validator=new Verificador();
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects=new ArrayList<Object[]>();
        objects.add(new Object[]{"123-978-958645837",true});
        objects.add(new Object[]{"998-978-958645837",true});
        objects.add(new Object[]{"001-978-958645837",true});
        objects.add(new Object[]{"002-978-958645837",true});
        objects.add(new Object[]{"003-978-958645837",true});
        objects.add(new Object[]{"0048-978-958645837",false});
        objects.add(new Object[]{"wer-978-958645837",false});
        objects.add(new Object[]{"003-9-9586458",false});
        return objects; }
    public VerificadorParametersTest(String invoiceID, boolean expected) {
        this.invoiceID = invoiceID;
        this.expected = expected; }

    @Test
    public void given_invoice_id_when_validation_then_ok(){
        assertEquals(validator.validateInvoiceId(invoiceID),expected);
    }
}