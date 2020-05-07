/*
 3) Elabore, a partir das classes desenvolvidas na Questão 2, uma classe Builder no qual construa uma classe que gere arquivos de 
diferentes tipos (2,5 pontos).
 */
package questao2;

/**
 *
 * @author Gabriel Ribeiro Vital
 */
public class ArquivoBuilder {

    public ArquivoBuilder() {
    }

    public enum tipoArquivo {
        Texto,
        Binario
    }

    public static Texto textoBuilder() {
        return new Texto("TEXTO", "temp", "1.5 Gbts");
    }

    public static Texto textoBuilder(String nome, String tamanho) {
        return new Texto("TEXTO", nome, tamanho);
    }
    
    public static Texto binarioBuilder() {
        return new Texto("BINARIO", "music", "11.4 Gbts");
    }

    public static Texto binarioBuilder(String nome, String tamanho) {
        return new Texto("BINARIO", nome, tamanho);
    }
    
    public static Iarquivo geraArquivo(tipoArquivo t){
        switch(t){
            
            case Texto:
                return textoBuilder();
            case Binario:
                return binarioBuilder();
            default:
                return textoBuilder();
        }
    }

}
