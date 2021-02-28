package Ejercicio5;

import DB.DB;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas{
	//Crea tabla Despacho
	public static void createTableDespacho(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(NUMERO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), CAPACIDAD INT);";
			Statement st= DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	// Crea tabla Directores
	public static void createTableDirectores(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(DNI VARCHAR(9) PRIMARY KEY, NOMBAPELLIDO VARCHAR(255), DNIJEFE VARCHAR(9), DESPACHO INT,FOREIGN KEY (DNIJEFE) references Directores(DNI), FOREIGN KEY (DESPACHO) references Despacho(NUMERO));";
			Statement st= DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
}
