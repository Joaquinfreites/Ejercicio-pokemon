package com.example.ejercicio_integrador;

public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombre;
    protected Double peso;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;

    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();

    public Pokemon() {
    }
}
