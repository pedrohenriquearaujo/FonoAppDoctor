package com.example.unicap.model;

public class Paciente {

    private String nome;
    private int idade;
    private String sexo;
    private String descricao;

    public Paciente(String nome, int idade, String sexo, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
