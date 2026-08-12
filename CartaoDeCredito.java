package br.com.streaming.financeiro;

public class CartaoDeCredito implements IPagamento {
    private String numero;
    private double limite;

    public CartaoDeCredito(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    @Override
    public void efetuarpagamento(double valor) {
        System.out.println("Conectando com a adquirente...");
        System.out.println("Aprovando transação de R$ " + valor + " no Cartão.");
    }

    public String getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void efetuarPagamento(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'efetuarPagamento'");
    }
}

