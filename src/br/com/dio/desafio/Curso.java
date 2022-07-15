package br.com.dio.desafio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        
        return "Curso{" +
            "titulo=" + super.getTitulo() + 
            " Descricao=" + super.getDescricao() +
            " Carga Horaria=" + this.cargaHoraria +
            "Xp=" + calcularXp();
        }
        
    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;        
    }
}
