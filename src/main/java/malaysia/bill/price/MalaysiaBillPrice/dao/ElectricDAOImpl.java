package malaysia.bill.price.MalaysiaBillPrice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import malaysia.bill.price.MalaysiaBillPrice.entity.ElectricPrice;

@Repository
public class ElectricDAOImpl implements ElectricDAO {

	@Autowired
	EntityManager entityManager;

	@Override
	public ElectricPrice findById(int theId) {

		return entityManager.find(ElectricPrice.class, theId);
	}

	@Override
	public void updatePrice(ElectricPrice electricPrice) {

		entityManager.merge(electricPrice);
	}

	@Override
	public List<ElectricPrice> findAll() {

		// Create a query
		Query theQuery = entityManager.createQuery("from ElectricPrice");

		// Execute query and get result list
		List<ElectricPrice> electricPrice = theQuery.getResultList();

		// Return the results
		return electricPrice;
	}
}
