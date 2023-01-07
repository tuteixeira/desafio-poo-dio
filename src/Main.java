import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição do curso de Java");
        cursoJava.setCargaHoraria(80);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python 3");
        cursoPython.setDescricao("Descrição curso de Python 3");
        cursoPython.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp de Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoria);

        Dev devTuki = new Dev();
        devTuki.setNome("Tuki");
        devTuki.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devTuki.getNome() + ":" + devTuki.getConteudosInscritos());
        devTuki.progredir();
        devTuki.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devTuki.getNome() + ":" + devTuki.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devTuki.getNome() + ":" + devTuki.getConteudosConcluidos());
        System.out.println("XP:" + devTuki.calcularTotalXp());

        System.out.println("-------");

        Dev devNina = new Dev();
        devNina.setNome("Nina");
        devNina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devNina.getNome() + ":" + devNina.getConteudosInscritos());
        devNina.progredir();
        devNina.progredir();
        devNina.progredir();
        System.out.println("Conteúdos Inscritos " + devNina.getNome() + ":" + devNina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devNina.getNome() + ":" + devNina.getConteudosConcluidos());
        System.out.println("XP:" + devNina.calcularTotalXp());

        System.out.println("-------");

        Dev devPiloto = new Dev();
        devPiloto.setNome("Piloto");
        devPiloto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devPiloto.getNome() + ":" + devPiloto.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devPiloto.getNome() + ":" + devPiloto.getConteudosConcluidos());
        System.out.println("XP:" + devPiloto.calcularTotalXp());
    }
}
