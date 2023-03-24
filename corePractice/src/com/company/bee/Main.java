package com.company.bee;
import com.company.bee.service.BeeService;
public class Main {
    public static void main(String[] args) {
        BeeService bee = new BeeService();
        bee.setBeeAmount(20);
        bee.getRandom();
        bee.attackBee();
        bee.printBeeType();
    }
}
