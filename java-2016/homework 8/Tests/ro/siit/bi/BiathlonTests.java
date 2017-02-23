package ro.siit.bi;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BiathlonTests {

	@Test
	public void athleteComparesCorrectlyWithAnotherOne() {
		// given
		Cronometer time = new Cronometer(30, 27);
		ArrayList<String> shots = new ArrayList<>();
		// when
		shots.add("xxxxx");
		shots.add("xxxxx");
		shots.add("xxxxx");
		Athlete expected = new Athlete(11, "Umar Jorgson", "SK", time, shots);
		ArrayList<String> shots2 = new ArrayList<>();
		shots2.add("oxxxx");
		shots2.add("xxxxx");
		shots2.add("xxxxx");
		// then
		Athlete expected2 = new Athlete(11, "Umar Jorgson", "SK", time, shots2);
		Assert.assertEquals(expected.compareTo(expected2), -1);
	}

	@Test
	public void timesAreComparedCorrectly() {
		Cronometer b1 = new Cronometer(32, 4);
		Cronometer b2 = new Cronometer(31, 3);
		Assert.assertEquals(b1.compareTo(b2), +1);
	}

	@Test
	public void readAthleteFromGoodCSV_AndParseHimIntoAList() throws IOException {
		String csv = "3,Jack Robinson,USA,30:19,xxxxo,ooooo,xxxxx";
		StringReader sr = new StringReader(csv);
		ArrayList<Athlete> listOfAthletes = null;
		try (Reader reader = new Reader(sr)) {
			listOfAthletes = reader.readAthletes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, listOfAthletes.size());
		Cronometer temp = new Cronometer(30, 19);
		ArrayList<String> listOfShots = new ArrayList<>();
		listOfShots.add(0, "xxxxo");
		listOfShots.add(1, "ooooo");
		listOfShots.add(2, "xxxxx");
		System.out.println(listOfAthletes.get(0));
		Athlete ath = new Athlete(3, "Jack Robinson", "USA", temp, listOfShots);
		System.out.println(ath);
		Assert.assertEquals(listOfAthletes.get(0).equals(ath), false);
	}

	@Test
	public void competitionWithUnsortedAthletesHasThemSorted() {
		Cronometer t1 = new Cronometer(30, 20);
		Cronometer t2 = new Cronometer(31, 20);
		ArrayList<String> shots1 = new ArrayList<>();
		ArrayList<String> shots2 = new ArrayList<>();
		shots1.add("xxxxx");
		shots1.add("xxxxx");
		shots1.add("xxxxx");
		shots2.add("xxxxx");
		shots2.add("xxxxx");
		shots2.add("xxxxx");
		Athlete a1 = new Athlete(2, "as", "as", t1, shots1);
		Athlete a2 = new Athlete(2, "as", "as", t2, shots1);
		ArrayList<Athlete> athletes = new ArrayList<>();
		athletes.add(a2);
		athletes.add(a1);
		Competition biathlonCompetition = new Competition(athletes);
		ArrayList<Athlete> result;
		result = biathlonCompetition.getAthletesInDescendingOrder();

		ArrayList<Athlete> expected = new ArrayList<>();
		expected.add(a1);
		expected.add(a2);

		Assert.assertEquals(result.equals(expected), true);
	}
}
