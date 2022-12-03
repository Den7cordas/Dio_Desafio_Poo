package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


/**
 * Created by IntelliJ IDEA.
 * User: De
 * Date: 02/12/22
 * Time: 12:44
 * To change this template use File | Settings | File Templates.
 */
public class Dev {
private String nome;
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


 public void inscreverBootcamp(Bootcamp bootcamp){
 this.conteudosInscritos.addAll(bootcamp.getConteudos());
 bootcamp.getDevsInscritos().add(this);

 }
 public void progredir(){
 Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
 if(conteudo.isPresent()){
 this.conteudosConcluidos.add(conteudo.get());
 this.conteudosInscritos.remove(conteudo.get();)
 }else{
     System.err.println("Voçê não está matriculado em nenhum conteudo");
 }

 }

 public double calularTotalXp(){
 return this.conteudosConcluidos
         .stream()
         .mapToDouble(conteudo :: calcularXp)
         .sum();
 }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;

        Dev dev = (Dev) o;

        if (!conteudosConcluidos.equals(dev.conteudosConcluidos)) return false;
        if (!conteudosInscritos.equals(dev.conteudosInscritos)) return false;
        if (!nome.equals(dev.nome)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + conteudosInscritos.hashCode();
        result = 31 * result + conteudosConcluidos.hashCode();
        return result;
    }
}
