package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {}

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + 
        "Titulo = " + super.getTitulo() +
        " Descrição = " + super.getDescricao() +
        " Data = " + this.data +
        " Xp = " + calcularXp();
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
