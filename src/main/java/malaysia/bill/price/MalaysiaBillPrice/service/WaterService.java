package malaysia.bill.price.MalaysiaBillPrice.service;

import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;

public interface WaterService {

	public WaterPrice findById(int theId);

	public void updatePrice(WaterPrice waterPrice);
}
