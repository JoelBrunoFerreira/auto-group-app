package org.isep.Domain;

import javax.persistence.*;

@Entity
@Table(name = "GrupoAutomovel")
public class GrupoAutomovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private int portas;
    private String classe;


    // Constructors
    // --------------------------------
    protected GrupoAutomovel() {
        // Empty constructor
    }
    public GrupoAutomovel(String nome, int portas, String classe) {
        this.nome = nome;
        this.portas = portas;
        this.classe = classe;
    }

    // To String
    // --------------------------------ś
    @Override
    public String toString() {
        return "GrupoAutomovel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", portas=" + portas +
                ", classe='" + classe + '\'' +
                '}';
    }
}
