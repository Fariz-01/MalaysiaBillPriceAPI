package malaysia.bill.price.MalaysiaBillPrice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import malaysia.bill.price.MalaysiaBillPrice.dao.WaterDAO;
import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;

@Service
public class WaterServiceImpl implements WaterService {
	
	@Autowired
	WaterDAO waterDAO;

	@Override
	@Transactional
	public WaterPrice findById(int theId) {

		return waterDAO.findById(theId);
	}

	@Override
	@Transactional
	public void updatePrice(WaterPrice waterPrice) {
		
		waterDAO.updatePrice(waterPrice);
	}

	@Override
	public List<WaterPrice> findAll() {
		
		return waterDAO.findAll();
	}

}
