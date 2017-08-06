package com.yasinbee.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MyPojo {

    private int actionOne;
    private int actionTwo;
    private int actionThree;
    private int actionFour;

    public static final Map<Actions, Function<MyPojo, Integer>> GETTERS_MAP = new HashMap<>();
    
    static {
        GETTERS_MAP.put(Actions.ACTION1, MyPojo::getActionOne);
        GETTERS_MAP.put(Actions.ACTION2, MyPojo::getActionTwo);
        GETTERS_MAP.put(Actions.ACTION3, MyPojo::getActionThree);
        GETTERS_MAP.put(Actions.ACTION4, MyPojo::getActionFour);
    }

    public MyPojo(int one, int two, int three, int four) {
        this.actionOne = one;
        this.actionTwo = two;
        this.actionThree = three;
        this.actionFour = four;
    }

    public int getActionOne() {
        return actionOne;
    }

    public void setActionOne(int actionOne) {
        this.actionOne = actionOne;
    }

    public int getActionTwo() {
        return actionTwo;
    }

    public void setActionTwo(int actionTwo) {
        this.actionTwo = actionTwo;
    }

    public int getActionThree() {
        return actionThree;
    }

    public void setActionThree(int actionThree) {
        this.actionThree = actionThree;
    }

    public int getActionFour() {
        return actionFour;
    }

    public void setActionFour(int actionFour) {
        this.actionFour = actionFour;
    }
}
