package org.isep.Domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carro {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
