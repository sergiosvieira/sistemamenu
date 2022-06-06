package com.mycompany.menu;

import java.util.Date;

class MenuAluno {
    public static boolean cadastrar(TabelaAluno ta) {
        System.out.println("Cadastrar Aluno");
        MenuPrinter.separador(80);
        String nome = Keyin.inStr("Nome do aluno: ");
        Date dataNasc = Keyin.inDate("Data de nasc. (dd/MM/yyyy): ", "dd/MM/yyyy");
        return ta.criar(new Aluno(ta.tamanho() + 1, nome, dataNasc));
    }
    public static boolean atualizar() {
        System.out.println("***** Atualizar Aluno\n\n");
        return true;
    }
    public static boolean listar(TabelaAluno ta) {
        System.out.println("Listagem dos Alunos");
        MenuPrinter.separador(80);
        System.out.println(ta.listar());
        MenuPrinter.separador(80);
        return true;
    }
}
