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

void mostrar_menu(int &opcion_recib){
	cout<<"\t\tMenu"<<endl;
	cout<<"\t-Agregar nombre [1]"<<endl;
	cout<<"\t-Mostrar nombre [2]"<<endl;
	cout<<"\t-Salir		[0]"<<endl;
	cin >> opcion_recib;
}

void opc_agregar_nombre(persona_t &persona){
	cout<<"Ingrese nuevo nombre:"<<endl;
	cin>> persona.nombre;
}

void opc_mostrar_nombre(persona_t persona){
	cout << "El nombre de la persona es: " << persona.nombre << endl;
}

void ejecutar_opcion(int opcion_eleg, persona_t &persona){
	switch(opcion_eleg){
		case OPC_AGREGR_NOMBR:
			opc_agregar_nombre(persona);
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
}

/*pre: el struct "alguien" tiene que contar con el campo string "nombre"
 *post: inicia el programa y termina con la opcion "OPC_SALIR"
*/
void iniciar_programa(int opcion, persona_t alguien){
	do{
		mostrar_menu(opcion);
		ejecutar_opcion(opcion, alguien);
	}while(opcion != OPC_SALIR);
}


int main(){
	int opcion = DEF_OPC;
	persona_t alguien;
	iniciar_programa(opcion, alguien);
	return 0;
}