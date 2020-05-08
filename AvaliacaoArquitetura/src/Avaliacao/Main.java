/*
1) Explique em linhas gerais quais são as condições necessárias para uma classe seguir um padrão de projeto Singleton (1,0 ponto)

2) Elabore um modelo de classes em padrão Composite no qual representa uma lista de Arquivos (nome, tamanho) de diferentes tipos (Binário e Texto).
Além disso, crie uma abstração de uma classe referente a uma Pasta, na qual pode possuir arquivos de diferentes tipos (4,0 pontos).

3) Elabore, a partir das classes desenvolvidas na Questão 2, uma classe Builder no qual construa uma classe que gere arquivos de 
diferentes tipos (2,5 pontos).

4) Crie uma classe de comando que manipule a abstração de arquivo da Questão 2 para ser aberto, fechado, lido e escrito (2,5 pontos).
 
 */
package Avaliacao;

import java.util.List;

/**
 *
 * @author Gabriel Ribeiro Vital
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //QUESTAO 2
        //Criar uma Pasta
        System.out.println("_________________________");
        System.out.println("UTILIZANDO COMPOSITE");
        Pasta pst = new Pasta();
        pst.getLista().add(new Texto("TEXTO", "Anotações", "1.5 Gbts", 1));
        pst.getLista().add(new Texto("TEXTO", "Lembretes", "5 Gbts", 2));
        pst.getLista().add(new Binario("BINARIO", "Musicas", "15.6 Kbts", 3));
        pst.getLista().add(new Binario("BINARIO", "Video", "115.6 Kbts", 4));
        pst.mostrarArquivos();
        System.out.println("_________________________");
        System.out.println("UTILIZANDO BUILDER");
        //QUESTAO 3
        //Adicinando novos arquivos utilizando a classe builder
        pst.getLista().add(ArquivoBuilder.textoBuilder());
        pst.getLista().add(ArquivoBuilder.textoBuilder("TCC", "20 Gbts"));
        pst.getLista().add(ArquivoBuilder.binarioBuilder());
        pst.getLista().add(ArquivoBuilder.binarioBuilder("Musicly", "30 Gbts"));
        pst.mostrarArquivos();
        System.out.println("_________________________");
        System.out.println("UTILIZANDO COMMAND");
        //QUESTAO 4
        Command c = new Command();
        c.adicionarArquivo(new Texto("TEXTO", "Anotações", "1.5 Gbts", 1));
        c.adicionarArquivo(new Texto("TEXTO", "Lembretes", "5 Gbts", 2));
        c.adicionarArquivo(new Binario("BINARIO", "Musicas", "15.6 Kbts", 3));
        c.adicionarArquivo(new Binario("BINARIO", "Video", "115.6 Kbts", 4));
        c.abrirArquivo(1);
        c.fecharArquivo(2);
        c.lerArquivo(3);

        c.escreverArquivo(4);
        List<Iarquivo> lista4 = c.getArquivos();
        for (Iarquivo a : lista4) {
            a.mostrarAquivos();
        }
    }

}
