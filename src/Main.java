import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


/**
 * Created by IntelliJ IDEA.
 * User: De
 * Date: 02/12/22
 * Time: 09:24
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[]args )   {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrição("descricão curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrição("descricão curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso c#");
        curso3.setDescrição("descricão curso C#");
        curso3.setCargaHoraria(8);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso back-end");
        curso4.setDescrição("descricão curso back-end");
        curso4.setCargaHoraria(6);

        Curso curso5 = new Curso();
        curso5.setTitulo("curso front-end");
        curso5.setDescrição("descricão curso front-end");
        curso5.setCargaHoraria(4);

        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrição("descriçao mentoria de java");
        mentoria.setDate(LocalDate.now());



        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:"+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:"+devCamila.getConteudosConcluidos());
        System.out.println("XP"+ devCamila.calularTotalXp());

         System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:"+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:"+devJoao.getConteudosConcluidos());
        System.out.println("XP"+ devJoao.calularTotalXp());


        System.out.println("----------");

               Dev devCarlos = new Dev();
               devCarlos.setNome("Carlos");
               devCarlos.inscreverBootcamp(bootcamp);
               devCarlos.progredir();
               devCarlos.progredir();
               devCarlos.progredir();
               devCarlos.progredir();
               devCarlos.progredir();
               System.out.println("-");
               System.out.println("Conteúdos Inscritos Carlos:"+devCarlos.getConteudosInscritos());
               System.out.println("Conteúdos Concluidos Carlos:"+devCarlos.getConteudosConcluidos());
               System.out.println("XP"+ devCarlos.calularTotalXp());

    }
}
