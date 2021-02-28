package Ejercicio2;

import DB.DB;

public class Ejercicio2App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		DB.openConnection();
		DB.createDB("Empleados");
		CrearTablas.createTableDepartamento("Empleados","Departamento");
		CrearTablas.createTableEmpleado("Empleados","Empleado");
		InsertarDatos.insertDepartamento("Empleados","Departamento", "I+D", 40000);
		InsertarDatos.insertEmpleado("Empleados", "Empleado", "1234567A", "Juan", "P�rez", 1 );
		InsertarDatos.insertDepartamento("Empleados","Departamento", "RRHH", 40000);
		InsertarDatos.insertEmpleado("Empleados", "Empleado", "2234567A", "Pepe", "P�rez", 2 );
		InsertarDatos.insertDepartamento("Empleados","Departamento", "Limpieza", 40000);
		InsertarDatos.insertEmpleado("Empleados", "Empleado", "3234567A", "Pedro", "P�rez", 3 );
		InsertarDatos.insertDepartamento("Empleados","Departamento", "Marketing", 40000);
		InsertarDatos.insertEmpleado("Empleados", "Empleado", "4234567A", "Richard", "P�rez", 4 );
		InsertarDatos.insertDepartamento("Empleados","Departamento", "Bienestar", 40000);
		InsertarDatos.insertEmpleado("Empleados", "Empleado", "5234567A", "Walter", "P�rez", 5 );
		DB.closeConnection();	
	}

}