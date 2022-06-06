package com.mycompany.menu;

import java.util.HashMap;
import java.util.Map;

class MenuPrincipal {
    private Map<Integer, Item> itens;
    private String titulo;
    MenuPrincipal(String titulo) {
        this.itens = new HashMap<>();
        this.titulo = titulo;
    }
    public void exibir() {
        MenuPrinter.exibir(titulo, itens);
    }
    public static boolean voltar() {
        return false;
    }
    public static boolean sair() {
        return false;
    }
    public void adicItem(Item item) {
        this.itens.put(item.getIndex(), item);
    }
}
