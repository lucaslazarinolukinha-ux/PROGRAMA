package br.com.streaming.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.com.streaming.financeiro.Assinatura;
// import br.com.streaming.model.Usuario; // Necessário import devido a pacotes diferentes!
import br.com.streaming.main.CartaodeCredito;
import br.com.streaming.model.Usuario;

public class Assinatura {
    private LocalDate dataInicio;
    private double valor;
    private CartaoDeCredito cartao;
    // private Usuario usuario;

    public Assinatura(LocalDate now, BigDecimal valor2) {
        //TODO Auto-generated constructor stub
    }

    public void setCartao(CartaodeCredito cartao2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCartao'");
    }

    public void setUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUsuario'");
    }
}
