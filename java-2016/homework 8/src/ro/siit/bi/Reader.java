package ro.siit.bi;

import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;

/**
 * Created by Alin Cipariu on 1/22/17. The AthleteReader class offers the
 * possibility to read information from a Reader object and parse it into
 * Athlete objects.
 */
public class Reader extends BufferedReader {

	public Reader(java.io.Reader arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	private static final String SEPARATOR = ",";

	/**
	 * The readAthletes method parses the information found in the object's
	 * provided Reader, and transforms it in a ArrayList of Athletes.
	 * 
	 * @return the ArrayList of Athlete objects which can be found in the
	 *         provided Reader
	 * @throws IOException
	 *             if the file to read from is broken
	 */

	public ArrayList<Athlete> readAthletes() throws IOException {
		String line = readLine();// asa era la mine metoda asta?..in mare
									// da...am modificat doar ce se
									// putea..variabile si nume
		ArrayList<Athlete> athletes = new ArrayList<>();
		while (line != null) {
			Athlete athlete = parseAthlete(line);
			athletes.add(athlete);
			line = readLine();
		}
		return athletes;
	}

	private Athlete parseAthlete(String source) {
		String[] tokens = source.split(SEPARATOR);
		String[] times = tokens[3].split(":");
		Cronometer time = new Cronometer(Integer.valueOf(times[0]), Integer.valueOf(times[1]));

		ArrayList<String> shots = new ArrayList<>();
		shots.add(tokens[4]);
		shots.add(tokens[5]);
		shots.add(tokens[6]);
		return new Athlete(Integer.valueOf(tokens[0]), tokens[1], tokens[2], time, shots);
	}
}