package com.mycompany.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

class Item {
    private int index;
    private String rotulo;
    private final Callable<Boolean> comando;
    private final Map<Integer, Item> subitens;
    Item(int i, String rotulo, Callable<Boolean> comando) {
        this.subitens = new HashMap<>();
        this.index = i;
        this.rotulo = rotulo;
        this.comando = comando;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getRotulo() {
        return rotulo;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    public void adicSubitem(Item item) {
        this.subitens.put(item.getIndex(), item);
    }
    public boolean execute() {
        if (this.subitens.size() > 0) {
            MenuPrinter.exibir(rotulo, subitens);
        } else {
            try {
                return this.comando.call();
            } catch (Exception ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return String.format("%d - %s", getIndex(), getRotulo());
    }
}
