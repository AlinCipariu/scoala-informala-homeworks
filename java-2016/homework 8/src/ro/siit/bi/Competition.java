package ro.siit.bi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains two lists 
 * Created by Alin Ciapriu on 27/01/17.
 */
public class Competition {
	private static List<Athlete> listOfAthletes = new ArrayList<>();
	private List<Athlete> listOfWinners = new ArrayList<>();

	/**
	 * 
	 * Created by Alin Cipariu on 27/01/17.
	 */
	public Competition(ArrayList<Athlete> listOfAthletes) {
		this.listOfAthletes = listOfAthletes;
		System.out.println(listOfAthletes);
		Collections.sort(this.listOfAthletes);
		if (listOfAthletes.size() > 2) {
			listOfWinners.add(listOfAthletes.get(0));
			listOfWinners.add(listOfAthletes.get(1));
			listOfWinners.add(listOfAthletes.get(2));
		} else {
			System.out.println("not enough members");
		}
	}

	public ArrayList<Athlete> getWinners() {
		return (ArrayList<Athlete>) listOfWinners;
	}

	public static ArrayList<Athlete> getAthletesInDescendingOrder() {
		return (ArrayList<Athlete>) listOfAthletes;
	}

	public Object getFinalList() {
		// TODO Auto-generated method stub
		return null;
	}
}
