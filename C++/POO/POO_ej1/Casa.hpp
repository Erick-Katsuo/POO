#ifndef __CASA_HPP__
#define __CASA_HPP__

#include <iostream>

using namespace std;

class Casa{
	/*ATRIBUTOS*/
	private:
		int num_casa;
		string direccion;
		bool tiene_perro;

	/*METODOS OBTENER - ASIGNAR*/
	public:

		/*Pre: -.
		 *Post: retorna el valor del atributo "num_casa"
		*/
		int obtener_num_casa();

		/*Pre: "nuevo_num_casa" dentro del rango 50-100.
		 *Post: devuelve true si logro actualizar, caso contrario devuelve false
		*/
		bool asignar_num_casa(int nuevo_num_casa);

		/*Pre: -.
		 *Post: retorna el valor del atributo "direccion"
		*/
		string obtener_direccion();

		/*Pre: -.
		 *Post: actualiza el atributo "direccion"
		*/
		void asignar_direccion(string nueva_direccion);

		/*Pre: -.
		 *Post: retorna el valor del atributo "tiene_perro"
		*/
		bool obtener_tiene_perro();

		/*Pre: -.
		 *Post: actualiza el atributo "tiene_perro"
		*/
		void asignar_tiene_perro(bool actualizar_tiene_perro);

};




#endif /*__CASA_HPP__*/