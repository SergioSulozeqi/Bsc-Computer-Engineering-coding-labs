#include "MyVector2.h"
#include <iostream>
#include <algorithm>

MyVector2::MyVector2(int size)
	:sz{size}, pt{new double[size]}, logicSz{size}
{}

MyVector2::MyVector2(int size, int logicSize)
    :sz{size}, pt{new double[size]}, logicSz{logicSize}
{}

MyVector2::MyVector2(std::initializer_list<double> lst)
    :sz{(int)lst.size()}, pt{new double[sz]}, logicSz{sz}
{
    std::copy(lst.begin(), lst.end(), pt);
} 

MyVector2::MyVector2(const MyVector2& v)
    :sz{v.sz}, pt{new double[v.sz]}, logicSz{v.logicSz}
{
    std::copy(v.pt, v.pt+logicSz, pt);
}

MyVector2::MyVector2(MyVector2&& v)
    :sz{v.sz}, pt{v.pt}, logicSz{v.logicSz}
{
    v.sz=0;
    v.pt=nullptr;
}


MyVector2& MyVector2::operator=(const MyVector2& v){
    double* p = new double[v.sz];
    std::copy(v.pt, v.pt+v.logicSz, p);
    delete[] pt;
    pt = p;
    sz = v.sz;
    logicSz = v.logicSz;
    return *this;
}

MyVector2& MyVector2::operator=(MyVector2&& v){
    delete[] pt;
    pt = v.pt;
    sz = v.sz;
    v.pt = nullptr;
    v.sz = 0;
    return *this;
}

double& MyVector2::at(int n){
    if(n>=0 && n<logicSz){
        return pt[n];
    }
    throw MyVector2::OutOfRange();
}

void MyVector2::pop_back(){
    if(logicSz==0) throw MyVector2::OutOfRange();
    logicSz--;
}

void MyVector2::push_back(double n){
    if(logicSz==sz){
        MyVector2 v(sz*2+1,logicSz);
        std::copy(pt, pt+logicSz, v.pt);
        *this = v;
    }
    pt[logicSz] = n;
    logicSz++;
}


void MyVector2::reserve(int n){
    if(sz<n){
        MyVector2 v(n, logicSz);
        std::copy(pt, pt+logicSz, v.pt);
        *this = v;
        std::cout<< "sto usando reserve..." << std::endl;
    }
}

int main(){
    return 0;
}
