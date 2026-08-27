#include <iostream>

void print_reference(int& a, double& b);
void print_pointer(int* a, double* b);

int main(){
    int a=1;
    double b=1.5;
    
    print_reference(a,b);
    print_pointer(&a,&b);
    
    return 0;
}

void print_reference(int& a, double& b){
    std::cout << "Per reference (&):" << std::endl;
    std::cout << a << " " << b;
    std::cout << std::endl;
}
void print_pointer(int* a, double* b){
    std::cout << "Per puntatore (*):" << std::endl;
    std::cout << *a << " " << *b;  
}
