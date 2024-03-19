package org.isep.View;

import org.isep.Controller.GrupoAutomovelController;
import org.isep.Domain.GrupoAutomovel;
import org.isep.Utils.Console;

public class GrupoAutomovelUI {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();

    public void registarGA() {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        GrupoAutomovel grupoAutomovel = controller.
                registarGrupoAutomóvel(nome, portas, classe);
        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }
    public void listarGAs() {
        throw new UnsupportedOperationException("Ainda não implementada.");
    }

    public void procurarGAPorID(long id) {
        throw new UnsupportedOperationException("Ainda não implementada.");
    }
}
