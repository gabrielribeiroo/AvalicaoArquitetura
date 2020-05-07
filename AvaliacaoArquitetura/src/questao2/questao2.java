/*
2) Elabore um modelo de classes em padrão Composite no qual representa uma lista de Arquivos (nome, tamanho) de diferentes tipos (Binário e Texto).
Além disso, crie uma abstração de uma classe referente a uma Pasta, na qual pode possuir arquivos de diferentes tipos (4,0 pontos).
 */
package questao2;

/**
 *
 * @author Gabriel Ribeiro Vital
 */
public class questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criar uma Pasta
        Pasta pst = new Pasta();

        pst.getLista().add(new Texto("TEXTO", "Anotações", "1.5 Gbts"));
        pst.getLista().add(new Texto("TEXTO", "Lembretes", "5 Gbts"));
        pst.getLista().add(new Binario("BINARIO", "Musicas", "15.6 Kbts"));
        pst.getLista().add(new Binario("BINARIO", "Video", "115.6 Kbts"));
        pst.mostrarArquivos();
    }

}
