package malaysia.bill.price.MalaysiaBillPrice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import malaysia.bill.price.MalaysiaBillPrice.entity.WaterPrice;
import malaysia.bill.price.MalaysiaBillPrice.service.WaterService;

@RestController
@RequestMapping("/api")
public class WaterPriceController {
	
	@Autowired
	private WaterService waterService;

	// Define GetMapping to find by id
	@GetMapping("/water/{waterId}")
	public WaterPrice findById(@PathVariable int waterId) {
		
		WaterPrice waterPrice = waterService.findById(waterId);
		
		if (waterPrice == null) {
			throw new BillNotFoundException("Electric Provider does not exist with id - " + waterId);
		}
		
		return waterPrice;
	}
	
	// Define PutMapping to update price
	@PutMapping("/water")
	public WaterPrice updatePrice(@RequestBody WaterPrice waterPrice) {
		
		waterService.updatePrice(waterPrice);
		
		return waterPrice;
	}
	
	// Define GetMapping to find all
	@GetMapping("/water")
	public List<WaterPrice> findAll() {
		
		return waterService.findAll();
	}
}
