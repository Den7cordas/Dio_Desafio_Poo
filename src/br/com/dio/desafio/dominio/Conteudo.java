package br.com.dio.desafio.dominio;

/**
 * Created by IntelliJ IDEA.
 * User: De
 * Date: 02/12/22
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */
public abstract class Conteudo {
    private String titulo;
    private String descricao;

    protected static final Double  XP_Padrao = 10d;

    public abstract Double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
