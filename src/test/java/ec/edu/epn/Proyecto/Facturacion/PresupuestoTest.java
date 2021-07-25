package ec.edu.epn.Proyecto.Facturacion;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class PresupuestoTest {
    Presupuesto budget;
    @Before
    public void setup(){
        budget =new Presupuesto("04/08/2021",987.67);
    }
    @Test
    public void given_two_doubles_when_descreaseBudget_then_ok(){
        Factura invoice =new Factura("123-345-345654564","tia",70,"08/10/2021");
        assertEquals(909.27,budget.decreaseBudget(invoice),0);

    }
}