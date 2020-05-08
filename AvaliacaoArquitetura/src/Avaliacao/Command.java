/*

 */
package Avaliacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Ribeiro Vital
 */
public class Command {

    List<Iarquivo> arquivos = new ArrayList<>();

    public void adicionarArquivo(Iarquivo arquivo) {
        this.arquivos.add(arquivo);
    }

    public List<Iarquivo> getArquivos() {
        return arquivos;
    }

    public void lerArquivo(int id) {
        for (Iarquivo a : arquivos) {
            if (a.getId() == id) {
                a.ler(id);
            }
        }
    }

    public void escreverArquivo(int id) {
        for (Iarquivo a : arquivos) {
            if (a.getId() == id) {
                a.escrever(id);
            }
        }
    }

    public void abrirArquivo(int id) {
        for (Iarquivo a : arquivos) {
            if (a.getId() == id) {
                a.abrir(id);
            }
        }
    }

    public void fecharArquivo(int id) {
        for (Iarquivo a : arquivos) {
            if (a.getId() == id) {
                a.fechar(id);
            }
        }
    }
}
