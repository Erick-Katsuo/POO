#include <iostream>

using namespace std;

const int FILA = 3;
const int COLUMNA = 3;

const int SIN_COMENZAR = -1;
const int ACTIVO = 1;
const int TERMINO = 0;

int main(){

	char tablero[FILA][COLUMNA] = {};
	int fila_ingresada = -1;
	int columna_ingresada = -1;
	char signo = '-';

	int estado_juego = SIN_COMENZAR;


	do{
		cout<<"Indique coordenadas\nFila: ";
		cin>> fila_ingresada;
		cout<<"Columna: ";
		cin>> columna_ingresada;
		cout<<endl;

		cout<<"Ingrese el signo a ingresar"<<endl;
		cin>>signo;

		tablero[fila_ingresada][columna_ingresada] = signo;


		for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){

			for (int columna_actual = 0; columna_actual < COLUMNA; columna_actual++){
				
				cout<< "\t["<< tablero[fila_actual][columna_actual] << "]  ";

			}
			cout<<endl<<endl<<endl;
		}

		//verica si gano el jugador X en las lineas horizontales
		for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){
			if((tablero[fila_actual][0] =='X') && (tablero[fila_actual][1] =='X') && (tablero[fila_actual][2] =='X')){
				cout<<"Gano el jugador X"<<endl;
				estado_juego = TERMINO;
			}
		}

		//verica si gano el jugador O en las lineas horizontales
		for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){
			if((tablero[fila_actual][0] =='O') && (tablero[fila_actual][1] =='O') && (tablero[fila_actual][2] =='O')){
				cout<<"Gano el jugador O"<<endl;
				estado_juego = TERMINO;
			}
		}


	}while(estado_juego != TERMINO);



	return 0;
}