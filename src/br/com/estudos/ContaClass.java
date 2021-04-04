package br.com.estudos;

public class ContaClass {
    private Integer numConta = 0;
    private String nomeConta = "";
    protected Double saldoConta = 0.0;

    public ContaClass() {
    }

    public ContaClass(Integer numConta, String nomeConta) {
        this.numConta = numConta;
        this.nomeConta = nomeConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void deposito(Double valor) {
        saldoConta += valor;
    }

    public void saque(Double valor) {
        saldoConta -= valor + 5.00;
    }


}
