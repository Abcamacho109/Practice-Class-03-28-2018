import java.util.Scanner;

public class Chops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Mops blue [] = new Mops [5];
		blue [0] = new Mops("Jungle Book", "Adventure", 7);
		blue [1] = new Mops("Olyumus Has Fallen", "Action", 10);
		blue [2] = new Mops("The Notebook", "Romance", 8);
		blue [3] = new Mops("The Titanic", "Drama", 10);
		blue [4] = new Mops("Cinderella", "Adventure", 8);
	
		
		System.out.println("Please enter a movie?");
		String colors = scan.nextLine();
		
		if(colors.equals(blue[0].Name)){
			System.out.println(blue[0].Name);
			System.out.println(blue[0].Genere);
			System.out.println(blue[0].Rating);
		}else{
			System.out.println("Not Found");
		}
		
	}

}
