import java.util.Scanner;
public class Inventory
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	public Inventory(String man, String n)
	{
		manufacturer = man;
		name = n;
		category = "Undefined";
		price = 0.00;
		UPC = (int)(Math.random()* 900000000)+100000000;
	}
	public Inventory(String man, String n, String cat, double p)
	{
		manufacturer = man;
		name = n;
		category = cat;
		price = p;
		UPC = (int)(Math.random()* 900000000)+100000000;
	}
	public String toString()
	{
		return "Inventory\nManufacturer: " + manufacturer + "\nItem Name: " + name + "\nItem Category: " + category + "\nUPC#: " + UPC;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Item Name: ");
		String n = kb.next();
		System.out.println("Manufacturer: ");
		String man = kb.next();
		
		Inventory item1;
		
		System.out.println("Would you like to enter category and price information?");
		String catAndPrice = kb.next();
		
		if (catAndPrice.equals("n"))
		{
			item1 = new Inventory(man, n);
		}
		else
		{
			System.out.println("Category: ");
			String cat = kb.next();
			System.out.println("Price: ");
			Double p = kb.nextDouble();
			item1 = new Inventory(man, n, cat, p);
		}
		System.out.println(item1);
	}
}