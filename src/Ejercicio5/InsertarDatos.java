package Ejercicio5;

import DB.DB;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertarDatos {
	//Inserta datos en la tabla Despacho
	public static void insertDespacho(String db, String table_name,  String NOMBRE, int CAPACIDAD) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NOMBRE, CAPACIDAD) VALUE(" 
					+ "\"" + NOMBRE + "\" ,"
							+ CAPACIDAD+");";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	// Insertar datos en la tabla Art�culo
	public static void insertDirector(String db, String table_name, String DNI, String nombreAPELLIDO ,String DNIJEFE,  int DESPACHO) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (DNI, NOMBAPELLIDO, DNIJEFE, DESPACHO) VALUES(" 
					+ "\"" + DNI + "\" ,"
					+ "\""+nombreAPELLIDO +  "\","
					+ "\"" +DNIJEFE+ "\","
					+ DESPACHO + ");";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
}
