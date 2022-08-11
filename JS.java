package JS;
import java.util.Scanner;

public class JS {

	public static void main(String[] args) {
		
		
	}

}

class Buyer{
	int money=1000;
	Product[] cart=new Product[3];
	int i=0;
	
	void buy(Product p) {
		
	}
	
	void add(Product p) {
		
	}

	void summary() {
		
	}
}

class Product{
	int price;
	
	Product(int price){
		this.price=price;
	}
}

class Tv extends Product{
	Tv(){super(100);}
	
	public String toString() {return"TV"};
	
	
}

class Computer extends Product{
	Computer(){super(100);}
	
	public String toString() {return"Computer"};
	
	
}


class Audio extends Product{
	Audio(){super(100);}
	
	public String toString() {return"Audio"};
	
	
}