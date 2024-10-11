package edu.projetoiphone.musica;
public class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando.");
    }

    public void pausar() {
        System.out.println("Pausando.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música \"" + musica + "\" selecionada.");
    }
}
