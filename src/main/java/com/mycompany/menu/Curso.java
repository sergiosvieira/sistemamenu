package com.mycompany.menu;

public class Curso extends Entidade {
    Curso(int codigo, String nome, int totalCreditos, float preco) {
        super.setCodigo(codigo);
        this.nome = nome;
        this.totalCreditos = totalCreditos;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTotalCreditos() {
        return totalCreditos;
    }
    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
    @Override
    public String toString() {
        return String.format("Código: %d - Nome: %s - Total Créditos: %d - Preço: %.2f",
                this.getCodigo(), 
                this.getNome(), 
                this.getTotalCreditos(),
                this.getPreco());
    }
    private String nome;
    private int totalCreditos = 0;
    private float preco = 0.0f;
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
