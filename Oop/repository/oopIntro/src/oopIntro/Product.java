package oopIntro;

public class Product {
	

	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double disCount;
	


	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDisCount() {
		return disCount;
	}

	public void setDisCount(double disCount) {
		this.disCount = disCount;
	}

	public double getUnitPriceAfterDisCount() {
		return this.unitPrice-(this.unitPrice*this.disCount/100);
	}

	public Product(int id, String name, double unitPrice, String detail, double dicCount,double unitPriceAfterDisCount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.disCount=dicCount;
	}
	
}
