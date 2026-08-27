#include <iostream>

void f();
void printArray(const int* a, int d);
void f_illegal();

int main(){
    f();
    f_illegal();
    return 0;
}

void f(){
    const int dim = 10;
    int arr[dim] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    printArray(&arr[0], dim);
    int n=5;
    int* p = &arr[n];
    for(int i=0; i<dim; i++){
        *p = 1;
        n++;
        n = n%10;
        p = &arr[n];
    }
    
    //printArray(&arr[0], dim);
}

void f_illegal(){
	const int dim = 10;
    int arr[dim] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int n=5;
    int* p = &arr[n];
    p[15] = 1;
    //errore di segmentazione esce quando provo a scrivere in una zona di memoria che e' adibita al sistema operativo. Non esce l'errore se provo a scrivere in una zona della memoria non assegnata al mio programma, che pero' e' disponibile per la scrittura di programmi
    printArray(&arr[0], dim);
}

void printArray(const int* a, int d){
    for(int i=0; i<d; i++){
        std::cout << a[i] << std::endl;
    }
}
