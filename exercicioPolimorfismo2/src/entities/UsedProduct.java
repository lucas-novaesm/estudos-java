package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufacturedDate;

    //Constructors
    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    //Getters and Setters
    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    //Methods
    //Portuguese: Utilizamos o "@Override" quando iremos sobrepor um método de uma super classe.
    //            Aqui podemos notar que diferente do que fizemos na super classe, utilizamos o "get", para chamar o atributo "name", afinal, ele pertence a classe "Product".
    
    //English: We use "@Override" when we are going to override a method of a super class.
    //         Here we can notice that unlike what we did in the super class, we use "get" to call the "name" attribute, after all, it belongs to the "Product" class.
    @Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufacturedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}

    
    
}
