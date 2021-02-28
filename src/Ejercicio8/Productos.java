package Ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DB.DB;

public class Productos {

	// METODO QUE CREA TABLAS MYSQL
		public static void createTableProductos(String db, String name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = DB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "CREATE TABLE " + name + "" + "" 
						+ "(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre varchar(100), Precio int);";
				Statement st = DB.conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");

			}

		}

		// METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertProductos(String db, String table_name, String nombre, int precio) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = DB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "INSERT INTO " + table_name + "(Nombre, Precio) VALUE"+ "(" 
						+ "\"" + nombre + "\","+  + precio + ");";
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
