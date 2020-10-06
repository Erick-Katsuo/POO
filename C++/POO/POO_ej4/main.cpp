#include <iostream>

using namespace std;

#include "Usuario.hpp"

const int MAX_REGISTRO = 3;

void cargar_informacion(Usuario registro[]){
	registro[0].asignar_nombre("Erick");
	registro[0].asignar_contrasenia("123");
	registro[0].asignar_nivel_acceso("Vendedor");
	registro[0].asignar_saldo(0.0F);

	registro[1].asignar_nombre("Alan");
	registro[1].asignar_contrasenia("qwerty");
	registro[1].asignar_nivel_acceso("administrador");
	registro[1].asignar_saldo(100.0F);

	registro[2].asignar_nombre("Gabriela");
	registro[2].asignar_contrasenia("123asfd");
	registro[2].asignar_nivel_acceso("administrador");
	registro[2].asignar_saldo(200.0F);
}


void mostrar_usuarios(Usuario registro[]){
	for(int i = 0; i < MAX_REGISTRO ; i++){
		cout << registro[i].obtener_nombre() << endl;
		cout << registro[i].obtener_contrasenia() << endl;
		cout << registro[i].obtener_nivel_acceso() << endl;
		cout << registro[i].obtener_saldo() << endl << endl;
	}
}

void verificar_contrasenia(Usuario usuario_encontrado, int i){
	string contrasenia_ingr = "def contrasenia";
	cout<<"Ingrese contrasenia"<<endl;
	cin>> contrasenia_ingr;
	if( usuario_encontrado.obtener_contrasenia() == contrasenia_ingr  ){
		cout<<"Contrasenia aceptada"<<endl;
	}else{
		cout<<"Contrasenia o usuario no corresponden"<<endl;
	}	
}

void buscar_usuario(Usuario registro[]){
	string usuario_buscado = "def usuario buscado";
	cout<<"Que usuario desea buscar?"<<endl;
	cin >> usuario_buscado;

	for(int i = 0; i < MAX_REGISTRO ; i++){
		if(registro[ i ].obtener_nombre() == usuario_buscado ){
			cout<<"Encontro usuario!"<<endl;
			//verificar contrasenia
			verificar_contrasenia( registro[i] , i);
			i = MAX_REGISTRO;
		}else{
			cout<<"No existe tal usuario"<<endl;
		}
	}
}


int main(){
	Usuario registro[MAX_REGISTRO];

	//actualiza la informacion del registro
	cargar_informacion(registro);

	//muestra todos los usuarios
	mostrar_usuarios(registro);

	//busca un usuario
	buscar_usuario(registro);
	

	return 0;
}