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


void confirm_prod(almacen_t almacen_recib, string producto_buscado){
	cout<<"Buscando producto: "<<producto_buscado<<endl; 
	for(int i = 0 ; i < (almacen_recib.cantidad_productos) ; i++){
		if ( producto_buscado == almacen_recib.productos[ i ].nombre_producto ){
			cout<<"Encontro producto: "<< almacen_recib.productos[ i ].nombre_producto << endl;
			cout<<"Marca: "<< almacen_recib.productos[ i ].marca <<endl;
			cout<<"Precio: $"<< almacen_recib.productos[ i ].precio <<endl;
			cout<<"Cantidad: "<< almacen_recib.productos[ i ].cantidad <<endl;
			i = almacen_recib.cantidad_productos;
		}else{
			cout<<"No se encontro"<<endl;
		}
	}
}