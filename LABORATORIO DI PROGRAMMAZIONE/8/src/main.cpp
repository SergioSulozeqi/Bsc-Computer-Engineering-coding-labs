#include <fstream>
#include <string>
#include <iostream>
#include "../include/Maze.h"
#include "../include/RightHandRuleRobot.h"
#include "../include/RandomRobot.h"


int main(){
		
	Maze labirinto1 = Maze("../Maze.txt");

	std::cout << "Situazione iniziale" << std::endl;
	printMaze(labirinto1);
	

	RandomRobot r1 = RandomRobot();

	std::cout << "iniziamo il gioco..." << std::endl;

	while(!r1.move(labirinto1)){
		std::cout << "Ci sei quasi..." << std::endl;
	}

	std::cout << "BRAVO, Hai trovato l'uscita!" << std::endl;




	Maze labirinto2 = Maze("../Maze.txt");
	std::cout << "Situazione iniziale" << std::endl;
	printMaze(labirinto2);

	RightHandRuleRobot r2 = RightHandRuleRobot();

	std::cout << "iniziamo il gioco..." << std::endl;

	while(!r2.move(labirinto2)){
		std::cout << "Ci sei quasi..." << std::endl;
	}

	std::cout << "BRAVO, Hai trovato l'uscita!" << std::endl;
}