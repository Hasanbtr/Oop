package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product(1,"Lenovo",15000,"16GB Ram", 10, 13500);//instance/referans oluşturma
		
	 
		
Product product2=new Product();//instance/referans oluşturma
product2.setId(2);
product2.setName(",lenovovo");
product2.setDetail("16GbRam");
product2.setDisCount(10);
product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDisCount());

Category category1=new Category();
category1.setId(1);
category1.setName("İçecek");

Category category2=new Category();
category2.setId(2);
category2.setName("Yiyecek");

ProductManager manager=new ProductManager();
manager.addToCart(product2);

System.out.println(category1.getName());
System.out.println(category2.getName());
System.out.println(product2.getName());
		

}}
