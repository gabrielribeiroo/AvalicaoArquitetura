/*
2) Elabore um modelo de classes em padrão Composite no qual representa uma lista de Arquivos (nome, tamanho) de diferentes tipos (Binário e Texto).
Além disso, crie uma abstração de uma classe referente a uma Pasta, na qual pode possuir arquivos de diferentes tipos (4,0 pontos).
3) Elabore, a partir das classes desenvolvidas na Questão 2, uma classe Builder no qual construa uma classe que gere arquivos de 
diferentes tipos (2,5 pontos).

4) Crie uma classe de comando que manipule a abstração de arquivo da Questão 2 para ser aberto, fechado, lido e escrito (2,5 pontos).
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
        //QUESTAO 2
        //Criar uma Pasta
        Pasta pst = new Pasta();

        pst.getLista().add(new Texto("TEXTO", "Anotações", "1.5 Gbts"));
        pst.getLista().add(new Texto("TEXTO", "Lembretes", "5 Gbts"));
        pst.getLista().add(new Binario("BINARIO", "Musicas", "15.6 Kbts"));
        pst.getLista().add(new Binario("BINARIO", "Video", "115.6 Kbts"));
        pst.mostrarArquivos();
        System.out.println("_________________________");
        //QUESTAO 3
        //Adicinando novos arquivos utilizando a classe builder
        pst.getLista().add(ArquivoBuilder.textoBuilder());
        pst.getLista().add(ArquivoBuilder.textoBuilder("TCC", "20 Gbts"));
        pst.getLista().add(ArquivoBuilder.binarioBuilder());
        pst.getLista().add(ArquivoBuilder.binarioBuilder("Musicly", "30 Gbts"));
        pst.mostrarArquivos();
        //QUESTAO 4
        
    }

}
