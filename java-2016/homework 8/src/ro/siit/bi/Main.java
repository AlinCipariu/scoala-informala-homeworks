package ro.siit.bi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * This is the main class Created by Alin Cipariu on 27/01/2017
 */
public class Main {
	/**
	 * This is the main method Created by Alin Cipariu on 27/01/2017
	 */
	public static void main(String[] args) {
		ArrayList<Athlete> listOfAthletes = new ArrayList<>();

		// public <Athlete> addAthlete() {
		// listOfAthletes.add
		// }
		File file = new File(
				"C:/Users/Kypy Kyp/Documents/scoala-informala-homeworks/java-2016/homework 8/biathlon.csv");

		try (Reader reader = new Reader(Files.newBufferedReader(file.toPath()))) {
			listOfAthletes = reader.readAthletes();
			System.out.println(listOfAthletes);
		} catch (IOException e) {
			System.out.println("File doesn't exist!");
			e.printStackTrace();

		}

		Competition comp = new Competition(listOfAthletes);

		Cronometer time = new Cronometer(30, 27);
		ArrayList<String> shots = new ArrayList<>();
		shots.add("xxxxx");
		shots.add("xxxxx");
		shots.add("xxxxx");
		Athlete expected = new Athlete(11, "Umar Jorgson", "SK", time, shots);
		ArrayList<String> shots2 = new ArrayList<>();
		shots2.add("oxxxx");
		shots2.add("xxxxx");
		shots2.add("xxxxx");
		Athlete expected2 = new Athlete(11, "Umar Jorgson", "SK", time, shots2);

		System.out.println(expected.compareTo(expected2));
	}
}
