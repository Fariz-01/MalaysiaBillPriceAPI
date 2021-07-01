package malaysia.bill.price.MalaysiaBillPrice.dao;

import java.util.List;

import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;

public interface WaterDAO {
	
	public WaterPrice findById(int theId);
	
	public void updatePrice(WaterPrice waterPrice);
	
	public List<WaterPrice> findAll();
}
