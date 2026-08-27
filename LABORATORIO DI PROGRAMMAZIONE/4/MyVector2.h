#ifndef MYVECTOR2_H
#define MYVECTOR2_H


#include <initializer_list>

class MyVector2{

	public:

	    MyVector2(int size = 0);
		MyVector2(int size, int logicSize);
	    MyVector2(std::initializer_list<double> lst);
		MyVector2(const MyVector2& v); //copy constructor
		MyVector2(MyVector2&& v); //move constructor


	    ~MyVector2(){delete[] pt; pt=nullptr;};
	    
	    class OutOfRange{};
	    
	    int size(){return logicSz;}
	    int bufferSize(){return sz;}
	
	    double& operator[](int pos) { return pt[pos]; }
		double operator[](int pos) const { return pt[pos]; }
		MyVector2& operator=(const MyVector2& v); //copy assignment
		MyVector2& operator=(MyVector2&& v); //move assignment //move constructor
		
		double& at(int n);
		
		void push_back(double n);
		void pop_back();
		
		void reserve(int n);
		
		
		
	private:
	    int sz;
	    int logicSz;
	    double* pt = nullptr;
	
};

#endif
