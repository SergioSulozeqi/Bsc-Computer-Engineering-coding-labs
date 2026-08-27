#include <iostream>

void call_counter(void);

int main(){

	call_counter();
	call_counter();
	call_counter();
	call_counter();

	return 0;
}


void call_counter(void){
	static int counter = 1;
	std::cout << counter << std::endl;
	counter++;
}
