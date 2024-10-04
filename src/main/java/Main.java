import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

/**
 * Classe principal que contém o método main para execução do programa.
 * Neste exemplo, são criados objetos de curso, mentoria, bootcamp e dev.
 */
public class Main {
    /**
     * Método principal que executa o programa.
     * @param args argumentos de linha de comando.
     */
    public static void main(String[] args) {
        // Cria e configura o primeiro curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de Java para iniciantes");
        curso1.setCargaHoraria(8);

        // Cria e configura o segundo curso
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Algorithms");
        curso2.setDescricao("Curso de Algorithms para iniciantes");
        curso2.setCargaHoraria(4);

        // Cria e configura a mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java para iniciantes");
        mentoria.setData(LocalDate.now());

        // Cria e configura o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Cria e configura o dev
        Dev devLais = new Dev();
        devLais.setNome("Lais");
        devLais.inscreverBootcamp(bootcamp);

        // Exibe os conteúdos inscritos e concluídos
        System.out.println("Conteúdos inscritos: " + devLais.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLais.getConteudosConcluidos());

        // Progride o dev e exibe os conteúdos inscritos e concluídos atualizados
        devLais.progredir();
        devLais.progredir();
        System.out.println("Conteúdos inscritos: " + devLais.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLais.getConteudosConcluidos());

        // Exibe o total de XP e a lista de conteúdos concluídos
        System.out.println("XP: " + devLais.calcularTotalXp());
        System.out.println("Lista de conteúdos concluídos: " + devLais.getTitulosConteudosConcluidos());
    }
}
