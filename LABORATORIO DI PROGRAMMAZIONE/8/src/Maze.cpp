#include "../include/Maze.h"
#include <fstream>
#include <iostream>

Maze::Maze(std::string filename){

    maze.resize(side, std::vector<char>(side));

    std::ifstream ifs(filename);
    
    if(!ifs){
        std::cout << "Errore nell'apertura del file";
    }

    char c;
    int i=0;
    int j=0;

    while(ifs.get(c)){

        if(c == '\n'){
            j=0;
            i++;
        }
        else{
            maze[i][j]=c;

            if(maze[i][j]=='E'){
                rowExits.push_back(i);
                colExits.push_back(j);
                //std::cout << rowExits[0] << colExits[0] << std::endl;
            }

            if(maze[i][j]=='S'){
                rowPos=i;
                colPos=j;
            }

            j++;
            
        }
    }
    //std::cout << rowPos << colPos << std::endl;
    ifs.close();
}

bool Maze::up(){

    if(maze[rowPos-1][colPos]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi verso l'alto, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        rowPos--;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove in alto..." << std::endl;
        printMaze(*this);
        direction=0;
        return true;
    }
}

bool Maze::down(){

    if(maze[rowPos+1][colPos]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi verso il basso, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        rowPos++;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove in basso..." << std::endl;
        printMaze(*this);
        direction=1;
        return true;
    }
}

bool Maze::right(){

    if(maze[rowPos][colPos+1]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi verso destra, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        colPos++;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove a destra..." << std::endl;
        printMaze(*this);
        direction=2;
        return true;
    }
}

bool Maze::left(){

    if(maze[rowPos][colPos-1]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi verso sinistra, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        colPos--;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove a sinistra..." << std::endl;
        printMaze(*this);
        direction=3;
        return true;
    }
}

bool Maze::upleft(){

    if(maze[rowPos-1][colPos-1]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi diagonalmente in alto a sinistra, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        colPos--;
        rowPos--;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove in alto a sinistra..." << std::endl;
        printMaze(*this);
        return true;
    }
}

bool Maze::upright(){

    if(maze[rowPos-1][colPos+1]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi diagonalmente in alto a destra, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        colPos++;
        rowPos--;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove in alto a destra..." << std::endl;
        printMaze(*this);
        return true;
    }
}

bool Maze::downright(){

    if(maze[rowPos+1][colPos+1]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi diagonalmente in basso a destra, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        colPos++;
        rowPos++;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove in basso a destra..." << std::endl;
        printMaze(*this);
        return true;
    }
}

bool Maze::downleft(){

    if(maze[rowPos+1][colPos-1]=='*'){
        maze[rowPos][colPos] = 'R';
        std::cout << "Impossibile muoversi diagonalmente in basso a sinistra, il robot rimane fermo" << std::endl;
        printMaze(*this);
        return false;
    }
    else{
        maze[rowPos][colPos] = ' ';
        colPos--;
        rowPos++;
        maze[rowPos][colPos] = 'R';
        std::cout << "Robot si muove in basso a sinistra..." << std::endl;
        printMaze(*this);
        return true;
    }
}

bool Maze::checkWin(){

    for(int i=0; i<rowExits.size(); i++){
        if(rowExits[i] == rowPos){
            for(int j=0; j<colExits.size(); j++){
                if(colExits[j] == colPos){
                    return true;
                }
            }
        }
    }

    return false;

}

bool Maze::noWalls(){

    if(maze[rowPos-1][colPos-1]=='*' || maze[rowPos-1][colPos]=='*' || maze[rowPos-1][colPos+1]=='*' || maze[rowPos][colPos-1]=='*' || maze[rowPos][colPos+1]=='*' || maze[rowPos+1][colPos-1]=='*' || maze[rowPos+1][colPos]=='*' || maze[rowPos+1][colPos+1]=='*'){
        return false;
    }

    return true;
    
}

void printMaze(const Maze& m){

    for(int i=0; i<m.getSide(); i++){
        for(int j=0; j<m.getSide(); j++){
            std::cout << m.getChar(i,j);
        }
        std::cout << std::endl;
    }

    std::cout << std::endl;

}
