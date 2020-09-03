#include <iostream>

using namespace std;

const int FILA = 3;
const int COLUMNA = 3;

int main(){

	char tablero[FILA][COLUMNA] = {{'a' ,'b' ,'c'},
								   {'d' ,'e' ,'f'},
								   {'g', 'h', 'i'}};



	for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){

		for (int columna_actual = 0; columna_actual < COLUMNA; columna_actual++){
			
			cout << "Fila: " << fila_actual << " Columna: " << columna_actual << endl;

		}
	}

	cout<<endl<<endl;

	for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){

		for (int columna_actual = 0; columna_actual < COLUMNA; columna_actual++){
			
			cout<< "\t("<< tablero[fila_actual][columna_actual] << ")  ";

		}
		cout<<endl<<endl<<endl;
	}

	return 0;
}