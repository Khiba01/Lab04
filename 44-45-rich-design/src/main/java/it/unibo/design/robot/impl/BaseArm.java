package it.unibo.design.robot.impl;

public class BaseArm {

    private final String armName;
    private static final double PICKUP_CONSUP = 0.2;
    private static final double DROPDOWN_CONSUP = 0.1;
    private boolean isGrabbing;

    public BaseArm(String armName) {
        this.armName = armName;
    }
    
    boolean isGrabbing() {
        return true;
    }

    void pickUp() {
        if (isGrabbing = false) {
            isGrabbing = true;
        }
    }

    void dropDown() {
        if (isGrabbing = true) {
            isGrabbing = false;
        }
    }

    double getConsumptionForPickUp() {
        return PICKUP_CONSUP;
    }

    double getConsumptionForDropDown() {
        return DROPDOWN_CONSUP;
    }
}
