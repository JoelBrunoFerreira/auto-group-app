package org.isep.Domain;

import javax.persistence.*;

@Entity
@Table(name = "GrupoAutomovel")
public class GrupoAutomovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    Integer Portas;
    String Classe;

    protected GrupoAutomovel() {
    }

    public GrupoAutomovel(String nome, Integer portas, String classe) {
        this.nome = nome;
        Portas = portas;
        Classe = classe;
    }
}
