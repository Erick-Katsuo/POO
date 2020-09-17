#include <iostream>

using namespace std;

#include "comercio.hpp"

void menu(producto_t producto_elegido){
	int opcion = -1;

	cout<<"Menu"<<endl;
	cout<<"Mostrar cantidad de producto [1]"<<endl;
	cout<<"Comprar mas cantidad de producto [2]"<<endl;
	cout<<"Modificar cantidad de producto [3]"<<endl;

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

/*Pre: "producto_modif" correctamente actualizado
 *Post: devuelve la nueva "cantidad" de "producto_modif"
*/
void menu_producto(producto_t producto_1, producto_t producto_2){

	int opcion_producto = -1;

	cout<<"Que producto necesita operar ?"<<endl;
	cout<<"Menu"<<endl;
	cout<< producto_1.nombre_producto << " - 1"<<endl;
	cout<< producto_2.nombre_producto << " - 2"<<endl;

	cin>> opcion_producto;

	switch(opcion_producto){
		case 1:
			menu(producto_1);
			break;
		case 2:
			menu(producto_2);
			break;
		default:
			cout<<"producto no encontrado"<<endl;
	}
}


int main(){

	producto_t pringles = {10, "pringles original", 130.0F, "pringles"};
	producto_t agua = {100, "agua mineral", 100.5F, "glaciar"};
	producto_t algo = {123, "algun producto", 999.9F, "alguna marca"};

	almacen_t mi_almacen;

	mi_almacen.productos[0] = pringles;
	mi_almacen.cantidad_productos++;
	mi_almacen.productos[1] = agua;
	mi_almacen.cantidad_productos++;
	mi_almacen.productos[2] = algo;
	mi_almacen.cantidad_productos++;

	for(int i = 0; i < (mi_almacen.cantidad_productos) ; i++){
		cout<< mi_almacen.productos[i].nombre_producto<<endl;
	}

	/*

	menu_producto(agua, pringles);*/

	return 0;
}