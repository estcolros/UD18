package Ejercicio4;

import DB.DB;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Peliculas {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTablePeliculas(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE PELICULAS"
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), CALIFICACIONEDAD INT)";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertPeliculas(String db, String table_name, String NOMBRE, int CALEDAD) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO PELICULAS (NOMBRE, CALIFICACIONEDAD) VALUE(" + "\"" + NOMBRE + "\" ," + CALEDAD
					+ ");";
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
