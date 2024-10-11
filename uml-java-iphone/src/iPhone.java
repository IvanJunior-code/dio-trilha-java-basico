import edu.projetoiphone.musica.ReprodutorMusical;
import edu.projetoiphone.navegador.NavegadorInternet;
import edu.projetoiphone.telefone.AparelhoTelefonico;

public class iPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical musica = new ReprodutorMusical();
        musica.selecionarMusica("Survivor - Eye Of The Tiger");
        musica.tocar();
        musica.pausar();

        NavegadorInternet internet = new NavegadorInternet();
        internet.adicionarNovaAba();
        internet.exibirPagina("https://www.exemplo.com");
        internet.atualizarPagina();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.iniciarCorreioVoz();
        telefone.ligar();
        telefone.atender();
    }
}
