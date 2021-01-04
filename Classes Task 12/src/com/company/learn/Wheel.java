package com.company.learn;

public class Wheel {

    private boolean broken;

    public Wheel (boolean broken){
        this.broken = broken;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public static  void repair (Wheel wheel){           //починка колеса
        if (wheel.isBroken()){
            wheel.setBroken(false);
        }
    }
}
