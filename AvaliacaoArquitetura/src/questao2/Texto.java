/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Gabriel Ribeiro Vital
 */
public class Texto extends Arquivo {

    private String Tipo;

    public Texto(String Tipo, String nomeArquivo, String tamanhoArquivo) {
        super(nomeArquivo, tamanhoArquivo);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public void getAquivos() {
        System.out.println("----TEXTO----");
        System.out.println("Nome: " + this.getNomeArquivo());
        System.out.println("Tamanho: " + this.getTamanhoArquivo());
        System.out.println("Tipo: " + this.getTipo());
    }

}
