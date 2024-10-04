package br.com.dio.desafio.dominio;

import java.util.Objects;

/**
 * Classe abstrata que representa um conteúdo genérico.
 * Possui atributos e métodos comuns a todos os conteúdos.
 */
public abstract class Conteudo {
    protected String titulo;
    protected String descricao;

    protected static final double XP_PADRAO = 10d;

    /**
     * Calcula a experiência (XP) que um conteúdo proporciona.
     * Este método deve ser sobrescrito nas subclasses para proporcionar o cálculo de XP exato.
     * @return XP do conteúdo.
     */
    public double calcularXp() {
        return 0;
    }

    /**
     * Retorna o título do conteúdo.
     * @return título.
     */
    public String getTitulo() {

        return titulo;
    }

    /**
     * Define o título do conteúdo.
     * @param titulo
     */
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    /**
     * Retorna a descrição do conteúdo.
     * @return descrição.
     */
    public String getDescricao() {

        return descricao;
    }

    /**
     * Define a descrição do conteúdo.
     * @param descricao
     */
    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    /**
     * Verifica se o conteúdo é igual a outro.
     * Dois conteúdos são considerados iguais se eles possuem o mesmo títlo e descrição.
     *
     * @param o Objeto a ser comparado.
     * @return true se os conteúdos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(titulo, conteudo.titulo) && Objects.equals(descricao, conteudo.descricao);
    }

    /**
     * Retorna o código de hash do conteúdo.
     * @return código de hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao);
    }
}
