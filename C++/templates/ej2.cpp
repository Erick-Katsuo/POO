#include <iostream>

using namespace std;

template <typename Dato_dni, typename Dato_num_contact>
void mostrar_informacion(Dato_dni dni_recib, Dato_num_contact num_contacto_recib){
	cout<<dni_recib<<" "<<num_contacto_recib<<endl;
	/*
	codigo
	*/
}

int main(){

	int dni;
	int num_contacto;
	char opcion_dni;
	char opcion_num_contact;
	string msj_no_dni = "no ingreso dni";
	string msj_no_num_contacto = "no ingreso numero de contacto";

	cout<<"desea ingresar dni? si [a] - no [b]"<<endl;
	cin>>opcion_dni;
	if(opcion_dni == 'a'){
		cout<<"ingrese su dni"<<endl;
		cin>> dni;
	}

	cout<< "desea ingresar numero de contacto ? si [a] - no [b]"<<endl;
	cin>>opcion_num_contact;
	if(opcion_num_contact == 'a'){
		cout<< "ingrese numero de contacto"<<endl;
		cin>>num_contacto;
	}

	
	if(opcion_dni == 'a' && opcion_num_contact == 'a'){
		mostrar_informacion(dni, num_contacto);
	}else if(opcion_dni != 'a' && opcion_num_contact != 'a'){
		mostrar_informacion(msj_no_dni, msj_no_num_contacto);
	}else if(opcion_dni == 'a' && opcion_num_contact != 'a'){
		mostrar_informacion(dni, msj_no_num_contacto);
	}else{
		mostrar_informacion(msj_no_dni, num_contacto);
	}
	

	return 0;
}