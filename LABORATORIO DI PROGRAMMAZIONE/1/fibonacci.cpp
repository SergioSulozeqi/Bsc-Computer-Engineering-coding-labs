#include <iostream>
#include <string>
#include <vector>

void fibonacci(int x, int y, std::vector<int>& v, int n);
void print(const std::string& sentence,const std::vector<int>& v);


int main(){
    std::vector<int> v = {};
    fibonacci(1, 2, v, 100);
    print("vettore di fibonacci: ", v);
    return 0;
}

void fibonacci(int x, int y, std::vector<int>& v, int n){

    v.clear();
    v.push_back(x);
    v.push_back(y);
    
    for(int i=2; i<n+2; i++){
        v.push_back(v[i-1] + v[i-2]);
    }
}

void print(const std::string& sentence,const std::vector<int>& v){

    std::cout << sentence << std::endl;
    
    for(int i=0; i<v.size(); i++){
        std::cout << v[i] << " ";
    }
}

//1836311903
