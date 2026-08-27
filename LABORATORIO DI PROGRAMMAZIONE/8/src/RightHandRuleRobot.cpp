#include "../include/RightHandRuleRobot.h"
#include <iostream>

RightHandRuleRobot::RightHandRuleRobot(){
	std::cout << "Right hand rule robot creato" << std:: endl << std::endl;
}

bool RightHandRuleRobot::move(Maze& m){


	if(m.noWalls()){
		while(m.right()){
			if(m.checkWin()){
				return true;
			}
		}
		m.setDir(0);
	}

	


	if(m.getDir()==0){

		if(m.right()){
			return m.checkWin();
		}

		if(m.up()){
			return m.checkWin();
		}

		if(m.left()){
			return m.checkWin();
		}
		if(m.down()){
			return m.checkWin();
		}

	}

	else if(m.getDir()==1){

		if(m.left()){
			return m.checkWin();
		}

		if(m.down()){
			return m.checkWin();
		}

		if(m.right()){
			return m.checkWin();
		}
		if(m.up()){
			return m.checkWin();
		}

	}

	else if(m.getDir()==2){

		if(m.down()){
			return m.checkWin();
		}

		if(m.right()){
			return m.checkWin();
		}

		if(m.up()){
			return m.checkWin();
		}
		if(m.left()){
			return m.checkWin();
		}

	}

	else if(m.getDir()==3){

		if(m.up()){
			return m.checkWin();
		}

		if(m.left()){
			return m.checkWin();
		}

		if(m.down()){
			return m.checkWin();
		}
		if(m.right()){
			return m.checkWin();
		}

	}
	



	/*int direction=0;

	if(direction=0){
		if(m.getChar(m.getRowPos(), m.getColPos()+1)=='*' && m.up()){ //ho il muro a destra e non sopra -> vado sopra
			return m.checkWin();
		}
	}
	

	else if(m.getChar(m.getRowPos()-1,m.getColPos())=='*' && m.left()){ //ho il muro sopra e non a sinistra ->vado a sinistra
		return m.checkWin();
	}


	else if(m.getChar(m.getRowPos()-1,m.getColPos()+1)=='*' && m.up()){ // ho superato un angolo muovendomi verso sinistra -> vado sopra
		return m.checkWin();
	}

	else if(m.getChar(m.getRowPos()+1,m.getColPos()+1)=='*' && m.right()){ // ho superato un angolo muovendomi verso l'alto -> vado a destra
		return m.checkWin();
	}*/

	return false;

}