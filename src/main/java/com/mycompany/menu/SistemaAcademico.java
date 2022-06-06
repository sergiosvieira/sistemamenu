package com.mycompany.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class SistemaAcademico {
    private TabelaAluno tabAluno = new TabelaAluno();
    private MenuPrincipal menuPrinc = new MenuPrincipal("Sistema Acadêmico");
    private Callable<Boolean> nada = ()->{return false;};
    SistemaAcademico() {
        criarMenuAluno();
        menuPrinc.adicItem(new Item(9, "Sair", nada));
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
