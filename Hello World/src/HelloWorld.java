import java.lang.Math;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		double lightspeed = 300000000; // m/s

		double distanceMarsMin = 54.6 * Math.pow(10, 9); // meters
		double distanceMarsMax = 401 * Math.pow(10, 9); // meters
		double distanceJupiterMin = 590 * Math.pow(10, 9); // meters
		double distanceJupiterMax = 970 * Math.pow(10, 9); // meters
		double distancePluto = 5800 * Math.pow(10, 9); // meters
		double distanceProximaCentauri = 40 * Math.pow(10, 15); // meters

		double distance = 0;

		Scanner scan = new Scanner(System.in);
		String planet = "";
		do {
			planet = scan.nextLine();
			if (planet.compareTo("exit") != 0) {

				switch (planet) {
				case "MarsMin":
					distance = distanceMarsMin;
					break;
				case "MarsMax":
					distance = distanceMarsMax;
					break;
				case "JupiterMin":
					distance = distanceJupiterMin;
					break;
				case "JupiterMax":
					distance = distanceJupiterMax;
					break;
				case "Pluto":
					distance = distancePluto;
					break;
				case "Proxima":
					distance = distanceProximaCentauri;
					break;
				default:
					distance = distanceMarsMin;
					planet = "MarsMin";
				}

				double result = distance / lightspeed;

				System.out.println(planet + " " + result + " seconds");
				System.out.println(planet + " " + result / 60.0 + " minutes");
				System.out.println(planet + " " + result / (60.0 * 60.0) + " hours");
				System.out.println(planet + " " + result / (60.0 * 60.0 * 24.0) + " days");
				System.out.println(planet + " " + result / (60.0 * 60.0 * 24.0 * 365.2422) + " years");
			}
		} while (planet.compareTo("exit") != 0);
		scan.close();
	}

}
