#include "../include/RandomRobot.h"

#include <random>
#include <iostream>


RandomRobot::RandomRobot(){
	std::cout << "Random robot creato" << std::endl << std::endl;
}


bool RandomRobot::move(Maze& m){



	/*----------------------------------------------------------------------------*/
	//Ho chiesto a CHATGPT come generare un numero più randomico possibile

	// Creiamo un motore di numeri casuali, inizializzato con un seme
    std::random_device rd;  // Il seme per il generatore (spesso basato su entropia di sistema)
    std::mt19937 gen(rd()); // mt19937 è il generatore di numeri casuali basato sull'algoritmo Mersenne Twister

    // Definisci l'intervallo desiderato, ad esempio tra 1 e 100
    std::uniform_int_distribution<> dis(1, 8);

    // Genera un numero casuale nell'intervallo specificato
    int random_number = dis(gen);
    /*----------------------------------------------------------------------------*/



    if(random_number==1){
    	if(m.down()){
    		return m.checkWin();
    	}
    }
    else if(random_number==2){
    	if(m.up()){
    		return m.checkWin();
    	}
    }
    else if(random_number==3){
    	if(m.left()){
    		return m.checkWin();
    	}
    }
    else if(random_number==4){
    	if(m.right()){
    		return m.checkWin();
    	}
    }
    else if(random_number==5){
    	if(m.upright()){
    		return m.checkWin();
    	}
    }
    else if(random_number==6){
    	if(m.upleft()){
    		return m.checkWin();
    	}
    }
    else if(random_number==7){
    	if(m.downright()){
    		return m.checkWin();
    	}
    }
    else{
    	if(m.downleft()){
    		return m.checkWin();
    	}
    }


    return false;

}