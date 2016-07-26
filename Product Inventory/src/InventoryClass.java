
public class InventoryClass {
	String ProductName;
	String Description;
	
	public InventoryClass(String productName, String description) {
		super();
		ProductName = productName;
		Description = description;
	}
	
	
	public void displayProductInfo(){
		System.out.println("Product Name: "+ProductName);
		System.out.println("Description: "+Description);
	}

}
