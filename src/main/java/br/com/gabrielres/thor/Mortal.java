package br.com.gabrielres.thor;

import java.util.Date;

public class Mortal extends Ser{
    private Date nascimento;

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
