package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private int carriedItems;

    public RobotWithTwoArms(String robotName) {
		super(robotName);
	}

	@Override
    public boolean pickUp() {
        if(carriedItems == 0 || carriedItems == 1) {
            carriedItems ++;
            return true;
        }
        return false;
    }

    @Override
    public boolean dropDown() {
        if(carriedItems > 0) {
            carriedItems --;
            return true;
        }
        return false; 
    }

    @Override
    public int carrieditems() {
        return carriedItems;
    }
    
}
