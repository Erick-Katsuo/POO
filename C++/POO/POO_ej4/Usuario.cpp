#include "Usuario.hpp"

string Usuario::obtener_nombre(){
	return nombre;
}

void Usuario::asignar_nombre(string nuevo_nombre){
	nombre = nuevo_nombre;
}


string Usuario::obtener_contrasenia(){
	return contrasenia;
}

void Usuario::asignar_contrasenia(string nueva_contrasenia){
	contrasenia = nueva_contrasenia;
}


string Usuario::obtener_nivel_acceso(){
	return nivel_acceso;
}

void Usuario::asignar_nivel_acceso(string nuevo_nivel_acceso){
	nivel_acceso = nuevo_nivel_acceso;
}


float Usuario::obtener_saldo(){
	return saldo;
}

void Usuario::asignar_saldo(float nuevo_saldo){
	saldo = nuevo_saldo;
}