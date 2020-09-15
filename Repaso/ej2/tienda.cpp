#include <iostream>

using namespace std;

#include "comercio.hpp"

void menu(producto_t producto_elegido){
	int opcion = -1;

	cout<<"Menu"<<endl;
	cout<<"Mostrar cantidad de producto [1]"<<endl;
	cout<<"Comprar mas cantidad de producto [2]"<<endl;
	cout<<"Modificar cantidad de producto[3]"<<endl;

	cin>>opcion;

	switch(opcion){
		case 1:
			mostrar_cantidad_producto(producto_elegido);
			break;
		case 2: 
			producto_elegido.cantidad = comprar_producto(producto_elegido);
			break;
		case 3:
			producto_elegido.cantidad = modificar_cantidad(producto_elegido);
			break;
		default:
			cout<<"Ingreso no aceptado"<<endl;
	}
}

int main(){

	producto_t pringles = {10, "pringles original", 130.0F, "pringles"};
	producto_t agua = {100, "agua mineral", 100.0F, "glaciar"};

	int opcion_producto = -1;

	cout<<"Que producto necesita operar ?"<<endl;
	cout<<"Menu"<<endl;
	cout<<"Pringles[1]"<<endl;
	cout<<"Agua[2]"<<endl;

	cin>> opcion_producto;

	switch(opcion_producto){
		case 1:
			menu(pringles);
			break;
		case 2:
			menu(agua);
			break;
		default:
			cout<<"producto no encontrado"<<endl;
	}

	return 0;
}