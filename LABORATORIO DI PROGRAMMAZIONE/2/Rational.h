#include <iostream>

class Rational{
    public:
        Rational();
        Rational(int integer);
        Rational(int num, int den);

        int getNum()const;
        int getDen()const;
        
        double to_double()const;

        Rational& operator=(const Rational& r);
        Rational operator+(const Rational& r);
        Rational operator+(int n);
        Rational operator-(const Rational& r);
        Rational operator*(const Rational& r);
        Rational operator/(const Rational& r);
        bool operator==(const Rational& r);
        bool operator>(const Rational& r);
        bool operator<(const Rational& r);
    
    
    private:
        int num;
        int den;
        Rational& simplify();
        Rational inverse()const;
};

std::ostream& operator<<(std::ostream& os, const Rational& r2);

int mcm(int n1, int n2);
int mcd(int n1, int n2);