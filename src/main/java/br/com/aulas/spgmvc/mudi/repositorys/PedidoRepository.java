package br.com.aulas.spgmvc.mudi.repositorys;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aulas.spgmvc.mudi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	@PersistenceContext

	// classe utilizada no jpa sem o spring boot
//	private EntityManager entityManager;
	
	public List<Pedido> findAll();

	// Método antigo utilizando jpa
//		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
//		List<Pedido> listaPedidos = query.getResultList();
//		return listaPedidos;
	
	
}
