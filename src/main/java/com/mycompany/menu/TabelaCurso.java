package com.mycompany.menu;

public class TabelaCurso extends Tabela {
    @Override
    public String listar() {
        String resultado = "";
        for (int i = 0; i < tabela.size(); ++i) {
            Curso c = (Curso) tabela.get(i);
            resultado += c;
            resultado += "\n";
        }
        return resultado;
    }    
}
