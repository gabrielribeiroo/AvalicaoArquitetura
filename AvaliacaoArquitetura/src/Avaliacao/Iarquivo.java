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
public interface Iarquivo {

    void getAquivos();

    void ler(int id);

    void escrever(int id);

    void abrir(int id);

    void fechar(int id);

    int getId();

    void mostrarAquivos();
}
