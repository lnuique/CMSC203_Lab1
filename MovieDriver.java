import java.util.Scanner;

public class MovieDriver 
{
	
	
	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	String input, rating, again;
	
	int tickets;
	
	do
	
	{
		System.out.println("Enter a movie");
		input = keyboard.nextLine();
		
		System.out.println("Enter the rating of the movie " +input);
		rating = keyboard.nextLine();
		
		System.out.println("Enter the number of tickets sold for this movie");
		tickets = keyboard.nextInt();
		
		System.out.println(input+" "+"("+rating+"): " +"Tickets sold: " + tickets );
		
		System.out.println("Do you want to enter another movie? (y or n)");
		again = keyboard.next();
			
	}	while (again.equalsIgnoreCase("y"));
	
		System.out.println("Goodbye");
}
}