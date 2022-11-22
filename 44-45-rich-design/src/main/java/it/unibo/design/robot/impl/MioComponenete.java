package it.unibo.design.robot.impl;

public class MioComponenete {
    private final String name;
    private boolean status;
    private boolean connected;
    private final double batteryConsup;

    public MioComponenete(String name, double batteryConsup) {
        this.name = name;
        this.batteryConsup = batteryConsup;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean isConnected() {
        return connected;
    }

    public double getBatteryConsup() {
        return batteryConsup;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getName() {
        return name;
    }

    public void doAction() {

    }    
}
