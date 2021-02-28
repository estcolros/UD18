package Ejercicio9;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DB.DB;

public class Equipos {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTableEquipos(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + "" + ""
					+ "(NumSerie varchar(4) primary key, Nombre varchar(100), Facultad int,"
					+ "foreign key (Facultad) references Facultad(Codigo));";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertEquipos(String db, String table_name, String numSerie, String nombre, int facultad) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + "(NumSerie,Nombre,Facultad) VALUE" + "(" + "\"" + numSerie
					+ "\"," + "\"" + nombre + "\"," + +facultad + ");";
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
