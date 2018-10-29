package model;

import java.util.Optional;

public class Motorista {
    private String nome;
    private Integer idade;
    private Caminhao caminhao;

    public Motorista(String nome, Integer idade, Caminhao caminhao) {
        this.nome = nome;
        this.idade = idade;
        this.caminhao = caminhao;
    }

    public Motorista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public Optional<String> getNomeOptional(){
        return Optional.ofNullable(nome);
    }

    public Optional<Integer> getIdadeOptional(){
        return Optional.ofNullable(idade);
    }

    public Optional<Caminhao> getCaminhoOptional(){
        return Optional.ofNullable(caminhao);
    }
}
