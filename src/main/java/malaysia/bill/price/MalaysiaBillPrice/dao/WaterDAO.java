package malaysia.bill.price.MalaysiaBillPrice.dao;

import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;

public interface WaterDAO {
	
	public WaterPrice findById(int theId);
	
	public void updatePrice(WaterPrice waterPrice);
}
