package br.com.dio.desafio.dominio;

/**
 * Classe que representa um curso, que é um tipo de conteúdo.
 * Herda de Conteudo e inclui atributos adicionais.
 */

public class Curso extends Conteudo{

    private int cargaHoraria;

    /**
     * Calcula a experiência (XP) que um curso proporciona.
     * @return XP do curso.
     */

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {

    }

    /**
     * Retorna a carga horária do curso.
     * @return carga horária.
     */

    public int getCargaHoraria() {

        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso.
     * @param cargaHoraria
     */

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Retorna uma representação em String do curso.
     * @return String com os atributos do curso.
     */
    @Override
    public String toString() {

        return "Curso [cargaHoraria=" + cargaHoraria + ";\n titulo=" + titulo + ";\n descricao=" + descricao + "]";
    }
}
