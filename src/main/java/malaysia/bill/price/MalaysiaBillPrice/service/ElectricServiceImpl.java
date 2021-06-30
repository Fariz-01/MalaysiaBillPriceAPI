package malaysia.bill.price.MalaysiaBillPrice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import malaysia.bill.price.MalaysiaBillPrice.dao.ElectricDAO;
import malaysia.bill.price.MalaysiaBillPrice.entity.ElectricPrice;

@Service
public class ElectricServiceImpl implements ElectricService {

	@Autowired
	ElectricDAO electricDAO;

	@Override
	@Transactional
	public ElectricPrice findById(int theId) {

		return electricDAO.findById(theId);
	}

	@Override
	@Transactional
	public void updatePrice(ElectricPrice electricPrice) {
		
		electricDAO.updatePrice(electricPrice);
	}

}
