package com.mycompany.menu;

import java.util.Map;

public class MenuPrinter {
    public static void separador(int tamanho) {
        for (int i = 0; i < tamanho; ++i) {
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void exibir(String titulo,
            Map<Integer, Item> itens) {
        boolean ativo = true;
        while (ativo) {
            System.out.println(titulo);
            MenuPrinter.separador(titulo.length());
            for(Item i : itens.values()) {
                System.out.println(i);
            }
            int opcao = Keyin.inInt("Escolha uma das opções: ");
            ativo = itens.get(opcao).execute();
        }        
    }
}
