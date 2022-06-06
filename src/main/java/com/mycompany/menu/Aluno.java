package com.mycompany.menu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Entidade {
    Aluno(int codigo,
          String nome, 
          Date dataNasc) {
        super.setCodigo(codigo);
        this.nome = nome;
        this.dataNascimento = dataNasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento(String formato) {
        SimpleDateFormat fmt = new SimpleDateFormat(formato);
        return fmt.format(dataNascimento);
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return String.format("Código: %d - Nome: %s - Data Nasc.: %s",
                this.getCodigo(), 
                this.getNome(), 
                this.getDataNascimento("dd/MM/yyyy"));
    }
    private String nome;
    private Date dataNascimento;
}
