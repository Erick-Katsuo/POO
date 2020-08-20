#ifndef __PERSONA_HPP__
#define __PERSONA_HPP__

#include <iostream>
using namespace std;

const int DEF_DNI = -1;
const string DEF_NOMBR = "def nombre";
const int DEF_EDAD = -1;
const bool DEF_TIENE_GATO = false;
const bool DEF_TIENE_PERRO = false;

const int DEF_OPC = -1;

const int OPC_SALIR = 0;
const int OPC_AGREGR_NOMBR = 1;
const int OPC_MOSTRAR_NOMBR = 2;

typedef struct persona{
	int dni = DEF_DNI;
	string nombre = DEF_NOMBR;
	int edad = DEF_EDAD;
	bool tiene_gato = DEF_TIENE_GATO;
	bool tiene_perro = DEF_TIENE_PERRO; 
}persona_t;

/*Pre:-.
 *Post: Muestra el menu, recibe la opcion ingresada y retorna el valor de "opcion_recib"
*/
int mostrar_menu();

/*Pre:-.
 *Post: recibe un nuevo nombre en "nombre_recib" y lo retorna
*/
string opc_agregar_nombre();

/*Pre:-.
 *Post: Muestra el "nombre" de "persona"
*/
void opc_mostrar_nombre(persona_t persona);

/* Pre: "opcion_eleg" correctamente actualizado
 * Post: realiza la "opcion_eleg" y retorna "persona"
*/
persona_t ejecutar_opcion(int opcion_eleg, persona_t persona);

/*pre:-.
 *post: inicia el programa y termina con la opcion "OPC_SALIR"
*/
void iniciar_programa();



#endif /*__PERSONA_HPP__*/