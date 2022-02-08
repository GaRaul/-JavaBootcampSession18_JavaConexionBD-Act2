/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainApp {

	public static void main(String[] args) {

		Mysql.openConnection();
		Mysql.createDB("Tienda_de_Informatica");

		Mysql.createTable("Tienda_de_Informatica", "Fabricantes", Inserciones.tablaFabricantesCampos);
		Mysql.createTable("Tienda_de_Informatica", "Articulos", Inserciones.tablaArticulosCampos);

		Mysql.insertData("Tienda_de_Informatica", "Fabricantes", Inserciones.insercionTablaFabricantes);
		Mysql.insertData("Tienda_de_Informatica", "Articulos", Inserciones.insercionTablaArticulos);
		
		Mysql.getValues("Tienda_de_Informatica", "Articulos");
		Mysql.deleteRecord("Tienda_de_Informatica", "Articulos", 1);
		Mysql.getValues("Tienda_de_Informatica", "Articulos");
		Mysql.closeConnection();
	}

}