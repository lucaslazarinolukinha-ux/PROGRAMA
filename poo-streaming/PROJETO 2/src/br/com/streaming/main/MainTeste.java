package br.com.streaming.main;
import br.com.streaming.model.Usuario;
// TODO: Fazer imports das classes dos pacotes model e financeiro

public class MainTeste {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE STREAMING ===");
        // TODO: Testes da Aula 2 e 3
        Usuario u1 = new Usuario();
        u1.setNome("João Silva");
        u1.setEmail("joao@gmail.com");

        System.out.println(u1);
    }
}
