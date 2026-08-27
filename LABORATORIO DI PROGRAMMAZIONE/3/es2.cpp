#include <iostream>

void printArray(const double* a, int d);
int print_array_length(const double* a);

int main(){
    const int dim = 10;
    double arr[dim] = {};
    //printArray(&arr[0], dim); //(80)
    //std::cout << sizeof(arr) << std::endl;
    std::cout << print_array_length(arr) << std::endl;
    return 0;
}

void printArray(const double* a, int d){
    for(int i=0; i<d; i++){
        std::cout << a[i] << std::endl;
    }
}

int print_array_length(const double* a){
    return sizeof(a);
    //RITORNA LA DIMENSIONE DEL CONTENUTO DEL PUNTATORE (CIOE' DELLA PRIMA CELLA DELL'ARRAY E NON LA LUNGHEZZA DEL VETTORE) PERCHE' IO HO PASSATO ALLA FUNZIONE IL PUNTATORE ALL'ARRAY E NON L'ARRAY STESSO (NON LO SI PUO' PASSARE)
}
