#include "MyVector2.h"
#ifndef MYVECTOR2_HPP
#define MYVECTOR2_HPP
#include <iostream>
#include <algorithm>

template<typename T>
MyVector2<T>::MyVector2(int size)
	:sz{size}, pt{new T[size]}, logicSz{size}
{}

template<typename T>
MyVector2<T>::MyVector2(int size, int logicSize)
    :sz{size}, pt{new T[size]}, logicSz{logicSize}
{}

template<typename T>
MyVector2<T>::MyVector2(std::initializer_list<T> lst)
    :sz{(int)lst.size()}, pt{new double[sz]}, logicSz{sz}
{
    std::copy(lst.begin(), lst.end(), pt);
} 

template<typename T>
MyVector2<T>::MyVector2(const MyVector2<T>& v)
    :sz{v.sz}, pt{new T[v.sz]}, logicSz{v.logicSz}
{
    std::copy(v.pt, v.pt+logicSz, pt);
}

template<typename T>
MyVector2<T>::MyVector2(MyVector2<T>&& v)
    :sz{v.sz}, pt{v.pt}, logicSz{v.logicSz}
{
    v.sz=0;
    v.pt=nullptr;
}


template<typename T>
MyVector2<T>& MyVector2<T>::operator=(const MyVector2<T>& v){
    T* p = new T[v.sz];
    std::copy(v.pt, v.pt+v.logicSz, p);
    delete[] pt;
    pt = p;
    sz = v.sz;
    logicSz = v.logicSz;
    return *this;
}

template<typename T>
MyVector2<T>& MyVector2<T>::operator=(MyVector2<T>&& v){
    delete[] pt;
    pt = v.pt;
    sz = v.sz;
    v.pt = nullptr;
    v.sz = 0;
    return *this;
}

template<typename T>
T& MyVector2<T>::at(int n){
    if(n>=0 && n<logicSz){
        return pt[n];
    }
    throw MyVector2<T>::OutOfRange();
}

template<typename T>
void MyVector2<T>::pop_back(){
    if(logicSz==0) throw MyVector2<T>::OutOfRange();
    logicSz--;
}

template<typename T>
void MyVector2<T>::push_back(const T& n){
    if(logicSz==sz){
        MyVector2<T> v(sz*2+1,logicSz);
        std::copy(pt, pt+logicSz, v.pt);
        *this = v;
    }
    pt[logicSz] = n;
    logicSz++;
}


template<typename T>
void MyVector2<T>::reserve(int n){
    if(sz<n){
        MyVector2<T> v(n, logicSz);
        std::copy(pt, pt+logicSz, v.pt);
        *this = v;

    }
}



#endif
