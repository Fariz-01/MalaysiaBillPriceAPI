package malaysia.bill.price.MalaysiaBillPrice.service;

import java.util.List;

import malaysia.bill.price.MalaysiaBillPrice.entity.ElectricPrice;

public interface ElectricService {

	public ElectricPrice findById(int theId);

	public void updatePrice(ElectricPrice electricPrice);
	
	public List<ElectricPrice> findAll();
}
