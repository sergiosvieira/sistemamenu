package com.mycompany.menu;

public class TabelaVenda extends Tabela {
    @Override
    public String listar() {
        String resultado = "";
        float total = 0.0f;
        for (int i = 0; i < tabela.size(); ++i) {
            Venda v = (Venda) tabela.get(i);
            resultado += v;
            resultado += "\n";
            total += v.getCurso().getPreco();
        }
        resultado += String.format("Total R$: %.2f\n", total);
        return resultado;
    }      
}
