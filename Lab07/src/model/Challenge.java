package model;

public class Challenge {

	int id;
	boolean state;
	double timeTaken;

	public int getId() {
		return id;
	}

	public double getTimeTaken() {
		return timeTaken;
	}

	public boolean isState() {
		return state;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}
}
