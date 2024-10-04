package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe que representa um bootcamp.
 * Possui atributos e métodos para gerenciar os desenvolvedores inscritos e os conteúdos do bootcamp.
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dateFinal = dataInicial.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    /**
     * Retorna a quantidade de desenvolvedores inscritos no bootcamp.
     * @return quantidade de desenvolvedores inscritos.
     */
    private int DevsInscritos = 0;
    public int getDevsInscritos() {
        return DevsInscritos;
    }

    /**
     * Incrementa a quantidade de desenvolvedores inscritos no bootcamp.
     * @return quantidade de desenvolvedores inscritos.
     */
    public void incrementarDevsInscritos() {
        this.DevsInscritos++;
    }

    /**
     * Retorna o nome do bootcamp.
     *
     * @return nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do bootcamp.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição do bootcamp.
     *
     * @return descrição.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do bootcamp.
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a data final do bootcamp.
     *
     * @return data final.
     */
    public LocalDate getDateFinal() {
        return dateFinal;
    }

    /**
     * Retorna os desenvolvedores inscritos no bootcamp.
     *
     * @return desenvolvedores inscritos.
     */
    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    /**
     * Define os desenvolvedores inscritos no bootcamp.
     *
     * @param devsIncritos
     */
    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }

    /**
     * Retorna os conteúdos do bootcamp.
     *
     * @return conteúdos.
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * Define os conteúdos do bootcamp.
     *
     * @param conteudos
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    /**
     * Verifica se o bootcamp é igual a outro.
     * Dois bootcamps são considerados iguais se possuem o mesmo nome, descrição, data final, desenvolvedores inscritos e conteúdos.
     *
     * @param o Objeto a ser comparado.
     * @return true se os bootcamps são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao)
                && Objects.equals(dateFinal, bootcamp.dateFinal) && Objects.equals(devsIncritos,
                bootcamp.devsIncritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    /**
     * Retorna o código de hash do bootcamp.
     *
     * @return código de hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dateFinal, devsIncritos, conteudos);
    }
}
