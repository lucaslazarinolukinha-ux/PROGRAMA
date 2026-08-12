package br.com.streaming.financeiro;

public interface IPagamento {
     void efetuarPagamento (double valor);

     @Override
     int hashCode();

     @Override
     String toString();

     void efetuarpagamento(double valor);
}
