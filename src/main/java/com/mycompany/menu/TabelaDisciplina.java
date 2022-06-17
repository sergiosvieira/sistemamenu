package com.mycompany.menu;

public class TabelaDisciplina extends Tabela {
@Override
    public String listar() {
        String resultado = "";
        for (int i = 0; i < tabela.size(); ++i) {
            Disciplina c = (Disciplina) tabela.get(i);
            resultado += c;
            resultado += "\n";
        }
        return resultado;
    }   
}
