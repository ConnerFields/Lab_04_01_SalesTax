//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTax
{
    public static void main(String[] args)
    {
        double price = 10; //will be input by user later
        double SALES_TAX = 1.05; //this is static and will always be the same
        double totalPrice; //this will be calculated later

        totalPrice = price * SALES_TAX; //calculating totalPrice

        System.out.println("The cost of the item is $"+price+" with tax the total comes to $"+totalPrice); //displaying total to customer
    }
}