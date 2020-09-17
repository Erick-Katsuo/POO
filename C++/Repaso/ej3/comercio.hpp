#ifndef __COMERCIO_HPP__
#define __COMERCIO_HPP__

#include <iostream>

using namespace std;

const int DEF_CANTIDAD = -1;
const string DEF_NOMBRE_PRODUCT = "def nombre";
const float DEF_PRECIO = -0.0F;
const string DEF_MARCA = "def marca";

const int MAX_PRODUCTOS = 10;
const int DEF_CANTIDAD_PRODUCTOS = 0;

typedef struct producto{
	int cantidad = DEF_CANTIDAD;
	string nombre_producto = DEF_NOMBRE_PRODUCT;
	float precio = DEF_PRECIO;
	string marca = DEF_MARCA;	
}producto_t;

typedef struct almacen{
	int cantidad_productos = DEF_CANTIDAD_PRODUCTOS;
	producto_t productos[MAX_PRODUCTOS];
}almacen_t;

/*Pre: "producto_recib" correctamente actualizado
 *Post: muestra por consola la cantidad de "producto_recib"
*/
void mostrar_cantidad_producto(producto_t producto_recib);

/*Pre: "producto_comprar" correctamente actualizado
 *Post: devuelve la nueva "cantidad" de "producto_comprar"
*/
int comprar_producto(producto_t producto_comprar);

/*Pre: "producto_modif" correctamente actualizado
 *Post: devuelve la nueva "cantidad" de "producto_modif"
*/
int modificar_cantidad(producto_t producto_modif);


#endif /*__COMERCIO_HPP__*/