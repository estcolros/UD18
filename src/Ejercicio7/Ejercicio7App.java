package Ejercicio7;

import DB.DB;


public class Ejercicio7App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		DB.openConnection();
		DB.createDB("LosCientificos");
		
		Cientificos.createTableCientificos("LosCientificos", "Cientificos");
		Proyecto.createTableProyecto("LosCientificos", "Proyecto");
		Asignado_a.createTableAsignado_a("LosCientificos", "Asignado_a");
		
		Proyecto.insertProyecto("LosCientificos", "Proyecto", "A1", "Alba�iles", 3);
		Proyecto.insertProyecto("LosCientificos", "Proyecto", "A2", "Labrador", 7);
		Proyecto.insertProyecto("LosCientificos", "Proyecto", "A3", "Mesa", 2);
		Proyecto.insertProyecto("LosCientificos", "Proyecto", "A4", "Mantel", 8);
		Proyecto.insertProyecto("LosCientificos", "Proyecto", "A5", "Patata", 3);
		
		Cientificos.insertCientificos("LosCientificos", "Cientificos", "48003322", "Manolo");
		Cientificos.insertCientificos("LosCientificos", "Cientificos", "48003323", "Juan");
		Cientificos.insertCientificos("LosCientificos", "Cientificos", "48003324", "Marc");
		Cientificos.insertCientificos("LosCientificos", "Cientificos", "48003325", "Estefania");
		Cientificos.insertCientificos("LosCientificos", "Cientificos", "48003326", "Matias");
		
		Asignado_a.insertAsignado_a("LosCientificos", "Asignado_a", "48003322", "A1");
		Asignado_a.insertAsignado_a("LosCientificos", "Asignado_a", "48003323", "A2");
		Asignado_a.insertAsignado_a("LosCientificos", "Asignado_a", "48003324", "A3");
		Asignado_a.insertAsignado_a("LosCientificos", "Asignado_a", "48003325", "A4");
		Asignado_a.insertAsignado_a("LosCientificos", "Asignado_a", "48003326", "A5");
		
		DB.closeConnection();

	}

}


