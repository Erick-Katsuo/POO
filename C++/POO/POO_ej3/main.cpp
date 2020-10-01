#include <iostream>

using namespace std;

#include "Usuario.hpp"

int main(){

	Usuario prueba1, prueba2, prueba3;

	prueba1.obtener_nombre();
	//Usuario usuario_prueba;// cree un objeto

	//usuario_prueba.asignar_nombre("usuario de prueba");// cambio el nombre

	//cout<< usuario_prueba.obtener_nombre() << endl; // muestro el nombre

	Usuario registro[3];// cree un vector de 3 objetos


	cout << registro[ 2 ].obtener_nombre() << endl ; // "def nombre" del elemento objeto 3




	return 0;
}