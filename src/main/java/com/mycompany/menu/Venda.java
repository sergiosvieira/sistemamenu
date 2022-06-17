package com.mycompany.menu;

public class Venda extends Entidade {
    Venda(int codigo, Aluno aluno, Curso curso) {
        super.setCodigo(codigo);
        this.aluno = aluno;
        this.curso = curso;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return String.format("Aluno: %s\nCurso: %s",
                this.getAluno(), 
                this.getCurso());
    }
    private Aluno aluno;
    private Curso curso;
}
