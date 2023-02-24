package staticDemo;

public class ProductManager {
	public void Add(Product product) {
		ProductVlidator validatör = new ProductVlidator();
		if(validatör.isValid(product)){
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri eklenemedi.");
		}
		
	}

}
