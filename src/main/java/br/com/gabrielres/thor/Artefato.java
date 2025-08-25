package br.com.gabrielres.thor;

import java.util.ArrayList;
import java.util.List;

public class Artefato {
    private String nome;
    private String tipo;
    private String material;
    private String estado;
    private List<Poder> poderes =
        new ArrayList<Poder>();
    private Ser dono = new Ser();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public List<Poder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }
        public Ser getDono() {
        return dono;
    }
    public void setDono(Ser dono) {
        this.dono = dono;
    }
}
