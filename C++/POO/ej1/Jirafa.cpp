#include "Jirafa.hpp"

/*METODOS ASIGNAR - OBTENER*/

void Jirafa::asignar_edad(int nueva_edad){
	edad = nueva_edad;
}

int Jirafa::obtener_edad(){
	return edad;
}

void Jirafa::asignar_altura(float nueva_altura){
	altura = nueva_altura;
}

float Jirafa::obtener_altura(){
	return altura;
}


void Jirafa::asignar_nombre(string nuevo_nombre){
	nombre = nuevo_nombre;
}

string Jirafa::obtener_nombre(){
	return nombre;
}