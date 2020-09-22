#include <iostream>
#include <string>

using namespace std;

template <typename Dato>
Dato obtener_mayor(Dato v1, Dato v2){
	Dato resultado;
	if(v1 > v2){
		resultado = v1;
	}else{
		resultado = v2;
	}

	/*
		codigo
	*/

	return resultado;
}


int main(){

	int valor_uno = 11;
	int valor_dos = 2;

	string valor_tres = "pinia";
	string valor_cuatro = "pizza";

	cout << obtener_mayor(valor_uno, valor_dos) <<endl;

	cout << obtener_mayor(valor_tres, valor_cuatro) <<endl;


	return 0;
}