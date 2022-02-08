/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaArticulosCampos = "(" + "  Codigo int unsigned NOT NULL AUTO_INCREMENT,"
			+ "  Nombre varchar(100) DEFAULT NULL," + "  Precio int DEFAULT NULL,"
			+ "  Fabricante int unsigned NOT NULL," + "  PRIMARY KEY (Codigo)," + "  KEY Fabricante (Fabricante),"
			+ "  CONSTRAINT Articulos_ibfk_1 FOREIGN KEY (Fabricante) REFERENCES Fabricantes (Codigo) ON DELETE CASCADE"
			+ ")";

	public static String tablaFabricantesCampos = "(" + "  Codigo int unsigned NOT NULL AUTO_INCREMENT,"
			+ "  Nombre varchar(100) DEFAULT NULL," + "  PRIMARY KEY (Codigo)" + ")";

	public static String insercionTablaArticulos = "(Nombre, Precio, Fabricante) values " + "('Pantalla', 20, 1),"
			+ "('Teclado', 200, 2)," + "('Raton', 40, 3)," + "('Alfombrilla', 10, 4)," + "('Placa Base', 60, 5);";

	public static String insercionTablaFabricantes = "(Nombre) values " + "('Razer')," + "('Nvidia')," + "('Logitech'),"
			+ "('Intel')," + "('AMD');";
}