package br.com.estudos;

public class ContaPoupancaClass extends ContaClass{

    public ContaPoupancaClass() {
        super();
    }

    public ContaPoupancaClass(Integer numConta, String nomeConta) {
        super(numConta, nomeConta);
    }

    @Override
    public void saque(Double valor) {
        saldoConta -= valor;
    }
}
