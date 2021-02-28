package Ejercicio9;

import java.sql.Connection;
import DB.DB;

public class Ejercicio9 {
	public static Connection conexion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LLAMADA A METODOS MYSQL
		DB.openConnection();
		DB.createDB("Investigadores");

		Facultad.createTableFacultad("Investigadores", "Facultad");
		Facultad.insertFacultad("Investigadores", "Facultad", 1, "Informatica");
		Facultad.insertFacultad("Investigadores", "Facultad", 2, "Mecanica");
		Facultad.insertFacultad("Investigadores", "Facultad", 3, "Educacion");
		Facultad.insertFacultad("Investigadores", "Facultad", 4, "Quimica");
		Facultad.insertFacultad("Investigadores", "Facultad", 5, "Biomedica");

		Investigadores.createTableInvestigadores("Investigadores", "Investigadores");
		Investigadores.insertInvestigadores("Investigadores", "Investigadores", "1234567A", "Cristina", 1);
		Investigadores.insertInvestigadores("Investigadores", "Investigadores", "9876543B", "Maria", 2);
		Investigadores.insertInvestigadores("Investigadores", "Investigadores", "7418529C", "Sara", 3);
		Investigadores.insertInvestigadores("Investigadores", "Investigadores", "3692581D", "Mariona", 4);
		Investigadores.insertInvestigadores("Investigadores", "Investigadores", "3578924E", "Marta", 5);

		Equipos.createTableEquipos("Investigadores", "Equipos");
		Equipos.insertEquipos("Investigadores", "Equipos", "01", "E1", 1);
		Equipos.insertEquipos("Investigadores", "Equipos", "02", "E2", 2);
		Equipos.insertEquipos("Investigadores", "Equipos", "03", "E3", 3);
		Equipos.insertEquipos("Investigadores", "Equipos", "04", "E4", 4);
		Equipos.insertEquipos("Investigadores", "Equipos", "05", "E5", 5);

		Reserva.createTableReserva("Investigadores", "Reserva");
		Reserva.insertReserva("Investigadores", "Reserva", "1234567A", "01", "2021-02-25", "2021-02-28");
		Reserva.insertReserva("Investigadores", "Reserva", "9876543B", "02", "2021-02-25", "2021-02-28");
		Reserva.insertReserva("Investigadores", "Reserva", "7418529C", "03", "2021-02-25", "2021-02-28");
		Reserva.insertReserva("Investigadores", "Reserva", "3692581D", "04", "2021-02-25", "2021-02-28");
		Reserva.insertReserva("Investigadores", "Reserva", "3578924E", "05", "2021-02-25", "2021-02-28");

		DB.closeConnection();
	}

}
