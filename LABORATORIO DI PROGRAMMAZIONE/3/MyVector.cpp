#include "MyVector.h"
#include <iostream>


MyVector::MyVector(int sz)
	:size{sz}, pt{new double[sz]}
{
	for(int i=0; i<sz; ++i) pt[i]=i;
}

void safe_set(MyVector& v, int i, double d){
	if(i>=0 && i<v.get_size()){
		v[i] = d;
	}
}

double safe_get(MyVector& v, int i){
	if(i>=0 && i<v.get_size()){
		return v[i];
	}
	return -10000;
}
