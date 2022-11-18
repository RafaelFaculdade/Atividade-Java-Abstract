package heranca;

public class ContaPoupanca extends Conta{

     @override
        public double getSaldo() {

    private float taxadesaque;

    public float getTaxadesaque() {
        return taxadesaque;

    }

    public void setTaxadesaque(float taxadesaque) {
        this.taxadesaque = taxadesaque;

    }

    @Override
    public void saque (double valor) {
        super.saque(valor+this.taxadesaque);

    }

    @Override
    public double getSaldo()  {

    }

    }


