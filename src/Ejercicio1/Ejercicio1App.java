package Ejercicio1;

import DB.DB;


public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LLAMADA A METODOS MYSQL
		DB.openConnection();
		DB.createDB("TiendaInformatica");
		
		Fabricantes.createTableFabricantes("TiendaInformatica", "Fabricantes");
		Fabricantes.insertFabricante("TiendaInformatica", "Fabricantes", "Asus");
		Fabricantes.insertFabricante("TiendaInformatica", "Fabricantes", "Logitech");
		Fabricantes.insertFabricante("TiendaInformatica", "Fabricantes", "Apple");
		Fabricantes.insertFabricante("TiendaInformatica", "Fabricantes", "HP");
		Fabricantes.insertFabricante("TiendaInformatica", "Fabricantes", "LG");
		Fabricantes.insertFabricante("TiendaInformatica", "Fabricantes", "Lenovo");

		Articulos.createTableArticulos("TiendaInformatica", "Articulos");
		Articulos.insertArticulos("TiendaInformatica", "Articulos", "Impresora", 100, 1);
		Articulos.insertArticulos("TiendaInformatica", "Articulos", "RAM", 30, 6);
		Articulos.insertArticulos("TiendaInformatica", "Articulos", "Funda", 80, 4);
		Articulos.insertArticulos("TiendaInformatica", "Articulos", "Teclado", 95, 2);
		Articulos.insertArticulos("TiendaInformatica", "Articulos", "Raton", 86, 5);

		DB.closeConnection();
	}

}
