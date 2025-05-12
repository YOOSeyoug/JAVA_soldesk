package tanghulu;

public class Tanghulu {
	
	private String fruitName;
	private int price;
	
	public Tanghulu (String fruitName, int price) {
		this.fruitName = fruitName;
		this.price = price;
	}
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return fruitName + ": " + price + "¿ø";
	}
	
	

}
