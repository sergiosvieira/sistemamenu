package com.mycompany.menu;

public class TabelaAluno extends Tabela {
    @Override
    public String listar() {
        String resultado = "";
        for (int i = 0; i < tabela.size(); ++i) {
            Aluno c = (Aluno) tabela.get(i);
            resultado += c;
            resultado += "\n";
        }
        return resultado;
    }
}
