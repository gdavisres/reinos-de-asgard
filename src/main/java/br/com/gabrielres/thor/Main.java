package br.com.gabrielres.thor;

public class Main {
    public static void main(String[] args) {
        // Criando um deus
        Deus thor = new Deus();
        thor.setNome("Thor");
        thor.setVivo(true);
        thor.setMoradia("Asgard");
        thor.setDesignado("Deus do Trovao");

        // Criando um poder
        Poder trovao = new Poder();
        trovao.setNome("Controle do Trovao");
        trovao.setDescricao("Permite controlar raios e trovões.");

        // Relacionando poder ao deus
        thor.getPoderes().add(trovao);
        trovao.getDivindades().add(thor);

        // Criando um artefato
        Artefato mjolnir = new Artefato();
        mjolnir.setNome("Mjolnir");
        mjolnir.setTipo("Martelo");
        mjolnir.setMaterial("Uru");
        mjolnir.setEstado("Impecavel");
        mjolnir.setDono(thor);

        // Relacionando artefato ao poder
        mjolnir.getPoderes().add(trovao);
        trovao.getArtefatos().add(mjolnir);

        // Adicionando artefato ao deus
        thor.getArtefatos().add(mjolnir);

        // Exemplo de saída
        System.out.println("Deus criado: " + thor.getNome());
        System.out.println("Moradia: " + thor.getMoradia());
        System.out.println("Poderes:");
        for (Poder poder : thor.getPoderes()) {
            System.out.println("- " + poder.getNome() + ": " + poder.getDescricao());
        }
        System.out.println("Artefatos:");
        for (Artefato artefato : thor.getArtefatos()) {
            System.out.println("- " + artefato.getNome() + " (" + artefato.getTipo() + "), Material: " + artefato.getMaterial());
            System.out.println("  Poderes do artefato:");
            for (Poder poder : artefato.getPoderes()) {
                System.out.println("    * " + poder.getNome());
            }
        }
    }
}