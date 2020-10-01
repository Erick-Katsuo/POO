#ifndef __USUARIO_HPP__
#define __USUARIO_HPP__


#include <iostream>

using namespace std;

const string DEF_NOMBRE = "def nombre";

class Usuario{
	private:
		string nombre = DEF_NOMBRE;
		string contrasenia;

		string nivel_acceso;
		float saldo;

	public:

		string obtener_nombre();

		int asignar_nombre(string nuevo_nombre);

		string obtener_contrasenia();

		void asignar_contrasenia(string nueva_contrasenia);

		string obtener_nivel_acceso();

		void asignar_nivel_acceso(string nuevo_nivel_acceso);

		float obtener_saldo();

		void asignar_saldo(float nuevo_saldo);
};


#endif /*__USUARIO_HPP__*/