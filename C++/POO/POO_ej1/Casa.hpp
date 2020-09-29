#ifndef __CASA_HPP__
#define __CASA_HPP__

#include <iostream>

using namespace std;

const int DEF_NUM_CASA = -1;
const string DEF_DIRECCION = "def direcc";
const bool DEF_TIENE_PERRO = false;

class Casa{
	/*ATRIBUTOS*/
	private:
		int num_casa = DEF_NUM_CASA;
		string direccion = DEF_DIRECCION;
		bool tiene_perro = DEF_TIENE_PERRO;

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