#ifndef ROBOT_H
#define ROBOT_H

#include "Maze.h"

class Robot{

    public:

        virtual bool move(Maze& m) = 0;

};


#endif
