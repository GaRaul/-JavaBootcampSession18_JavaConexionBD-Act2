/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaEmpleadosCampos = "(\r\n"
			+ "  DNI varchar(8) NOT NULL,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n"
			+ "  Apellidos varchar(255) DEFAULT NULL,\r\n"
			+ "  Departamento int unsigned DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (DNI),\r\n"
			+ "  KEY Departamento (Departamento),\r\n"
			+ "  CONSTRAINT Empleados_ibfk_1 FOREIGN KEY (Departamento) REFERENCES Departamentos (Codigo)\r\n"
			+ ")";

	public static String tablaDepartamentosCampos = "(\r\n"
			+ "  Codigo int unsigned NOT NULL AUTO_INCREMENT,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n"
			+ "  Presupuesto int DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (Codigo)\r\n"
			+ ")";

	public static String insercionTablaEmpleados = "(DNI, Nombre, Apellidos, Departamento) values "
			+ "('1023245M', 'Raul', 'Garrido', 1)," + "('1023245A', 'Edgar', 'Falco', 2),"
			+ "('1023245B', 'Abel', 'Jornet', 3)," + "('1023245C', 'Paco', 'Salas', 4),"
			+ "('1023245D', 'Juan', 'Ramon', 5);";

	public static String insercionTablaDepartamentos = "(Nombre, Presupuesto) values " + "('Costes', 200),"
			+ "('Nvidia', 300)," + "('Logitech', 400)," + "('Intel', 1000)," + "('AMD', 600);";
}