#include <iostream>

using namespace std;

const int FILA = 3;
const int COLUMNA = 3;

const int SIN_COMENZAR = -1;
const int ACTIVO = 1;
const int TERMINO = 0;




/*Pre: "tablero" actualizado y "signo" correspondiente al turno
 *Post: retorna "estado_juego" actualizado
*/
int verificar_horizontal(char tablero[][COLUMNA], char signo){
	int estado_juego = ACTIVO;

	for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){
		if((tablero[fila_actual][0] == signo) && (tablero[fila_actual][1] == signo) && (tablero[fila_actual][2] == signo)){
			cout<<"Gano el jugador "<< signo <<endl;
			estado_juego = TERMINO;
		}
	}

	return estado_juego;
}

/*Pre: "tablero" actualizado y "signo" correspondiente al turno
 *Post: retorna "estado_juego" actualizado
*/
int verificar_vertical(char tablero[][COLUMNA], char signo){
	int estado_juego = ACTIVO;

	for(int columna_actual = 0; columna_actual < COLUMNA ; columna_actual ++ ){
		if((tablero[0][columna_actual] == signo) && (tablero[1][columna_actual] == signo) && (tablero[2][columna_actual] == signo)){
			cout<<"Gano el jugador "<< signo <<endl;
			estado_juego = TERMINO;
		}
	}

	return estado_juego;
}

/*Pre: "tablero" actualizado y "signo" correspondiente al turno
 *Post: retorna "estado_juego" actualizado
*/
int verificar_diagonal(char tablero[][COLUMNA], char signo){
	int estado_juego = ACTIVO;

	if((tablero[2][0] == signo) && (tablero[1][1] == signo) && (tablero[0][2] == signo)){
		cout<<"Gano el jugador "<< signo <<endl;
		estado_juego = TERMINO;
	}else if((tablero[0][0] == signo) && (tablero[1][1] == signo) && (tablero[2][2] == signo)){
		cout<<"Gano el jugador "<< signo <<endl;
		estado_juego = TERMINO;
	}

	return estado_juego;
}

/*Pre: "tablero" actualizado y "signo" correspondiente al turno
 *Post: retorna "estado_juego" actualizado
*/
int verificar_gano(char tablero[][COLUMNA], char signo){
	int estado_juego = ACTIVO;

	for(int i = 1 ; i < 4 ; i++){
		switch(i){
			case 1:
				cout << "Verificando horizontal" <<endl;
				estado_juego = verificar_horizontal(tablero, signo);
				break;
			case 2:
				cout << "Verificando vertical" <<endl;
				estado_juego = verificar_vertical(tablero, signo);
				break;
			case 3:
				cout << "Verificando diagonal" <<endl;
				estado_juego = verificar_diagonal(tablero, signo);
		}

		if(estado_juego == TERMINO){
			i = 4;
		}
	}

	return estado_juego;
}


int verificar_gano_jugador(char tablero[][COLUMNA]){
	int estado_juego = ACTIVO;

	cout<<"verificando jugador X"<<endl;
	estado_juego = verificar_gano(tablero, 'X');
	if(estado_juego != TERMINO){
		cout<<"verificando jugador O"<<endl;
		estado_juego = verificar_gano(tablero, 'O');
	}

	return estado_juego;
}

char asignar_signo(int turno){
	char signo = '-';
	if(turno%2 == 0){
		signo = 'X';
	}else{
		signo = 'O';
	}
	return signo;
}


void mostrar_tablero(char tablero[][COLUMNA]){
	for(int fila_actual = 0; fila_actual < FILA ; fila_actual ++ ){

		for (int columna_actual = 0; columna_actual < COLUMNA; columna_actual++){
				
			cout<< "\t["<< tablero[fila_actual][columna_actual] << "]  ";

		}
		cout<<endl<<endl<<endl;
	}
}

void iniciar_juego(){
	char tablero[FILA][COLUMNA] = {};
	char signo = '-';
	int estado_juego = SIN_COMENZAR;
	int turno = 0;
	int fila_ingresada = -1;
	int columna_ingresada = -1;

	do{
		cout<<"Indique coordenadas\nFila: ";
		cin>> fila_ingresada;
		cout<<"Columna: ";
		cin>> columna_ingresada;
		cout<<endl;

		signo = asignar_signo(turno);
		tablero[fila_ingresada][columna_ingresada] = signo;

		mostrar_tablero(tablero);
		estado_juego = verificar_gano_jugador(tablero);	

		cout<< "Turno actual: "<< turno<< " - Signo: "<<signo<<endl;
		turno++;

	}while(estado_juego != TERMINO);
}



int main(){

	iniciar_juego();
	
	return 0;
}