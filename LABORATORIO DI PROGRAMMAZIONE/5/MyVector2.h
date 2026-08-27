#ifndef MYVECTOR2_H
#define MYVECTOR2_H


#include <initializer_list>

template<typename T>
class MyVector2{

	public:

	    MyVector2(int size = 0);
		MyVector2(int size, int logicSize);
	    MyVector2(std::initializer_list<T> lst);
		MyVector2(const MyVector2<T>& v); //copy constructor
		MyVector2(MyVector2<T>&& v); //move constructor


	    ~MyVector2(){delete[] pt; pt=nullptr;};
	    
	    class OutOfRange{};
	    
	    int size(){return logicSz;}
	    int bufferSize(){return sz;}
	
	    T& operator[](int pos) { return pt[pos]; }
		T operator[](int pos) const { return pt[pos]; }
		MyVector2<T>& operator=(const MyVector2<T>& v); //copy assignment
		MyVector2<T>& operator=(MyVector2<T>&& v); //move assignment //move constructor
		
		T& at(int n);
		
		void push_back(const T& n);
		void pop_back();
		
		void reserve(int n);
		
		
		
	private:
	    int sz;
	    int logicSz;
	    T* pt = nullptr;
	
};

#include "MyVector2.hpp"

#endif
