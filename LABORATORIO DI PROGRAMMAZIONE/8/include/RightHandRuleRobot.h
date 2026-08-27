#ifndef RIGHTHANDRULEROBOT_H
#define RIGHTHANDRULEROBOT_H

#include "Robot.h"


class RightHandRuleRobot : public Robot{

    public:

        RightHandRuleRobot();

        bool move(Maze& m);
        
};


#endif