import java.util.Scanner;

public class Cold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);

Hot pop [] = new Hot [3];
for (int i = 0; i < 3; i++){

System.out.println("Please Enter The Dogs Name?");
System.out.println("Please Enter The Breed?");
//String DogName = scan.nextLine();
//String DogBreed =  scan.nextLine();


pop [i] = new  Hot(scan.nextLine(), scan.nextLine());

		
	}


System.out.println(pop[1].Name);
System.out.println(pop[1].Breed);

	}
	
	

}
