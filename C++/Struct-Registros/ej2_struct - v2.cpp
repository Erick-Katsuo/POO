#include <iostream>
/*
	- Crear un tipo de dato persona con atributos: dni, inicial_nombre, edad, si tiene gato, si tiene perro
	- Una vez creado el tipo de dato persona proceda a definirlo en la funcion main 
	- Luego asignar valores ficticios a esta variable/struct de las siguientes maneras:
		- Junto a la definicion
		- Igualandolo a otra variable/struct
		- De campo a campo, o en otras palabras de atributo a atributo
*/
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
int mostrar_menu(){
	int opcion_recib = DEF_OPC;
	cout<<"\t\tMenu"<<endl;
	cout<<"\t-Agregar nombre [1]"<<endl;
	cout<<"\t-Mostrar nombre [2]"<<endl;
	cout<<"\t-Salir		[0]"<<endl;
	cin >> opcion_recib;
	return opcion_recib;
}

/*Pre:-.
 *Post: recibe un nuevo nombre en "nombre_recib" y lo retorna
*/
string opc_agregar_nombre(){
	string nombre_recib = DEF_NOMBR;
	cout<<"Ingrese nuevo nombre:"<<endl;
	cin>> nombre_recib;
	return nombre_recib;
}

/*Pre:-.
 *Post: Muestra el "nombre" de "persona"
*/
void opc_mostrar_nombre(persona_t persona){
	cout << "El nombre de la persona es: " << persona.nombre << endl;
}

/* Pre: "opcion_eleg" correctamente actualizado
 * Post: realiza la "opcion_eleg" y retorna "persona"
*/
persona_t ejecutar_opcion(int opcion_eleg, persona_t persona){
	switch(opcion_eleg){
		case OPC_AGREGR_NOMBR:
			persona.nombre = opc_agregar_nombre();
			break;
		case OPC_MOSTRAR_NOMBR:
			opc_mostrar_nombre(persona);
			break;
		case OPC_SALIR:
			cout<<"Saliendo del programa.."<<endl;
			break;
		default:
			cout<<"Ingreso no aceptado"<<endl;
	}
	return persona;
}

/*pre:-.
 *post: inicia el programa y termina con la opcion "OPC_SALIR"
*/
void iniciar_programa(){
	int opcion = DEF_OPC;
	persona_t alguien;
	do{
		opcion = mostrar_menu();
		alguien = ejecutar_opcion(opcion, alguien);
	}while(opcion != OPC_SALIR);
}


int main(){
	iniciar_programa();
	return 0;
}