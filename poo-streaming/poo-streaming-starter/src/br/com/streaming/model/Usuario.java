package br.com.streaming.model;

import java.time.LocalDate;

// TODO: Importar List e ArrayList

public class Usuario {
    // TODO: Aula 3 - Criar constante NOME_PLATAFORMA (static final)
    // TODO: Aula 3 - Criar contadorUsuarios (static)

    private String email;
    private String nome;
    private boolean ativo;
    @Override
public String toString() {
return "Usuario{" +
"nome='" + nome + '\'' +
", email='" + email + '\'' +
'}';
}
    // TODO: Associação 1..* - Criar Lista de Videos (historicoAssistidos)

    public void assistirVideo(Video v) {
        // TODO: Adicionar o vídeo na lista de histórico
    }
    // TODO: Gerar Getters, Setters, equals(), hashCode() e toString()

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getHistoricoAssistidos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHistoricoAssistidos'");
    }



}
