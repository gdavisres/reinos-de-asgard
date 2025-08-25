package br.com.gabrielres.thor;

public class Humano extends Mortal {
    private String sexo;
    private String profissao;
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
