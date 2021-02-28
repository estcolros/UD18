package Ejercicio6;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DB.DB;

public class Piezas {

	//METODO QUE CREA TABLAS MYSQL
			public static void createTablePiezas(String db,String name) {
				try {
					String Querydb = "USE " + db + ";";
					Statement stdb =DB.conexion.createStatement();
					stdb.executeUpdate(Querydb);

					String Query = "CREATE TABLE " + name + ""
							+ "(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre varchar(100));";
					Statement st =DB.conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada con exito!");

				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error crando tabla.");

				}
			}

			// METODO QUE INSERTA DATOS EN TABLAS MYSQL
			public static void insertPiezas(String db, String table_name, String Nombre) {
				try {
					String Querydb = "USE " + db + ";";
					Statement stdb =DB.conexion.createStatement();
					stdb.executeUpdate(Querydb);

					String Query = "INSERT INTO " + table_name + "(Nombre) VALUE(" 
							+ "\"" + Nombre + "\");";
					Statement st =DB.conexion.createStatement();
					st.executeUpdate(Query);

					System.out.println("Datos almacenados correctamente");
					;

				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}

			}
			
	
}
