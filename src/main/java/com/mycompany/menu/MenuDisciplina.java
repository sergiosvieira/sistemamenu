package com.mycompany.menu;

import java.util.Date;

class MenuDisciplina {
    public static boolean cadastrar(TabelaDisciplina td) {
        System.out.println("Cadastrar Disciplina");
        MenuPrinter.separador(80);
        String nome = Keyin.inStr("Nome da disciplina: ");
        int creditos = Keyin.inInt("Créditos: ");
        return td.criar(new Disciplina(td.tamanho(), 
                nome, creditos));
    }
    public static boolean atualizar() {
        System.out.println("***** Atualizar Disciplina\n\n");
        return true;
    }
    public static boolean listar(TabelaDisciplina td) {
        System.out.println("Listagem das Disciplinas");
        MenuPrinter.separador(80);
        System.out.println(td.listar());
        MenuPrinter.separador(80);
        return true;
    }
   
}
