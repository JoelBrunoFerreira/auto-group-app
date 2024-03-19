package org.isep.View;

import org.isep.Controller.GrupoAutomovelController;
import org.isep.Domain.GrupoAutomovel;

import java.util.Scanner;

public class GrupoAutomovelUI {

    public static Scanner read = new Scanner(System.in);
    private static final GrupoAutomovelController controller = new GrupoAutomovelController();

    public static void registarGA() {
        System.out.println("========================");
        System.out.println("Registar Grupo Automovel");
        System.out.println("========================");

        System.out.println("Insira o nome: ");
        String nome = read.nextLine();
        System.out.println("Insira o numero de portas: ");
        int portas = read.nextInt();
        read.nextLine();
        System.out.println("Insira a classe: ");
        String classe = read.nextLine();

        GrupoAutomovel grupoAutomovel = controller.registarGrupoAutomovel(nome, portas, classe);
        System.out.println("Grupo Automovel inserido:  " + grupoAutomovel);
    }
    public static void listarGAs() {
        throw new UnsupportedOperationException("Ainda não implementada.");
    }

    public static void procurarGAPorID(long id) {
        throw new UnsupportedOperationException("Ainda não implementada.");
    }
}
