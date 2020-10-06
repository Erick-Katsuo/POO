#include <iostream>

using namespace std;

#include "Usuario.hpp"
	
void procedimiento(){
	Usuario obj1("Creando objeto: ",1, "obj1");
	Usuario obj2("Creando objeto: ",2, "obj2");
	Usuario obj3("Creando objeto: ",3, "obj3");
}

int main(){
	Usuario obj4("Creando objeto: ",4, "obj4");
	Usuario obj5("Creando objeto: ",5, "obj5");
	Usuario obj6("Creando objeto: ",6, "obj6");
	procedimiento();	
	Usuario obj7("Creando objeto: ",7, "obj7");
	Usuario obj8("Creando objeto: ",8, "obj8");

	return 0;
}