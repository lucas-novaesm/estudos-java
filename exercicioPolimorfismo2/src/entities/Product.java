package entities;

public class Product {
    private String name;
    private Double price;

    //Contructors
    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Methods
    //Portuguese: No método "priceTag" abaixo, retornamos o atributo "name" sem utilizar o "get", pois se trata de um atributo pertencente a esta mesma classe.
    //English: In the "priceTag" method below, we return the "name" attribute without using "get", as it is an attribute belonging to this same class.
    public String priceTag(){
        return name + " $ " + price;
    }

    
}
