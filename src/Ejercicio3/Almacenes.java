package Ejercicio3;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DB.DB;

public class Almacenes {
		
	//METODO QUE CREA TABLAS MYSQL
			public static void createTableAlmacenes(String db,String name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb= DB.conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE "+name+""
							+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, Lugar VARCHAR(100), Capacidad INT)";
					Statement st= DB.conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada con exito!");
					
				}catch (SQLException ex){
					System.out.println(ex.getMessage());
					System.out.println("Error crando tabla.");
					
				}
				
			}
			

			//METODO QUE INSERTA DATOS EN TABLAS MYSQL
			public static void insertAlmacenes(String db, String table_name, String Lugar, int  Capacidad) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb= DB.conexion.createStatement();
					stdb.executeUpdate(Querydb);
								
					String Query = "INSERT INTO " + table_name + " (Lugar, Capacidad) VALUE("+ "\"" + Lugar + "\" , " + Capacidad + " );";
					Statement st = DB.conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");;
					
				} catch (SQLException ex ) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
							
			}
}
