package ro.siit.bi;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements Comparable API 
 * Created by Alin Cipariu on 21/01/17
 */
public class Athlete implements Comparable<Athlete> {
	public String name;
	public int number;
	public Cronometer time;
	public List<String> listofshots = new ArrayList<>();
	private String country;

	/**
	 * This is a constructor that contains 3 fields 
	 * Created by Alin Cipariu on
	 * 21/01/17
	 */
	public Athlete(String name, int number, Cronometer time) {
		this.name = name;
		this.number = number;
		this.time = time;

	}

	/**
	 * This is a constructor 
	 * Created by Alin Cipariu on 21/01/17
	 */
	public Athlete(Integer valueOf, String string, String string2, Cronometer time2, List<String> listOfShots2) {
		this.name = string;
		this.number = valueOf;
		this.country = string2;
		this.time = time2;
		this.listofshots = listOfShots2;
	}

	public Cronometer getTime() {
		return time;
	}

	/** This method calculates the panalties for shoot series
	 * Created by Alin Cipariu on 27/1/17.
	 */
	private Cronometer calulatePenaltyForShootSeries(String s) {
		String[] shotResult = s.split("-");
		Cronometer penalty = new Cronometer(number, number);
		for (String r : shotResult) {
			if (r != "x") {
				penalty.countSeconds(10);
			}
		}
		return penalty;
	}

	/**
	 * Created by Alin Cipariu on 27/1/17.
	 */
	public void calculateTimeWithPenaltiesOfMissedShots() {
		for (String s : listofshots) {
			time.countTime(calulatePenaltyForShootSeries(s));
		}

	}

	@Override
	public String toString() {
		return "Athlete [name=" + name + ", number=" + number + ", time=" + time + ", listofshots=" + listofshots + "]";
	}

	@Override
	public int compareTo(Athlete o) {
		return this.time.compareTo(o.getTime());
	}

}
