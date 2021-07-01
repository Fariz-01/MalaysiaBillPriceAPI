package malaysia.bill.price.MalaysiaBillPrice.dao;

import java.util.List;

import malaysia.bill.price.MalaysiaBillPrice.entity.ElectricPrice;

public interface ElectricDAO {
	
	public ElectricPrice findById(int theId);
	
	public void updatePrice(ElectricPrice electricPrice);
	
	public List<ElectricPrice> findAll();
}
