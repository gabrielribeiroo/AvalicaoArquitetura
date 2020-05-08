/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliacao;

/**
 *
 * @author Gabriel Ribeiro Vital
 */
public abstract class Arquivo implements Iarquivo {

    private String nomeArquivo;
    private String tamanhoArquivo;

    public Arquivo(String nomeArquivo, String tamanhoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(String tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

}
