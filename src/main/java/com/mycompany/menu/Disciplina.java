package com.mycompany.menu;

public class Disciplina extends Entidade {
    Disciplina(int codigo, String nome, int creditos) {
        super.setCodigo(codigo);
        this.nome = nome;
        this.creditos = creditos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    @Override
    public String toString() {
        return String.format("Código: %d - Nome: %s - Créditos.: %d",
                this.getCodigo(), 
                this.getNome(), 
                this.getCreditos());
    }
    private String nome;
    private int creditos;
}
