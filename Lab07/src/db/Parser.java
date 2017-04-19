package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Challenge;
import model.Round;

public class Parser {
	public List<Round> read(String file) {
		List<Round> rounds = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)))) {
			bufferedReader.readLine();
			bufferedReader.readLine();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] columns = line.replace("\"", "").split(",");

				try {
					if (Double.parseDouble(columns[3]) != 0) {
						Round round = new Round();
						round.setUserid(columns[0]);
						round.setScheme(columns[2]);
						round.setTimeTaken(Double.parseDouble(columns[3]));
						round.setState(Boolean.parseBoolean(columns[4]));

						List<Challenge> challenges = new ArrayList<>();
						for (int i = 6; i < 24; i += 3) {
							try {
								Challenge c = new Challenge();
								c.setTimeTaken(Double.parseDouble(columns[i]));
								c.setState(Boolean.parseBoolean(columns[i + 1]));
								challenges.add(c);
							} catch (Exception ignored) {
							}
						}
						round.setChallenges(challenges);
						rounds.add(round);
					}
				} catch (ArrayIndexOutOfBoundsException ignored) {

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rounds;
	}

}
