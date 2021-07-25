package ec.edu.epn.Proyecto.Facturacion;

public class Presupuesto {
    public String month;
    public double budgetInventary;

    public Presupuesto(String month, double budgetInventary) {
        this.month = month;
        this.budgetInventary = budgetInventary;
    }

    public  double decreaseBudget(Factura invoice){
        this.budgetInventary =this.budgetInventary - invoice.total;
        return this.budgetInventary;
    }
}
