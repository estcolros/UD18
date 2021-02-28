package Ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DB.DB;

public class Ventas {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTableVentas(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + "" + "" + "(Cajero int, Maquina int, Producto int, "
					+ "foreign key (Cajero) references Cajeros(Codigo),"
					+ "foreign key (Maquina) references MaquinasRegistradoras(Codigo),"
					+ "foreign key (Producto) references Productos(Codigo));";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertVentas(String db, String table_name, int cajero, int maquina, int producto) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + "(Cajero,Maquina,Producto) VALUE" + "("+ cajero + "," + maquina + "," +producto + ");";
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
