#include <iostream>
#include <vector>
#include <string>

void print(const std::string& sentence,const std::vector<int>& v);

int main(){

    
    std::vector<int> v = {1,1,1,1,1};
    print("vector: ", v);
    return 0;
}

void print(const std::string& sentence,const std::vector<int>& v){

    std::cout << sentence << std::endl;
    
    for(int i=0; i<v.size(); i++){
        std::cout << v[i] << " ";
    }
}
