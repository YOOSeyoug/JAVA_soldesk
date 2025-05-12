package tanghulu;

public class Sales {
	
	private int totalSales = 0;
	
	public void addSales(int quantity) {
		totalSales += quantity;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	

}
