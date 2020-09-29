#include <iostream>

using namespace std;

#include "Casa.hpp"

/*Pre: -.
 *Post: Muestra el menu mediante consola.
*/
void menu(){
	cout<<"\t\tMenu"<<endl;
	cout<<"- Obtener numero de casa [1]"<<endl;
	cout<<"- Asignar numero de casa [2]"<<endl;
	cout<<"- Obtener direccion      [3]"<<endl;
	cout<<"- Asignar direccion      [4]"<<endl;
	cout<<"- Obtener si tiene perro [5]"<<endl;
	cout<<"- Asignar si tiene perro [6]"<<endl;
	cout<<"- Salir                  [0]"<<endl;
}

/*Pre: -.
 *Post: Actualiza el atributo "num_casa" de "mi_casa"
*/
void opc_asignar_num_casa(Casa &mi_casa){	
	int nuevo_num_casa = DEF_NUM_CASA;
	bool resultado;
	do{
		cout<<"ingrese nuevo numero de casa"<<endl;
		cout <<"Rango aceptado: 50 a 100 inclusive"<<endl;
		cin >> nuevo_num_casa;
		resultado = mi_casa.asignar_num_casa(nuevo_num_casa);
	}while(!resultado);
}


/*Pre: "mi_casa" correctamente actualizado
 *Post: ejecuta la "opcion" correspondiente
*/
void ejecutar_opcion(int opcion, Casa &mi_casa){
	string nueva_direccion = DEF_DIRECCION;
	bool actualizar_tiene_perro = DEF_TIENE_PERRO;

	switch(opcion){
		case 1:
			cout<< "Numero de casa: " << mi_casa.obtener_num_casa() <<endl;
			break;
		case 2:
			opc_asignar_num_casa(mi_casa);
			break;
		case 3:
			cout << "direccion: "<< mi_casa.obtener_direccion()<< endl;
			break;
		case 4:
			cout<<"ingrese nueva direccion"<<endl;
			cin>> nueva_direccion;
			mi_casa.asignar_direccion(nueva_direccion);
			break;
		case 5:
			cout<< "Tiene perro: Si [1] - No [0] => " << mi_casa.obtener_tiene_perro() <<endl;
			break;
		case 6:
			cout<< "Ingrese si la casa tiene perro"<<endl;
			cout<< "Si [1] - No [0]" << endl;
			cin >> actualizar_tiene_perro;
			mi_casa.asignar_tiene_perro(actualizar_tiene_perro);
			break;
		case 0:
			cout << "direccion: "<< mi_casa.obtener_direccion()<< endl;
			cout<<"Saliendo"<<endl;
			break;
		default: 
			cout<<"Ingreso no aceptado"<<endl;
	}

}


int main(){
	int opcion = -1;

	Casa mi_casa;

	do{
		menu();
		cin >> opcion;
		ejecutar_opcion(opcion, mi_casa);
	}while(opcion != 0);


	return 0;
}