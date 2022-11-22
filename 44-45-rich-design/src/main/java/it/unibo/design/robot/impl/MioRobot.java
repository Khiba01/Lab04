package it.unibo.design.robot.impl;

import java.util.Arrays;

public class MioRobot {
    
    private final String name;
    private static double BATTERYLEVEL = 100;
    private int componentsNumber;
    private MioComponenete[] listaComponeneti;
    
    public MioRobot(String name) {
        this.name = name;
    }

    public void aggiungiComponente(MioComponenete nuovoComponenete) {
        nuovoComponenete.setConnected(true);
        listaComponeneti[componentsNumber] = nuovoComponenete;
        componentsNumber ++ ;
        Arrays.copyOf(listaComponeneti, listaComponeneti.length + 1);
    }
    public void attivaTutto () {
        for (var componente : listaComponeneti) {
            if ( componente.getBatteryConsup() >= BATTERYLEVEL && componente.getStatus() == true) {
                BATTERYLEVEL -= componente.getBatteryConsup();
                componente.doAction();
                System.out.println("Componente " + componente.getName() + "attivato\nBATTERIA: " + BATTERYLEVEL);
            }
            else System.out.println("Batteria insufficente");
        }
    }
    public static void charge() {
        BATTERYLEVEL = 100;
    }

    public String getName() {
        return name;
    }

    public static double getBATTERYLEVEL() {
        return BATTERYLEVEL;
    }

    public int getComponentsNumber() {
        return componentsNumber;
    }

    public MioComponenete[] getListaComponeneti() {
        return listaComponeneti;
    }
}
