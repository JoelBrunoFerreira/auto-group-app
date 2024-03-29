package org.isep.Persistence;

import org.isep.Domain.GrupoAutomovel;

import javax.persistence.*;
import java.util.List;

public class GrupoAutomovelRepositorioJPAImpl implements GrupoAutomovelRepositorio {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AutoGroupApp");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    /**
     * inserts an entity GrupoAutomovel
     *
     * @param grupoAutomovel
     * @return the persisted entity
     */
    @Override
    public GrupoAutomovel add(GrupoAutomovel grupoAutomovel) {
        if (grupoAutomovel == null) {
            throw new IllegalArgumentException();
        }
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(grupoAutomovel);
        tx.commit();
        em.close();

        return grupoAutomovel;
    }


    /**
     * reads an entity GrupoAutomovel given its ID
     *
     * @param id
     * @return
     */
    @Override
    public GrupoAutomovel findById(Long id) {
        return getEntityManager().find(GrupoAutomovel.class, id);
    }

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    @Override
    public List<GrupoAutomovel> findAll() {
        Query query = getEntityManager().createQuery("SELECT e FROM GrupoAutomovel e");
        List<GrupoAutomovel> list = query.getResultList();
        return list;
    }

}
