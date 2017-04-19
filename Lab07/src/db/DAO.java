package db;

import model.Round;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAO {
	public Round get(int id) {
		// Get specified round from database and return
		return null;
	}

	public List<Round> getAll() {
		// TODO: Fetch all rounds from database and return
		return null;
	}

	public void save(Round round) {
		try (Session session = Connection.getSession()) {
			Transaction t = session.beginTransaction();
			session.persist(round);
			t.commit();
		}
	}
}
