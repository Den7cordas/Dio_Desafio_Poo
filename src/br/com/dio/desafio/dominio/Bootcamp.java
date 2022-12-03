package br.com.dio.desafio.dominio;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LocalDateTimeStringConverter;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;
/**
 * Created by IntelliJ IDEA.
 * User: De
 * Date: 02/12/22
 * Time: 12:44
 * To change this template use File | Settings | File Templates.
 */
public class Bootcamp {

private String name;
public  String descricao;
private final LocalDate dataInicial = LocalDate.now();
private final LocalDate dataFinal = dataInicial.plusDay(45);
private Set<Dev>devInscritos =new HashSet<>();
private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (conteudos != null ? !conteudos.equals(bootcamp.conteudos) : bootcamp.conteudos != null) return false;
        if (dataFinal != null ? !dataFinal.equals(bootcamp.dataFinal) : bootcamp.dataFinal != null) return false;
        if (dataInicial != null ? !dataInicial.equals(bootcamp.dataInicial) : bootcamp.dataInicial != null)
            return false;
        if (descricao != null ? !descricao.equals(bootcamp.descricao) : bootcamp.descricao != null) return false;
        if (devInscritos != null ? !devInscritos.equals(bootcamp.devInscritos) : bootcamp.devInscritos != null)
            return false;
        if (name != null ? !name.equals(bootcamp.name) : bootcamp.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (dataInicial != null ? dataInicial.hashCode() : 0);
        result = 31 * result + (dataFinal != null ? dataFinal.hashCode() : 0);
        result = 31 * result + (devInscritos != null ? devInscritos.hashCode() : 0);
        result = 31 * result + (conteudos != null ? conteudos.hashCode() : 0);
        return result;
    }
}
