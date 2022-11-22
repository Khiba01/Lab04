package it.unibo.design.robot.impl;

public class MioBatteriaAtomica extends MioComponenete {

    public MioBatteriaAtomica(String name, double batteryConsup) {
        super(name, batteryConsup);
    }

    @Override
    public void setStatus(boolean status) {
        if (MioRobot.getBATTERYLEVEL() >= 50) {
            super.setStatus(true);
        }
    }

    @Override
    public void doAction() {
        MioRobot.charge();
    }
}
