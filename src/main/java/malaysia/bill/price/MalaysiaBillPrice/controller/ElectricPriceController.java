package malaysia.bill.price.MalaysiaBillPrice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import malaysia.bill.price.MalaysiaBillPrice.entity.ElectricPrice;
import malaysia.bill.price.MalaysiaBillPrice.service.ElectricService;

@RestController
@RequestMapping("/api")
public class ElectricPriceController {

	@Autowired
	private ElectricService electricService;

	// Add GetMapping to find by id
	@GetMapping("/electric/{electricId}")
	public ElectricPrice findById(@PathVariable int electricId) {

		ElectricPrice electricPrice = electricService.findById(electricId);
		
		if (electricPrice == null) {
			throw new BillNotFoundException("Electric Provider does not exist with id - " + electricId);
		}

		return electricService.findById(electricId);
	}

	// Add PutMapping to update price
	@PutMapping("/electric")
	public ElectricPrice updatePrice(@RequestBody ElectricPrice electricPrice) {

		electricService.updatePrice(electricPrice);

		return electricPrice;
	}
	
	// Add GetMapping to find all
	@GetMapping("/electric")
	public List<ElectricPrice> findAll() {
		
		return electricService.findAll();
	}
}










