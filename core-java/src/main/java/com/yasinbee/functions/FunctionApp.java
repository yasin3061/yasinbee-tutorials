package com.yasinbee.functions;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {

        MyPojo pojo = new MyPojo(1, 2, 3, 4);
        System.out.println(new FunctionApp().normalMethod(pojo, Actions.ACTION3));
        System.out.println(new FunctionApp().functionalMethod(pojo, Actions.ACTION3));

    }

    private int normalMethod(MyPojo pojo, Actions action) {
        if (action == Actions.ACTION1) {
            return pojo.getActionOne();
        } else if (action == Actions.ACTION2) {
            return pojo.getActionTwo();
        } else if (action == Actions.ACTION3) {
            return pojo.getActionThree();
        } else {
            return pojo.getActionFour();
        }
    }

    private Integer functionalMethod(MyPojo pojo, Actions action) {
        Function<MyPojo, Integer> getter = MyPojo.GETTERS_MAP.get(action);
        return getter.apply(pojo);
    }
}
