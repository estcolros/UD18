package Ejercicio4;

import java.sql.SQLException;
import java.sql.Statement;
import DB.DB;

import javax.swing.JOptionPane;

public class Salas {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTableSalas(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE SALAS"
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), PELICULA INT, FOREIGN KEY (PELICULA) REFERENCES PELICULAS(CODIGO) )";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertSalas(String db, String table_name, String NOMBRE, int PELICULA) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO SALAS (NOMBRE, PELICULA) VALUE(" + "\"" + NOMBRE + "\" ," + PELICULA + ");";
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
