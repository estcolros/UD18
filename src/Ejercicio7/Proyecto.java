package Ejercicio7;
import java.sql.SQLException;
import java.sql.Statement;
import DB.DB;
import javax.swing.JOptionPane;

public class Proyecto {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTableProyecto(String db, String Name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Proyecto"
					+ "(ID CHAR(4) PRIMARY KEY, NOMBRE VARCHAR(255), HORAS INT)";
			Statement st= DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertProyecto(String db, String table_name, String ID, String NOMBRE, int HORAS) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Proyecto (ID, NOMBRE, HORAS) VALUE(" 
					+ "\"" + ID + "\" ,"
					+ "\"" + NOMBRE + "\" ,"
							+HORAS+
							");";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}

}


