package Ejercicio4;
import DB.DB;
 class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DB.openConnection();
		DB.createDB("PeliculasySalas");
		
		Peliculas.createTablePeliculas("PeliculasySalas","Peliculas");
		Salas.createTableSalas("PeliculasySalas","Salas");
		
		Peliculas.insertPeliculas("PeliculasySalas", "Peliculas", "Marvel Avengers", 8);
		Peliculas.insertPeliculas("PeliculasySalas","Peliculas", "Intelestelar", 12);
		Peliculas.insertPeliculas("PeliculasySalas","Peliculas", "Peppa pig the movie", 0);
		Peliculas.insertPeliculas("PeliculasySalas","Peliculas", "El profesor de persa", 16);
		Peliculas.insertPeliculas("PeliculasySalas","Peliculas", "Confinados", 0);
		
		Salas.insertSalas("PeliculasySalas","Salas", "Studio Ghibli", 1);
		Salas.insertSalas("PeliculasySalas","Salas", "Disney", 2);
		Salas.insertSalas("PeliculasySalas","Salas", "Dolby Atmos", 3);
		Salas.insertSalas("PeliculasySalas","Salas", "Pixar", 4);
		Salas.insertSalas("PeliculasySalas","Salas", "Infantil", 5);
		
		DB.closeConnection();
	}

}