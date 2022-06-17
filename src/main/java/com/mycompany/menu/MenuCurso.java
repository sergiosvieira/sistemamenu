package com.mycompany.menu;

import java.util.Date;

public class MenuCurso {
    public static boolean cadastrar(TabelaCurso tc) {
        System.out.println("Cadastrar Curso");
        MenuPrinter.separador(80);
        String nome = Keyin.inStr("Nome do Curso: ");
        int totalCreditos = Keyin.inInt("Total de Créditos: ");
        float preco = (float) Keyin.inInt("Preco: ");
        return tc.criar(new Curso(tc.tamanho() + 1, 
                nome, 
                totalCreditos,
                preco));
    }
    public static boolean atualizar() {
        System.out.println("***** Atualizar Curso\n\n");
        return true;
    }
    public static boolean listar(TabelaCurso tc) {
        System.out.println("Listagem dos Cursos");
        MenuPrinter.separador(80);
        System.out.println(tc.listar());
        MenuPrinter.separador(80);
        return true;
    }
    
}
