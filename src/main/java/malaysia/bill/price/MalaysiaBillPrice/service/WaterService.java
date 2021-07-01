package malaysia.bill.price.MalaysiaBillPrice.service;

import java.util.List;

import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;

public interface WaterService {

	public WaterPrice findById(int theId);

	public void updatePrice(WaterPrice waterPrice);
	
	public List<WaterPrice> findAll();
}
