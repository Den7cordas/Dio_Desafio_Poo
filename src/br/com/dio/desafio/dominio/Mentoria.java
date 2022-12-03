package br.com.dio.desafio.dominio;

/**
 * Created by IntelliJ IDEA.
 * User: De
 * Date: 02/12/22
 * Time: 09:24
 * To change this template use File | Settings | File Templates.
 */
import java.time.LocalDate;

public class Mentoria extends Conteudo{

     private LocalDate date;

    @Override
    public Double calcularXP() {
        return XP_Padrao + 20d;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Mentoria() {
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }


}

