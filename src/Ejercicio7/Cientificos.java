package Ejercicio7;

import java.sql.SQLException;
import java.sql.Statement;
import DB.DB;
import javax.swing.JOptionPane;

public class Cientificos {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTableCientificos(String db, String Name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE Cientificos" + "(DNI VARCHAR(8) PRIMARY KEY, NOMAPELS VARCHAR(255))";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertCientificos(String db, String table_name, String DNI, String NOMAPELS) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO Cientificos (DNI, NOMAPELS) VALUE(" + "\"" + DNI + "\" ," + "\"" + NOMAPELS
					+ "\"" + ");";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
			;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

}
