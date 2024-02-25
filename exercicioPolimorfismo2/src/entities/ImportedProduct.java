package entities;

public class ImportedProduct extends Product {
    private Double customFee;

    //Constructors
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    //Getters and Setters
    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public Double totalPrice(){
        return getPrice() + customFee;
    }

    //Methods
    //Portuguese: Utilizamos o "@Override" quando iremos sobrepor um método de uma super classe.
    //            Aqui podemos notar que diferente do que fizemos na super classe, utilizamos o "get", para chamar o atributo "name", afinal, ele pertence a classe "Product".
    
    //English: We use "@Override" when we are going to override a method of a super class.
    //         Here we can notice that unlike what we did in the super class, we use "get" to call the "name" attribute, after all, it belongs to the "Product" class.
    @Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customFee)
				+ ")";
	}

    
}
