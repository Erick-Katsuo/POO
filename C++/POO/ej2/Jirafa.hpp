#ifndef __JIRAFA_HPP__
#define __JIRAFA_HPP__

#include <iostream>
using namespace std;

const int DEF_EDAD = 0;
const float DEF_ALTURA = 1.8F;
const string DEF_NOMBRE = "def nombre jirafa";


class Jirafa{
	/*ATRIBUTOS*/
	private:
		int edad = DEF_EDAD;
		float altura = DEF_ALTURA;
		string nombre = DEF_NOMBRE;

	/*METODOS ASIGNAR - OBTENER*/
	public:

		/*Pre: "nueva_edad" como maximo 35.
		 *Post: actualiza el atributo "edad"
		*/
		void asignar_edad(int nueva_edad);

		/*Pre: -.
		 *Post: Retorna el valor del atributo "edad"
		*/
		int obtener_edad();

		/*Pre: "nueva_altura" como maximo 6.1F.
		 *Post: actualiza el atributo "altura"
		*/
		void asignar_altura(float nueva_altura);

		/*Pre: -.
		 *Post: Retorna el valor del atributo "altura"
		*/
		float obtener_altura();

		/*Pre: -.
		 *Post: actualiza el atributo "nombre"
		*/
		void asignar_nombre(string nuevo_nombre);

		/*Pre: -.
		 *Post: Retorna el valor del atributo "nombre"
		*/
		string obtener_nombre();

};


#endif /*__JIRAFA_HPP__*/