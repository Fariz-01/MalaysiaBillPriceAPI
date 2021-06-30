package malaysia.bill.price.MalaysiaBillPrice.service;

import malaysia.bill.price.MalaysiaBillPrice.entity.ElectricPrice;

public interface ElectricService {

	public ElectricPrice findById(int theId);

	public void updatePrice(ElectricPrice electricPrice);
}
