package malaysia.bill.price.MalaysiaBillPrice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="electric_bill_price")
public class ElectricPrice {
	
	// Define fields
	// Define constructors
	// Define getters/setters
	// Define toString
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String billName;
	
	@Column(name="price_bracket_1")
	private Double priceBracketOne;
	
	@Column(name="price_bracket_2")
	private Double priceBracketTwo;
	
	@Column(name="price_bracket_3")
	private Double priceBracketThree;
	
	@Column(name="price_bracket_4")
	private Double priceBracketFour;
	
	@Column(name="price_bracket_5")
	private Double priceBracketFive;
	
	@Column(name="price_bracket_6")
	private Double priceBracketSix;
	
	@Column(name="price_bracket_7")
	private Double priceBracketSeven;
	
	@Column(name="price_bracket_8")
	private Double priceBracketEight;
	
	@Column(name="price_bracket_9")
	private Double priceBracketNine;
	
	@Column(name="price_bracket_10")
	private Double priceBracketTen;
	
	@Column(name="price_bracket_11")
	private Double priceBracketEleven;
	
	public ElectricPrice() {
		
	}

	public ElectricPrice(String billName, Double priceBracketOne, Double priceBracketTwo, Double priceBracketThree,
			Double priceBracketFour, Double priceBracketFive, Double priceBracketSix, Double priceBracketSeven,
			Double priceBracketEight, Double priceBracketNine, Double priceBracketTen, Double priceBracketEleven) {
		this.billName = billName;
		this.priceBracketOne = priceBracketOne;
		this.priceBracketTwo = priceBracketTwo;
		this.priceBracketThree = priceBracketThree;
		this.priceBracketFour = priceBracketFour;
		this.priceBracketFive = priceBracketFive;
		this.priceBracketSix = priceBracketSix;
		this.priceBracketSeven = priceBracketSeven;
		this.priceBracketEight = priceBracketEight;
		this.priceBracketNine = priceBracketNine;
		this.priceBracketTen = priceBracketTen;
		this.priceBracketEleven = priceBracketEleven;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public Double getPriceBracketOne() {
		return priceBracketOne;
	}

	public void setPriceBracketOne(Double priceBracketOne) {
		this.priceBracketOne = priceBracketOne;
	}

	public Double getPriceBracketTwo() {
		return priceBracketTwo;
	}

	public void setPriceBracketTwo(Double priceBracketTwo) {
		this.priceBracketTwo = priceBracketTwo;
	}

	public Double getPriceBracketThree() {
		return priceBracketThree;
	}

	public void setPriceBracketThree(Double priceBracketThree) {
		this.priceBracketThree = priceBracketThree;
	}

	public Double getPriceBracketFour() {
		return priceBracketFour;
	}

	public void setPriceBracketFour(Double priceBracketFour) {
		this.priceBracketFour = priceBracketFour;
	}

	public Double getPriceBracketFive() {
		return priceBracketFive;
	}

	public void setPriceBracketFive(Double priceBracketFive) {
		this.priceBracketFive = priceBracketFive;
	}

	public Double getPriceBracketSix() {
		return priceBracketSix;
	}

	public void setPriceBracketSix(Double priceBracketSix) {
		this.priceBracketSix = priceBracketSix;
	}

	public Double getPriceBracketSeven() {
		return priceBracketSeven;
	}

	public void setPriceBracketSeven(Double priceBracketSeven) {
		this.priceBracketSeven = priceBracketSeven;
	}

	public Double getPriceBracketEight() {
		return priceBracketEight;
	}

	public void setPriceBracketEight(Double priceBracketEight) {
		this.priceBracketEight = priceBracketEight;
	}

	public Double getPriceBracketNine() {
		return priceBracketNine;
	}

	public void setPriceBracketNine(Double priceBracketNine) {
		this.priceBracketNine = priceBracketNine;
	}

	public Double getPriceBracketTen() {
		return priceBracketTen;
	}

	public void setPriceBracketTen(Double priceBracketTen) {
		this.priceBracketTen = priceBracketTen;
	}

	public Double getPriceBracketEleven() {
		return priceBracketEleven;
	}

	public void setPriceBracketEleven(Double priceBracketEleven) {
		this.priceBracketEleven = priceBracketEleven;
	}

	@Override
	public String toString() {
		return "ElectricPrice [id=" + id + ", billName=" + billName + ", priceBracketOne=" + priceBracketOne
				+ ", priceBracketTwo=" + priceBracketTwo + ", priceBracketThree=" + priceBracketThree
				+ ", priceBracketFour=" + priceBracketFour + ", priceBracketFive=" + priceBracketFive
				+ ", priceBracketSix=" + priceBracketSix + ", priceBracketSeven=" + priceBracketSeven
				+ ", priceBracketEight=" + priceBracketEight + ", priceBracketNine=" + priceBracketNine
				+ ", priceBracketTen=" + priceBracketTen + ", priceBracketEleven=" + priceBracketEleven + "]";
	}
	
}
