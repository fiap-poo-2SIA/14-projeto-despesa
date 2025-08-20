package br.fiap.modelo;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteDespesa {
    public static void main(String[] args) {
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();

//        despesa.setId(101L);
//        despesa.setDescricao("viagem de uber para a festa");
//        despesa.setValor(2500.00);
//        despesa.setData(LocalDate.parse("18/08/2025", mascara));
//        despesa.setCategoria(new Categoria(1L, ""));
//        dao.inserir(despesa);

        List<Despesa> lista = dao.listar();
        for(Despesa d : lista) {
            System.out.println(d.getId());
            System.out.println(d.getDescricao());
            System.out.println("R$ " + d.getValor());
            System.out.println(d.getData().format(mascara));
            System.out.println(d.getCategoria().getId());
            System.out.println("=================================");
        }
    }
}
