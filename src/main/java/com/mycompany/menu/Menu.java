package com.mycompany.menu;

import java.util.concurrent.Callable;

public class Menu {
    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal("Sistema Acadêmico");
        Callable<Boolean> nada = ()->{return false;};
        Item it1 = new Item(1, "Alunos", nada);
        it1.adicSubitem(new Item(1, "Cadastrar", 
                ()-> MenuAluno.cadastrar()));
        it1.adicSubitem(new Item(2, "Atualizar", 
                ()-> MenuAluno.atualizar()));
        it1.adicSubitem(new Item(3, "Voltar", 
                ()-> MenuPrincipal.voltar()));
        Item it2 = new Item(2, "Disciplinas", nada);
        it2.adicSubitem(new Item(1, "Cadastrar", 
                ()-> MenuDisciplina.cadastrar()));
        it2.adicSubitem(new Item(2, "Atualizar", 
                ()-> MenuDisciplina.atualizar()));
        it2.adicSubitem(new Item(3, "Voltar", 
                () -> MenuPrincipal.voltar()));  
        mp.adicItem(it1);
        mp.adicItem(it2);
        mp.adicItem(new Item(3, "Sair", 
                ()->MenuPrincipal.sair()));
        mp.exibir();
    }
}
