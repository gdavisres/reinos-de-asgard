package br.com.gabrielres.thor;

import java.util.ArrayList;
import java.util.List;

public class Ser {
    private String nome;
    private Boolean vivo;
    private String moradia;
    private List<Ser> filhos =
        new ArrayList<Ser>();
    private List<Artefato> artefatos =
        new ArrayList<Artefato>();
        
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Boolean getVivo() {
        return vivo;
    }
    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
    public String getMoradia() {
        return moradia;
    }
    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
    public List<Artefato> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
}
