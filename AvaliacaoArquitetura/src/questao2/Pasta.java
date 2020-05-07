/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Ribeiro Vital
 *
 */
public class Pasta {

    List<Iarquivo> lista = new ArrayList<>();

    public List<Iarquivo> getLista() {
        return lista;
    }

    public void mostrarArquivos() {

        System.out.println("----PASTA----");

        for (Iarquivo arquivos : lista) {
            arquivos.getAquivos();
        }

    }

}
