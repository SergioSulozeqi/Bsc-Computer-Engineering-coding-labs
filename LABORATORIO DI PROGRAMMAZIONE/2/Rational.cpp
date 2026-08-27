#include "Rational.h"
#include <algorithm>

Rational::Rational()
    :num{0}, den{1}
{}
    
Rational::Rational(int integer)
    :num{integer}, den{1}
{}
    
Rational::Rational(int num, int den)
    :num{num}, den{den}
{}


int Rational::getNum()const{
	return num;
}

int Rational::getDen()const{
	return den;
}


double Rational::to_double()const{
	double d = (double)num/den;
	return d;
}


Rational& Rational::operator=(const Rational& r){
	num = r.num;
	den = r.den;
	return *this;
}


Rational Rational::operator+(int n){
	return Rational(num+n*den, den);
}

Rational Rational::operator+(const Rational& r){
	int denominator = mcm(den, r.den);
	int numerator = (denominator/den)*num + (denominator/r.den)*r.num;
	Rational sum = Rational(numerator, denominator);

	sum.simplify();

	return sum;
}

Rational Rational::operator-(const Rational& r){
	int denominator = mcm(den, r.den);
	int numerator = (denominator/den)*num - (denominator/r.den)*r.num;
	Rational dif = Rational(numerator, denominator);

	dif.simplify();

	return dif;
}

Rational Rational::operator*(const Rational& r){
	int numerator = num*r.num;
	int denominator = den*r.den;
	Rational pro = Rational(numerator, denominator);

	pro.simplify();
	return pro;
}

Rational Rational::operator/(const Rational& r){
	return *this * r.inverse();
}


bool Rational::operator==(const Rational& r){
	double d1 = to_double();
	double d2 = r.to_double();
	return d1==d2;
}

bool Rational::operator<(const Rational& r){
	double d1 = to_double();
	double d2 = r.to_double();
	return d1<d2;
}

bool Rational::operator>(const Rational& r){
	double d1 = to_double();
	double d2 = r.to_double();
	return d1>d2;
}



std::ostream& operator<<(std::ostream& os, const Rational& r){
	if(r.getDen()==1) return os << r.getNum();
	return os << r.getNum() << "/" << r.getDen();
}

Rational Rational::inverse()const{
	
	return Rational(den,num);
}

Rational& Rational::simplify(){
	int div = mcd(num,den);
	num /= div;
	den /= div;

	return *this;
}

int mcm(int n1, int n2) { //algortimo di euclide
    int temp = mcd(n1, n2);
    return (n1 * n2) / temp;
}

int mcd(int n1, int n2) { //algoritmo di euclide

    int max = std::max(n1,n2);
    int min = (max == n1) ? n2 : n1;
    if (min == 0) return max;
    int r=0;
    
    do{
        r = max%min;
        max = min;
        min = r;
    }while(r != 0);
    
    return max;
}

int main(){
	return 0;
}