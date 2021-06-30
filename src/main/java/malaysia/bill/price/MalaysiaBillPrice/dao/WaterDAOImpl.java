package malaysia.bill.price.MalaysiaBillPrice.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;

@Repository
public class WaterDAOImpl implements WaterDAO {

	@Autowired
	EntityManager entityManager;

	@Override
	public WaterPrice findById(int theId) {

		return entityManager.find(WaterPrice.class, theId);
	}

	@Override
	public void updatePrice(WaterPrice waterPrice) {
		
		entityManager.merge(waterPrice);
	}
}
