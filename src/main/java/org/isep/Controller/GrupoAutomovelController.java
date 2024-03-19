package org.isep.Controller;


import org.isep.Domain.GrupoAutomovel;
import org.isep.Persistence.GrupoAutomovelRepositorio;
import org.isep.Persistence.GrupoAutomovelRepositorioJPAImpl;

import java.util.List;

public class GrupoAutomovelController {

    public GrupoAutomovel registarGrupoAutomovel(String nome, int portas, String classe) {
        GrupoAutomovel grupo1 = new GrupoAutomovel(nome, portas, classe);
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.add(grupo1);
    }

    public List<GrupoAutomovel> listarGruposAutomoveis() {
        throw new UnsupportedOperationException("Ainda não implementada");
    }

    public GrupoAutomovel procurarGrupoAutomovel(long id) {
        throw new UnsupportedOperationException("Ainda não implementada");
    }

        /*  Versão  sem usar padrão repositório
	 private GrupoAutomovel gravarGA(GrupoAutomovel gAuto) {

	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 manager.getTransaction().begin();
	 manager.persist(gAuto);
	 manager.getTransaction().commit();

	 manager.close();
	 return gAuto;
	 }

	 private List<GrupoAutomovel> listarTodos() {


	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 Query query = manager.createQuery("select ga from GrupoAutomovel ga");
	 List<GrupoAutomovel> results = query.getResultList();

	 for (GrupoAutomovel result : results) {
	 System.out.println(result);
	 }

	 manager.close();
	 return results;
	 }

	 private EntityManager criarEntityManager(String persistenceUnit) {
	 EntityManagerFactory factory = Persistence.
	 createEntityManagerFactory(persistenceUnit);
	 EntityManager manager = factory.createEntityManager();
	 return manager;
	 }
	 */
}
