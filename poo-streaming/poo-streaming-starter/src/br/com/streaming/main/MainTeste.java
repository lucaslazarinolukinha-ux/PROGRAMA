package br.com.streaming.main;

import br.com.streaming.model.Categoria;
import br.com.streaming.model.Usuario;
import br.com.streaming.model.Video;
import br.com.streaming.financeiro.Assinatura;
import java.math.BigDecimal;
import java.time.LocalDate;
public class MainTeste {
    public static void main(String[] args) {
        System.out.println("===Sistema de Streaming===");
        Usuario usuario = new Usuario();
        System.out.println("Usuário criado: " + usuario.getNome());

        Categoria categoria = new Categoria("Ação", 16);
        Video video = new Video("Filme Exemplo", 120);
        video.setCategoria(categoria);
        usuario.assistirVideo(video);

        System.out.println("Último vídeo assistido: " + usuario.getHistoricoAssistidos());

        CartaodeCredito cartao = new CartaodeCredito();
        Assinatura assinatura = new Assinatura(LocalDate.now(), new BigDecimal("29.90"));
        assinatura.setCartao(cartao);
        assinatura.setUsuario(usuario);

        System.out.println("Assinatura criada: " + assinatura);
    }
}