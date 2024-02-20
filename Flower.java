
/**
 * Program Description: To define the attributes and behaviours
 * Programmer Name: Nurin
 * Date: 20 February 2024
 */

public class Flower
{
    //Declaration of the instance variables
    private String name; 
    private String color;
    private double price;
    private int quantity;
    
    //Constructor without param
    public Flower()
    {
        name = null; 
        color = null;
        price = 0;
        quantity = 0;   
    }//end of constructor
    
    //Constructor with param /normal constructor
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name; 
        this.color = color;
        this.price = price;
        this.quantity = quantity;   
    }//end of constructor
    
    //Accessor/retriever/getter
    public String getName()
    {
        return name;        
    }//end of accessor
    
    public String getColor()
    {
        return color;
    }//end of accesssor
    
    public double getPrice()
    {
        return price;
    }//end of accessor
    
    public int getQuantity()
    {
        return quantity;
    }//end of accessor
    
     public void restock(int quantity) 
    {
        this.quantity += quantity;
    }//end of restock
    
    //Mutator for all data members
    public void setFlower(String name, String color, double price, int quantity)
    {
        this.name = name; 
        this.color = color;
        this.price = price;
        this.quantity = quantity;  
    }//end of mutator
    
    //toString method
    public String toString()
    {
        return ("Flower name = " + name +
                "\nColor = " + color +
                "\nPrice = " + price +
                "\nQuantity = " + quantity);
    }//end of toString
}//end of class

    