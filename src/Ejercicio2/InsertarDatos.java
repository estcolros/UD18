package Ejercicio2;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import DB.DB;

public class InsertarDatos {

	// Insertar Departamento
	public static void insertDepartamento(String db, String table_name, String NOMBRE, int PRESUPUESTO) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (NOMBRE, PRESUPUESTO) VALUE(" + "\"" + NOMBRE + "\" ,"
					+ PRESUPUESTO + ");";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
			;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	// Insertar Artículo
	public static void insertEmpleado(String db, String table_name, String DNI, String nombre, String APELLIDO,
			int DEPARTAMENTO) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (DNI, NOMBRE, APELLIDO, DEPARTAMENTO) VALUES(" + "\"" + DNI
					+ "\" ," + "\"" + nombre + "\"," + "\"" + APELLIDO + "\"," + DEPARTAMENTO + ")";
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