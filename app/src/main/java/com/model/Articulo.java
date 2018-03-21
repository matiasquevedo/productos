package com.model;

/**
 * Created by matias on 20/03/18.
 */

public class Articulo {
    private String titulo;
    private String bajada;
    private String cuerpo;

    public Articulo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getBajada() {

        return bajada;
    }

    public void setBajada(String bajada) {
        this.bajada = bajada;
    }
}
