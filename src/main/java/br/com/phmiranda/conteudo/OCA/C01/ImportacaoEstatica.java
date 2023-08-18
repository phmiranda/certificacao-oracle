/**
 * Project: certificacao
 * Date: 11/06/2020
 * User: phmiranda
 * Descrição: classe que mostra a definição de uma importação estática para apresentação de membros estáticos.
 */

package br.com.phmiranda.conteudo.OCA.C01;

//import static java.util.Locale.*;

import static java.util.Locale.ITALY;
import static java.util.Locale.GERMANY;
import static java.util.Locale.JAPANESE;

public class ImportacaoEstatica {
    public static void main(String[] args) {
        System.out.println("Local: " + ITALY);
        System.out.println("Local: " + GERMANY);
        System.out.println("Local: " + JAPANESE);
    }
}
