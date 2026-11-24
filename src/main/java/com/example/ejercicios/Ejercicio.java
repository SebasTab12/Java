package com.example.ejercicios;

import java.util.List;

public class Ejercicio {

    private String nombre;
    private List<String> musculos;
    private List<String> equipo;
    private String series;
    private List<String> beneficios;
    private List<String> precauciones;
    private List<String> erroresComunes;
    private List<String> recomendaciones;

    public Ejercicio(String nombre, List<String> musculos, List<String> equipo, String series, List<String> beneficios, List<String> precauciones, List<String> erroresComunes, List<String> recomendaciones) {
        this.nombre = nombre;
        this.musculos = musculos;
        this.equipo = equipo;
        this.series = series;
        this.beneficios = beneficios;
        this.precauciones = precauciones;
        this.erroresComunes = erroresComunes;
        this.recomendaciones = recomendaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getMusculos() {
        return musculos;
    }

    public void setMusculos(List<String> musculos) {
        this.musculos = musculos;
    }

    public List<String> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<String> equipo) {
        this.equipo = equipo;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }

    public List<String> getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(List<String> precauciones) {
        this.precauciones = precauciones;
    }

    public List<String> getErroresComunes() {
        return erroresComunes;
    }

    public void setErroresComunes(List<String> erroresComunes) {
        this.erroresComunes = erroresComunes;
    }

    public List<String> getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(List<String> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
}
