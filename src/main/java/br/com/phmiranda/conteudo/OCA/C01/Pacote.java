/**
 * Project: certificacao
 * Date: 11/06/2020
 * User: phmiranda
 * Descrição: Classe que mostra o uso de instruções package e import.
 */

package br.com.phmiranda.conteudo.OCA.C01;

import java.util.ArrayList;
import java.io.Console;

public class Pacote {
    public static void main(String[] args) {
        Console console = System.console();
        String planet = console.readLine("\nEnter your favorite planet: ");
        ArrayList planetList = new ArrayList();
        planetList.add(planet);
        planetList.add("Terra");
        System.out.println(planetList);
    }
}
