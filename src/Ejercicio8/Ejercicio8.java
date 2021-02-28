package Ejercicio8;

import java.sql.Connection;
import DB.DB;


public class Ejercicio8 {
	public static Connection conexion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LLAMADA A METODOS MYSQL
				DB.openConnection();
				DB.createDB("GrandesAlmacenes");
				
				Productos.createTableProductos("GrandesAlmacenes","Productos");
				Productos.insertProductos("GrandesAlmacenes","Productos", "Mandarinas",2);
				Productos.insertProductos("GrandesAlmacenes","Productos", "Pimientos",2);
				Productos.insertProductos("GrandesAlmacenes","Productos", "Berenjena",2);
				Productos.insertProductos("GrandesAlmacenes","Productos", "Tomate",2);
				Productos.insertProductos("GrandesAlmacenes","Productos", "Mango",2);
	
				Cajeros.createTableCajeros("GrandesAlmacenes","Cajeros");
				Cajeros.insertCajeros("GrandesAlmacenes","Cajeros","Juan");
				Cajeros.insertCajeros("GrandesAlmacenes","Cajeros","Marc");
				Cajeros.insertCajeros("GrandesAlmacenes","Cajeros","David");
				Cajeros.insertCajeros("GrandesAlmacenes","Cajeros","Mathias");
				Cajeros.insertCajeros("GrandesAlmacenes","Cajeros","Victor");				
				
				MaquinasRegistradoras.createTableMaquinasRegistradoras("GrandesAlmacenes","MaquinasRegistradoras");
				MaquinasRegistradoras.insertMaquinasRegistradoras("GrandesAlmacenes", "MaquinasRegistradoras", 1);
				MaquinasRegistradoras.insertMaquinasRegistradoras("GrandesAlmacenes", "MaquinasRegistradoras", 2);
				MaquinasRegistradoras.insertMaquinasRegistradoras("GrandesAlmacenes", "MaquinasRegistradoras", 3);
				MaquinasRegistradoras.insertMaquinasRegistradoras("GrandesAlmacenes", "MaquinasRegistradoras", 4);
				MaquinasRegistradoras.insertMaquinasRegistradoras("GrandesAlmacenes", "MaquinasRegistradoras", 5);
				
				Ventas.createTableVentas("GrandesAlmacenes","Ventas");
				Ventas.insertVentas("GrandesAlmacenes","Ventas",1,2,3);
				Ventas.insertVentas("GrandesAlmacenes","Ventas",1,2,3);
				Ventas.insertVentas("GrandesAlmacenes","Ventas",2,3,4);
				Ventas.insertVentas("GrandesAlmacenes","Ventas",4,1,2);
				Ventas.insertVentas("GrandesAlmacenes","Ventas",3,4,5);
				Ventas.insertVentas("GrandesAlmacenes","Ventas",1,1,1);

				
				DB.closeConnection();
	}
	
}
