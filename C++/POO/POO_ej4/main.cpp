#include <iostream>

using namespace std;

#include "Usuario.hpp"




int main(){
	Usuario registro[3];

	string usuario_buscado = "def usuario buscado";

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

	/*for(int i = 0; i < 3 ; i++){
		cout << registro[i].obtener_nombre() << endl;
		cout << registro[i].obtener_contrasenia() << endl;
		cout << registro[i].obtener_nivel_acceso() << endl;
		cout << registro[i].obtener_saldo() << endl << endl;
	}*/

	cout<<"Que usuario desea buscar?"<<endl;
	cin >> usuario_buscado;

	for(int i = 0; i < 3 ; i++){
		if(registro[ i ].obtener_nombre() == usuario_buscado ){
			cout<<"Encontro usuario!"<<endl;
			//verificar contrasenia
			i = 3;
		}else{
			cout<<"No existe tal usuario"<<endl;
		}
	}



	return 0;
}