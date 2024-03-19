package org.isep.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    public static Scanner read = new Scanner(System.in);
    public static void mainLoop() {

        System.out.println("=============================================");
        System.out.println("|              Rent a Car App               |");
        System.out.println("=============================================");
        System.out.println("1 --> Registar Grupo Automóvel");
        System.out.println("2 --> Listar todos os Grupos Automóveis");
        System.out.println("=============================================");
        System.out.println("0 --> Sair                                  |");
        System.out.println("=============================================");

        int option = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Selecione uma opção: ");

            try {
                option = read.nextInt();

                if (option >= 0 && option <= 2) {
                    validInput = true;
                } else {
                    System.out.println("Opção inválida. Selecione uma opção entre 0 e 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Selecione uma opção entre 0 e 2.");
                read.nextLine();
            }
        }

        switch (option) {
            case 1:
                GrupoAutomovelUI.registarGA();
                break;
            case 2:
                System.out.println("Not implemented yet...");
                break;
            case 0:
                System.exit(0);

        }

    }
}



