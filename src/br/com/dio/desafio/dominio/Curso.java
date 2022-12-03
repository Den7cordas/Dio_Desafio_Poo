package br.com.dio.desafio.dominio;

/**
 * Created by IntelliJ IDEA.
 * User: De
 * Date: 02/12/22
 * Time: 09:24
 * To change this template use File | Settings | File Templates.
 */
public class Curso extends Conteudo{

  private String titulo;
  private String descrição;
  private int cargaHoraria;

     @Override
    public Double calcularXP() {
        return XP_Padrao * cargaHoraria;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
