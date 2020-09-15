#include "comercio.hpp"


void mostrar_cantidad_producto(producto_t producto_recib){
	cout<< "\tProducto: "<<producto_recib.nombre_producto<<endl;
	cout<< "Cantidad: "<<producto_recib.cantidad<<endl;
}

int comprar_producto(producto_t producto_comprar){
	int cantidad_comprar = 0;
	cout<<"Ingrese la cantidad a comprar de "<< producto_comprar.nombre_producto<<endl;
	cin>>cantidad_comprar;
	cout<<"Compraste "<<cantidad_comprar<<endl;
	cout<<"Total a pagar: $"<<cantidad_comprar * producto_comprar.precio<<endl;

	cout<<"**stock actualizado**"<<endl;
	return (producto_comprar.cantidad + cantidad_comprar);
}

int modificar_cantidad(producto_t producto_modif){
	int cantidad_actualizada = 0;
	cout<<"Cantidad nueva del producto "<<producto_modif.nombre_producto<<endl;
	cin>>cantidad_actualizada;
	cout<<"**stock actualizado**"<<endl;
	return cantidad_actualizada;
}