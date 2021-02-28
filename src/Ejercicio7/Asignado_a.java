package Ejercicio7;

import java.sql.SQLException;
import java.sql.Statement;
import DB.DB;
import javax.swing.JOptionPane;

public class Asignado_a {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTableAsignado_a(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE Asignado_a"
					+ "(CIENTIFICO VARCHAR(8), PROYECTO CHAR(4), PRIMARY KEY(CIENTIFICO, PROYECTO), "
					+ "foreign key(CIENTIFICO)references Cientificos(DNI), foreign key(PROYECTO)references Proyecto(ID))";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertAsignado_a(String db, String table_name, String CIENTIFICO, String PROYECTO) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO Asignado_a (CIENTIFICO, PROYECTO) VALUE(" + "\"" + CIENTIFICO + "\" ," + "\""
					+ PROYECTO + "\"" + ");";
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
