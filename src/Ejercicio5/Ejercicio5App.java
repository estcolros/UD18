package Ejercicio5;

import DB.DB;

public class Ejercicio5App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DB.openConnection();
		DB.createDB("LosDirectores");
		CrearTablas.createTableDespacho("LosDirectores", "Despacho");
		CrearTablas.createTableDirectores("LosDirectores", "Directores");
		InsertarDatos.insertDespacho("LosDirectores", "Despacho", "Despacho1", 15);
		InsertarDatos.insertDirector("LosDirectores", "Directores", "12345678A", "Juan P�rez", "12345678A", 1);
		InsertarDatos.insertDespacho("LosDirectores", "Despacho", "Despacho2", 15);
		InsertarDatos.insertDirector("LosDirectores", "Directores", "22345678A", "Juan P�rez", "12345678A", 2);
		InsertarDatos.insertDespacho("LosDirectores", "Despacho", "Despacho3", 15);
		InsertarDatos.insertDirector("LosDirectores", "Directores", "32345678A", "Pedro P�rez", "12345678A", 3);
		InsertarDatos.insertDespacho("LosDirectores", "Despacho", "Despacho4", 15);
		InsertarDatos.insertDirector("LosDirectores", "Directores", "42345678A", "Pepe P�rez", "12345678A", 4);
		InsertarDatos.insertDespacho("LosDirectores", "Despacho", "Despacho5", 15);
		InsertarDatos.insertDirector("LosDirectores", "Directores", "52345678A", "Walter P�rez", "12345678A", 5);

		DB.closeConnection();
	}

}
