#include "Complex.h"
#include <iostream>

int main() {
    Complex<int> *z = new Complex<int>(3,2);
    
    std::cout << "z = " << z->getAlgebraic() << std::endl;
    
    Complex<int> *c = new Complex<int>(1,1);
    *z += *c;
    std::cout << "z = " << (*z).getAlgebraic() << std::endl;

    return 0;
}