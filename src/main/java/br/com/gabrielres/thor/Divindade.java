package br.com.gabrielres.thor;

import java.util.ArrayList;
import java.util.List;

public class Divindade extends Ser{
    private String sexo;
    private String fraqueza;
    private String governa;
    private List<Poder> poderes =
        new ArrayList<Poder>();
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFraqueza() {
        return fraqueza;
    }
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    public String getGoverna() {
        return governa;
    }
    public void setGoverna(String governa) {
        this.governa = governa;
    }
    public List<Poder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    
}
