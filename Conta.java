public abstract class Conta {

private double saldo;
private String nome;

public String getNome () (
    return nome;
}

public void setNome (String nome) {
    this.nome = nome;
}

public double getValorSaldo() {
    return saldo;
}



public abstract double getSaldo();

public void setSaldo (double saldo) {
    this.saldo = saldo;
}

public void saque (double valor) {
    if(valor<=this.saldo) {
        this.saldo=this.saldo-valor;
    }
}



}