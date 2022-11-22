package it.unibo.design.robot.api;

import it.unibo.design.robot.impl.BaseRobot;

public interface RobotWithArms extends Robot {
    boolean pickUp();

    boolean dropDown();

    int carrieditems();
}
