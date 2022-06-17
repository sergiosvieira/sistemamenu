package com.mycompany.menu;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.Date;

public class SistemaAcademico {
    private TabelaAluno tabAluno = new TabelaAluno();
    private TabelaDisciplina tabDisciplina = new TabelaDisciplina();
    private TabelaCurso tabCurso = new TabelaCurso();
    private TabelaVenda tabVenda = new TabelaVenda();
    private MenuPrincipal menuPrinc = new MenuPrincipal("Sistema Acadêmico");
    private Callable<Boolean> nada = ()->{return false;};
    SistemaAcademico() {
        criarMenuAluno();
        //tabAluno.criar(new Aluno(1, "Sérgio Vieira", new Date()));
        criarMenuDisciplina();
        criarMenuCurso();
        criarMenuVenda();
        menuPrinc.adicItem(new Item(9, "Sair", nada));
    }
    private void criarMenuVenda() {
        MenuVenda.setTabelaAluno(tabAluno);
        MenuVenda.setTabelaCurso(tabCurso);
        Item vendas = new Item(4, "Vendas", nada);
        List<Item> subitens = List.of(
            new Item(1, "Cadastrar", ()-> MenuVenda.cadastrar(tabVenda)),
            new Item(2, "Listar", ()-> MenuVenda.listar(tabVenda)),
            new Item(3, "Voltar", ()-> MenuPrincipal.voltar())
        );
        for(Item item: subitens) {
            vendas.adicSubitem(item);
        }
        menuPrinc.adicItem(vendas);        
    }
    private void criarMenuCurso() {
        Item alunos = new Item(3, "Curso", nada);
        List<Item> subitens = List.of(
            new Item(1, "Cadastrar", ()-> MenuCurso.cadastrar(tabCurso)),
            new Item(2, "Atualizar", ()-> MenuCurso.atualizar()),
            new Item(3, "Listar", ()-> MenuCurso.listar(tabCurso)),
            new Item(4, "Voltar", ()-> MenuPrincipal.voltar())
        );
        for(Item item: subitens) {
            alunos.adicSubitem(item);
        }
        menuPrinc.adicItem(alunos);
    }
    private void criarMenuDisciplina() {
        Item alunos = new Item(2, "Disciplinas", nada);
        List<Item> subitens = List.of(
            new Item(1, "Cadastrar", ()-> MenuDisciplina.cadastrar(tabDisciplina)),
            new Item(2, "Atualizar", ()-> MenuDisciplina.atualizar()),
            new Item(3, "Listar", ()-> MenuDisciplina.listar(tabDisciplina)),
            new Item(4, "Voltar", ()-> MenuPrincipal.voltar())
        );
        for(Item item: subitens) {
            alunos.adicSubitem(item);
        }
        menuPrinc.adicItem(alunos);    
    }
    private void criarMenuAluno() {
        Item alunos = new Item(1, "Alunos", nada);
        List<Item> subitens = List.of(
            new Item(1, "Cadastrar", ()-> MenuAluno.cadastrar(tabAluno)),
            new Item(2, "Atualizar", ()-> MenuAluno.atualizar()),
            new Item(3, "Listar", ()-> MenuAluno.listar(tabAluno)),
            new Item(4, "Voltar", ()-> MenuPrincipal.voltar())
        );
        for(Item item: subitens) {
            alunos.adicSubitem(item);
        }
        menuPrinc.adicItem(alunos);
    }
    public void iniciar() {
        menuPrinc.exibir();
    }
}
