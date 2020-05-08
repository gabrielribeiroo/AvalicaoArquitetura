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
public class Texto extends Arquivo {

    private int id;
    private String Tipo;
    private String acao;

    public Texto(String Tipo, String nomeArquivo, String tamanhoArquivo, int id) {
        super(nomeArquivo, tamanhoArquivo);
        this.Tipo = Tipo;
        this.id = id;
        this.acao = "Fechado";
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
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + this.getNomeArquivo());
        System.out.println("Tamanho: " + this.getTamanhoArquivo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Acao: " + this.getAcao());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    @Override
    public void ler(int id) {
        setAcao("Lido");
    }

    @Override
    public void escrever(int id) {
        setAcao("Escrito");
    }

    @Override
    public void abrir(int id) {
        setAcao("Aberto");
    }

    @Override
    public void fechar(int id) {
        setAcao("Fechado");
    }

    @Override
    public void mostrarAquivos() {
        System.out.println("----TEXTO----");
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + this.getNomeArquivo());
        System.out.println("Tamanho: " + this.getTamanhoArquivo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Acao: " + this.getAcao());
    }

}
