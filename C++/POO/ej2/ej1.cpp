#include <iostream>

using namespace std;

#include "Jirafa.hpp"
//agrego la definicion de la clase Jirafa a este archivo


int main(){

	Jirafa chupaltepec;// creamos el objeto jirafa
	Jirafa otra_jirafa;

	//MODIFICANDO OBJETO chupaltepec
	chupaltepec.asignar_edad(1);// setter de la edad
	cout<< chupaltepec.obtener_edad() << endl;//devolver la "edad" 

	chupaltepec.asignar_altura(3.4F);
	cout<< chupaltepec.obtener_altura() << endl;

	chupaltepec.asignar_nombre("Chupaltepec");
	cout<< chupaltepec.obtener_nombre() <<endl;


	//MODIFICANDO OBJETO otra_jirafa
	otra_jirafa.asignar_edad(2);// setter de la edad
	cout<< otra_jirafa.obtener_edad() << endl;//devolver la "edad" 

	otra_jirafa.asignar_altura(4.4F);
	cout<< otra_jirafa.obtener_altura() << endl;

	otra_jirafa.asignar_nombre("Otra jirafa");
	cout<< otra_jirafa.obtener_nombre() <<endl;

	return 0;
}