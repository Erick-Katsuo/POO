#include "Casa.hpp"

int Casa::obtener_num_casa(){
	return num_casa;
}

bool Casa::asignar_num_casa(int nuevo_num_casa){
	bool resultado = false;
	if(nuevo_num_casa >= 50 && nuevo_num_casa <= 100){
		num_casa = nuevo_num_casa;
		resultado = true;
	}
	return resultado;
}

string Casa::obtener_direccion(){
	return direccion;
}

void Casa::asignar_direccion(string nueva_direccion){
	direccion = nueva_direccion;
}

bool Casa::obtener_tiene_perro(){
	return tiene_perro;
}

void Casa::asignar_tiene_perro(bool actualizar_tiene_perro){
	tiene_perro = actualizar_tiene_perro;
}
