#include "persona.hpp"

int mostrar_menu(){
	int opcion_recib = DEF_OPC;
	cout<<"\t\tMenu"<<endl;
	cout<<"\t-Agregar nombre [1]"<<endl;
	cout<<"\t-Mostrar nombre [2]"<<endl;
	cout<<"\t-Salir		[0]"<<endl;
	cin >> opcion_recib;
	return opcion_recib;
}

string opc_agregar_nombre(){
	string nombre_recib = DEF_NOMBR;
	cout<<"Ingrese nuevo nombre:"<<endl;
	cin>> nombre_recib;
	return nombre_recib;
}

void opc_mostrar_nombre(persona_t persona){
	cout << "El nombre de la persona es: " << persona.nombre << endl;
}

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

void iniciar_programa(){
	int opcion = DEF_OPC;
	persona_t alguien;
	do{
		opcion = mostrar_menu();
		alguien = ejecutar_opcion(opcion, alguien);
	}while(opcion != OPC_SALIR);
}