#ifndef __USUARIO_HPP__
#define __USUARIO_HPP__


#include <iostream>

using namespace std;

const string DEF_NOMBRE = "def nombre";
const float DEF_SALDO = 0.0F;
const string DEF_NIVEL_ACCESO = "usuario";
const string DEF_CONTRASENIA = "def contrasenia";

class Usuario{
	private:
		string nombre = DEF_NOMBRE;
		string contrasenia = DEF_CONTRASENIA;

		string nivel_acceso = DEF_NIVEL_ACCESO;
		float saldo = DEF_SALDO;

	public:

		string obtener_nombre();

		void asignar_nombre(string nuevo_nombre);

		string obtener_contrasenia();

		void asignar_contrasenia(string nueva_contrasenia);

		string obtener_nivel_acceso();

		void asignar_nivel_acceso(string nuevo_nivel_acceso);

		float obtener_saldo();

		void asignar_saldo(float nuevo_saldo);
};


#endif /*__USUARIO_HPP__*/