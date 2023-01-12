package projects.exception;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class DbEcxeption extends RuntimeException {

	public DbEcxeption(SQLException e) {
     super(e);
	}

}
