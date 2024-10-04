package br.com.dio.desafio.dominio;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe que representa um desenvolvedor.
 * Possui atributos e métodos para gerenciar os conteúdos inscritos e concluídos.
 */
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Retorna a quantidade de conteúdos inscritos.
     * @return quantidade de conteúdos inscritos.
     */
    public int getEnrolledContentCount() {
        return conteudosInscritos.size();
    }

    /**
     * Retorna a quantidade de conteúdos concluídos.
     * @return quantidade de conteúdos concluídos.
     */
    public List<String> getTitulosConteudosConcluidos() {
        return conteudosConcluidos.stream()
                .map(Conteudo::getTitulo)
                .collect(Collectors.toList());
    }

    /**
     * Inscreve o desenvolvedor em um bootcamp.
     * Adiciona os conteúdos do bootcamp aos conteúdos inscritos do desenvolvedor.
     * @param bootcamp bootcamp a ser inscrito.
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.incrementarDevsInscritos();
    }

    /**
     * Progride o desenvolvedor movendo um conteúdo inscrito para a lista de conteúdos concluídos.
     * Se não houver conteúdos inscritos, exibe uma mensagem de erro.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não está inscrito em nenhum conteúdo no momento.");
        }
    }

    /**
     * Calcula a experiência total (XP) do desenvolvedor.
     * Percorre a lista de conteúdos concluídos e soma a XP de cada conteúdo.
     * @return XP total do desenvolvedor.
     */
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    /**
     * Retorna o nome do desenvolvedor.
     * @return nome do desenvolvedor.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do desenvolvedor.
     * @param nome nome do desenvolvedor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna os conteúdos inscritos pelo desenvolvedor.
     * @return conteúdos inscritos.
     */
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * Define os conteúdos inscritos pelo desenvolvedor.
     * @param conteudosInscritos conteúdos inscritos.
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * Retorna os conteúdos concluídos pelo desenvolvedor.
     * @return conteúdos concluídos.
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * Define os conteúdos concluídos pelo desenvolvedor.
     * @param conteudosConcluidos conteúdos concluídos.
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /**
     * Verifica se um objeto é igual a este desenvolvedor.
     * Dois desenvolvedores são considerados iguais se possuem o mesmo nome, conteúdos inscritos e conteúdos concluídos.
     *
     * @param o Objeto a ser comparado.
     * @return true se os desenvolvedores são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
                && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    /**
     * Retorna o código de hash do desenvolvedor.
     * @return código de hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
