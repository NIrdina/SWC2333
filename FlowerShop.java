
/**
 * Program Purpose: To demostrate the implementation
 * Programmer: Nurin
 * Date: 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;

//Driver class
public class FlowerShop
{//Driver method
    public static void main(String[] args)
    {
        //Declaration of an array of size 10 named flowers
        Flower[] flowers = new Flower[3];
        
        //Declaration of all variables
        String name, color;
        int price, quantity;
        
        
        for(int i = 0; i < 3; i++)
        {
            name = JOptionPane.showInputDialog("Enter the name of the Flower " + (i + 1) + " : ");
            color = JOptionPane.showInputDialog("Enter the color of the Flower : ");
            String pricestr = JOptionPane.showInputDialog("Enter the price of the Flower : "); // Added prompt for price
            String quantitystr = JOptionPane.showInputDialog("Enter the quantity of the Flower : "); // Added prompt for quantity
            price = Integer.parseInt(pricestr); // Parse price from string to integer
            quantity = Integer.parseInt(quantitystr); // Parse quantity from string to integer

            //Instantiate each element of the array
            flowers[i] = new Flower();
            
            //call the mutator to change the object state
            flowers[i].setFlower(name, color, price, quantity); 
            
            //Call the toString method
            System.out.println(flowers[i].toString());  
        }//end of for
        
        // Calculate and display the total values of the flower inventory
        double totalValue = 0.0;
        for (Flower flower : flowers) 
        {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("Total Value of Flower Inventory: RM" + totalValue);
        
        
        // Search for a flower by name
        String searchName = JOptionPane.showInputDialog("Enter the name of the Flower to search:");
        boolean found = false;
        for (Flower flower : flowers) 
        {
            if (flower.getName().equalsIgnoreCase(searchName)) 
            {
                JOptionPane.showMessageDialog(null, flower.toString(), "Flower Details", JOptionPane.INFORMATION_MESSAGE);
                found = true;
                break;
            }//end of if
        }//end of for
        
        if (!found) 
        {
            JOptionPane.showMessageDialog(null, "Flower not found.", "Search Result", JOptionPane.ERROR_MESSAGE);
        }//end of if

        // Restock a specific flower in the inventory
        String restockName = JOptionPane.showInputDialog("Enter the name of the flower to restock:");
        for (Flower flower : flowers) 
        {
            if (flower.getName().equalsIgnoreCase(restockName)) 
            {
                int restockQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity to restock:"));
                flower.restock(restockQuantity);
                JOptionPane.showMessageDialog(null, "Restocked successfully:\n" + flower.toString(), "Restock Result", JOptionPane.INFORMATION_MESSAGE);
                break;
        
             }//end of if
        }//end of for
    }//end of main
}//end of class
