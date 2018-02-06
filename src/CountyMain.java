import java.util.Scanner;

public class CountyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the County name, County population, Years established, and Land Volume");

//String CountyName = scanner.nextLine();
//int CountyPopulation = scanner.nextInt();
//int YearsEstablished = scanner.nextInt();
//double LandVolume = scanner.nextDouble();

County county = new County(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());

System.out.println(county.Countyname);

System.out.println(county.CountyPopulation);

System.out.println(county.CountyYearEstablished);

System.out.println(county.CountylandVolume);

	}

}
