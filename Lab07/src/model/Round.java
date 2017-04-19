package model;

import java.util.List;

public class Round {

	List<Challenge> challenges;
	int id;
	String scheme;
	boolean state;

	double timeTaken;

	String userid;

	public List<Challenge> getChallenges() {
		return challenges;
	}

	public int getId() {
		return id;
	}

	public String getScheme() {
		return scheme;
	}
	public double getTimeTaken() {
		return timeTaken;
	}

	public String getUserid() {
		return userid;
	}

	public boolean isState() {
		return state;
	}

	public void setChallenges(List<Challenge> challenges) {
		this.challenges = challenges;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
}
