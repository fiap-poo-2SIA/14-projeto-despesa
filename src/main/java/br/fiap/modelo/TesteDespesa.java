package br.fiap.modelo;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteDespesa {
    public static void main(String[] args) {
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();

        despesa.setId(101L);
        despesa.setDescricao("viagem de uber para a festa");
        despesa.setValor(2500.00);
        despesa.setData(LocalDate.parse("18/08/2025", mascara));
        despesa.setCategoria(new Categoria(1L, ""));
        dao.inserir(despesa);
    }
}
