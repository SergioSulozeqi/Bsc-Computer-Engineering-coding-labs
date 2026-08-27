#ifndef MAZE_H
#define MAZE_H

#include <string>


class Maze{

    public:

        explicit Maze(std::string filename);

        int getSide() const {return side;}
        char getChar(int i,int j) const {return maze[i][j];}
        int getRowPos() const {return rowPos;}
        int getColPos() const {return colPos;}
        int getDir() const{return direction;}
        void setDir(int n){direction = n;}

        bool up();
        bool down();
        bool left();
        bool right();
        bool upright();
        bool upleft();
        bool downright();
        bool downleft();

        bool noWalls();

        bool checkWin();

    
    private:
        static constexpr int side = 9;
        std::vector<std::vector<char>> maze;
        int rowPos = 0;
        int colPos = 0;
        std::vector<int> rowExits;
        std::vector<int> colExits;
        int direction=-1;
};

void printMaze(const Maze& m);


#endif
