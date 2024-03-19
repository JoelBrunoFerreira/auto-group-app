package org.isep.Repositories;

import org.isep.Domain.GrupoAutomovel;

import java.util.List;

public interface GrupoAutomovelRepositorio {
    /**
     * inserts an entity and commits
     *
     * @param entity
     * @return the persisted entity
     */
    public GrupoAutomovel add(GrupoAutomovel entity);

    /**
     * reads an entity given its ID
     *
     * @param id
     * @return
     */
    public GrupoAutomovel findById(Long id);

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    public List<GrupoAutomovel> findAll();

}
