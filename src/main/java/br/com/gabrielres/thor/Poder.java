package br.com.gabrielres.thor;

import java.util.ArrayList;
import java.util.List;

public class Poder {
    private String nome;
    private String descricao;
    private List<Artefato> artefatos =
        new ArrayList<Artefato>();
    private List<Divindade> divindades =
        new ArrayList<Divindade>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Artefato> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    public List<Divindade> getDivindades() {
        return divindades;
    }
    public void setDivindades(List<Divindade> divindades) {
        this.divindades = divindades;
    }
}
