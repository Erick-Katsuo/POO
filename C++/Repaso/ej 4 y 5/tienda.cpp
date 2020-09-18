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

/*Pre: "tienda" correctamente actualizado
 *Post: ejecuta la opcion seleccionada
*/
void menu_producto(almacen_t tienda){

	int opcion_producto = -1;

	cout<<"Que producto necesita operar ?"<<endl;
	cout<<"Menu"<<endl;

	for(int i = 0 ; i < tienda.cantidad_productos ; i++){
		cout<< tienda.productos[i].nombre_producto << " - "<< i+1 <<endl;
	}
	
	cin>> opcion_producto;

	menu( tienda.productos[opcion_producto - 1] );
}

void menu_principal(almacen_t tienda){
	int opcion = -1;
	string producto_buscado;

	cout<<"Menu"<<endl;
	cout<<"Buscar un producto [1]"<<endl;
	cout<<"Ver menu de productos [2]"<<endl;
	cin>>opcion;
	switch(opcion){
		case 1:
			cout<<"Que producto busca?"<<endl;
			cin>>producto_buscado;
			confirm_prod(tienda, producto_buscado);
			break;
		case 2:
			menu_producto(tienda);
			break;
		default:
			cout<<"Ingreso invalido"<<endl;
	}
}

int main(){

	producto_t pringles = {10, "pringles_original", 130.0F, "pringles"};
	producto_t agua = {100, "agua_mineral", 100.5F, "glaciar"};
	producto_t algo = {123, "algun_producto", 999.9F, "alguna marca"};

	almacen_t mi_almacen;

	mi_almacen.productos[3] = pringles;
	mi_almacen.cantidad_productos++; // 1
	mi_almacen.productos[0] = agua;
	mi_almacen.cantidad_productos++; // 2
	mi_almacen.productos[2] = algo;
	mi_almacen.cantidad_productos++; // 3
	mi_almacen.productos[1] = algo;
	mi_almacen.cantidad_productos++; // 4
	mi_almacen.productos[4] = algo;
	mi_almacen.cantidad_productos++; // 5
		

	menu_principal(mi_almacen);

	return 0;
}