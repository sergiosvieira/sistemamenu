package com.mycompany.menu;

import java.util.Date;

public class MenuVenda {
    static TabelaAluno ta;
    static TabelaCurso tc;
    public static void setTabelaAluno(TabelaAluno tabAluno) {
        ta = tabAluno;
    }
    public static void setTabelaCurso(TabelaCurso tabCurso) {
        tc = tabCurso;
    }    
    public static boolean cadastrar(TabelaVenda tv) {
        System.out.println("Cadastrar Venda");
        MenuPrinter.separador(80);
        System.out.println(ta.listar());
        boolean continua = true;
        Aluno aluno = null;
        Curso curso = null;
        while (continua) {
            int codAluno = Keyin.inInt("Código Aluno (0 - sair): ");
            aluno = (Aluno) ta.ler(codAluno);
            if (aluno != null) {
                break;
            }
            if (codAluno == 0) {
                continua = false;
                break;
            }
        }
        System.out.println(tc.listar());
        while (continua) {
            int codCurso = Keyin.inInt("Código do Curso (0 - sair):");
            curso = (Curso) tc.ler(codCurso);
            if (curso != null) {
                return tv.criar(new Venda(tv.tamanho() + 1, aluno, curso));
            }
            if (codCurso == 0) {
                return false;
            }
        }
        return false;
//return ta.criar(new Aluno(ta.tamanho() + 1, nome, dataNasc));
    }
    public static boolean atualizar() {
        System.out.println("***** Atualizar Venda\n\n");
        return true;
    }
    public static boolean listar(TabelaVenda tv) {
        System.out.println("Listagem das Vendas");
        MenuPrinter.separador(80);
        System.out.println(tv.listar());
        MenuPrinter.separador(80);
        return true;
    }
    
}
