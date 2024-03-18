package com.peliculas.sumativa;

public class Pelicula {
    private int id;
    private String nombre;
    private String actorPrincipal;
    private String sinopsis;
    private int añoLanzamiento;
    private String genero;

    // Constructor
    public Pelicula(int id, String nombre, String actorPrincipal, String sinopsis, int añoLanzamiento, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.actorPrincipal = actorPrincipal;
        this.sinopsis = sinopsis;
        this.añoLanzamiento = añoLanzamiento;
        this.genero = genero;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
