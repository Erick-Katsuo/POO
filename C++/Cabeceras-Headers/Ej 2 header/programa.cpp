#include <iostream>
using namespace std;

#include "matematica.hpp"


/*Pre:-.
 *Post: muestra el menu
*/
void mostrar_menu();

/*Pre:-.
 *Post: realiza la operacion elegida por el usuario
*/
void menu();


int main(){

	menu();
	
	return 0;
}


void mostrar_menu(){
	cout << "\t\tMenu" << endl;
	cout << "\t  - dividir -"<< endl;
	cout << "\t  - multiplicar -"<< endl;
	cout << "\t  - salir -"<< endl;
	cout << "\t escribir opcion"<<endl;
}

void menu(){
	float resultado;
	string opcion;

	do{
		mostrar_menu();
		cin >> opcion;
		if(opcion == "dividir"){
			cout << "vamos a dividir!"<<endl;
			resultado = dividir();
			cout<<"Resultado: "<< resultado <<endl; 
		}else if(opcion == "multiplicar"){
			cout << "vamos a multiplicar!" <<endl;
			resultado = multiplicar();
			cout<<"Resultado: "<< resultado <<endl;
		}else if(opcion == "salir"){
			cout<<"Saliendo.."<<endl;
		}else{
			cout<<"ingreso no aceptado"<<endl;
		}
	}while(opcion != "salir");
}
