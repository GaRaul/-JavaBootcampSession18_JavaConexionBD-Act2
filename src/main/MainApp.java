/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainApp {

	public static void main(String[] args) {

		Mysql.openConnection();
		Mysql.createDB("Empleados");

		Mysql.createTable("Empleados", "Departamentos", Inserciones.tablaDepartamentosCampos);
		Mysql.createTable("Empleados", "Empleados", Inserciones.tablaEmpleadosCampos);

		Mysql.insertData("Empleados", "Departamentos", Inserciones.insercionTablaDepartamentos);
		Mysql.insertData("Empleados", "Empleados", Inserciones.insercionTablaEmpleados);
		
		Mysql.getValues("Empleados", "Empleados");
		Mysql.deleteRecord("Empleados", "Empleados", "1023245M");
		Mysql.getValues("Empleados", "Empleados");
		Mysql.closeConnection();
	}

}