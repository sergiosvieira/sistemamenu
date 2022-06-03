package com.mycompany.menu;

import java.util.Collection;
import java.util.Map;

public class MenuPrinter {
    public static void exibir(String titulo,
            Map<Integer, Item> itens) {
        boolean ativo = true;
        while (ativo) {
            System.out.println(titulo);
            for (int i = 0; i < titulo.length(); ++i) {
                System.out.print("-");
            }
            System.out.println("");
            for(Item i : itens.values()) {
                System.out.println(i);
            }
            int opcao = Keyin.inInt("Escolha uma das opções: ");
            ativo = itens.get(opcao).execute();
        }        
    }
}
