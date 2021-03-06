import java.sql.*;

public class JdbcDemo1 {

	/**
	 * @JDBC demo
	 */

	public static void main(String[] args) {
		Conect c = new Conect();
		try {
			// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = c.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from person");
			while (rs.next()) {
				String name, ad, ph;
				name = rs.getString("Name");
				ad = rs.getString(3);
				ph = rs.getString(4);

				System.out.println( name + "  " + ad+ " Phone: " + ph);

			}
		} catch (Exception e) {
			System.out.println("Error " + e);
		} finally {
			c.close();
		}
	}

}
