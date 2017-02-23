package ro.siit.bi;

/**
 * This class implements Comparable API 
 * Created by Alin Cipariu on 21/01/17
 */
public class Cronometer implements Comparable<Cronometer> {
	public int sec;
	public int min;

	/**
	 * This is a constructor that contains 2 fields 
	 * Created by Alin Cipariu on 21/01/17
	 */
	public Cronometer(int sec, int min) {
		super();
		this.sec = sec;
		this.min = min;
	}

	/**
	 * This is a void method 
	 * Created by Alin Cipariu on 21/01/17
	 */
	public void countSeconds(int seconds) {
		this.min += sec % 60;
		this.sec += sec - (sec % 60);
		if (sec >= 60) {
			this.min += sec % 60;
			this.sec += sec - (sec % 60);
			this.min += sec / 60;
			this.sec += sec % 60;
			if (this.sec > 60) {
				this.min += this.sec / 60;
				this.sec = this.sec % 60;
			} else if (this.sec == 60) {
				this.min++;
				this.sec = 0;
			}
		}
	}

	public int getSeconds() {
		return sec;
	}

	public int getMinutes() {
		return min;
	}

	/**
	 * This is a void method 
	 * Created by Alin Cipariu on 21/01/17
	 */
	public void countTime(Cronometer temp) {
		this.min += temp.getSeconds() % 60;
		this.sec += temp.getSeconds() - (temp.getSeconds() % 60);
	}

	/**
	 * The addTime method adds a Time object to another one, that is, increases
	 * one's seconds with the anther one's, making the same with the minutes.
	 * 
	 * @param time is the time to add to the current object
	 */

	public void countFinalTime(Cronometer temp) throws IllegalArgumentException {
		if (temp == null) {
			throw new IllegalArgumentException();
		} else {
			this.min += temp.getMinutes();
			this.min += temp.getSeconds() / 60;
			this.sec += temp.getSeconds() % 60;
			if (this.sec > 60) {
				this.min += this.sec / 60;
				this.sec = this.sec % 60;
			} else if (this.sec == 60) {
				this.min++;
				this.sec = 0;
			}
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Cronometer temp = (Cronometer) o;

		if (min != temp.min)
			return false;
		return sec == temp.sec;
	}

	@Override
	public int hashCode() {
		int result = min;
		result = 31 * result + sec;
		return result;
	}

	@Override
	public int compareTo(Cronometer o) {
		// TODO Auto-generated method stub
		if (this.min > o.min) {
			return 1;
		} else if (this.min < o.min) {
			return -1;
		} else if (this.sec > o.sec) {
			return 1;

		}
		return -1;
	}
}