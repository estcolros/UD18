package Ejercicio6;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DB.DB;

public class Suministra {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTableSuministra(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + "" + "(CodigoPieza int, IdProveedor varchar(4), precio int, "
					+ "foreign key (CodigoPieza) references Piezas(Codigo),"
					+ "foreign key (IdProveedor) references Proveedores(Id));";
			Statement st = DB.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertSuministra(String db, String table_name, int codigoPieza, String idProveedor, int precio) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = DB.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + "(CodigoPieza,IdProveedor, Precio) VALUE(" + +codigoPieza + ","
					+ "\"" + idProveedor + "\"," + +precio + ");";
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
