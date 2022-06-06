package com.mycompany.menu;

import java.util.ArrayList;

public class Tabela {
    ArrayList<Entidade> tabela = new ArrayList<>();
    public int tamanho() {
        return tabela.size();
    }
    public boolean criar(Entidade e) {
        // Checa se há códigos repetidos
        for (int i = 0; i < tabela.size(); ++i) {
            Entidade ent = tabela.get(i);
            if (ent.getCodigo() == e.getCodigo()) {
                return false;
            }
        }
        tabela.add(e);
        return true;
    }
    public Entidade atualizar(int codigo) {
        return null;
    }
    public Entidade ler(int codigo) {
        return null;
    }
    public boolean apagar(int codigo) {
        return false;
    }    
    public String listar() {
        return "";
    }
}
