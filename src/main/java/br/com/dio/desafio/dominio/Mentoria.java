package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Classe que representa uma mentoria, que é um tipo de conteúdo.
 * Herda de Conteudo e inclui atributos adicionais.
 */
public class Mentoria extends Conteudo {
    private LocalDate data;

    /**
     * Calcula a experiência (XP) que uma mentoria proporciona.
     * O XP é calculado somando o XP padrão com 20.
     *
     * @return XP da mentoria.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Construtor padrão da classe.
     */
    public Mentoria() {

    }

    /**
     * Retorna a data da mentoria.
     *
     * @return data.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     *
     * @param data
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna uma representação em String da mentoria.
     *
     * @return String com os atributos da mentoria.
     */
    @Override
    public String toString() {

        return "Mentoria [data=" + data + ", titulo=" + titulo + ", descricao=" + descricao + "]";
    }
}
