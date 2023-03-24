package com.company.bee.service;

import com.company.bee.entity.Bee;
import com.company.bee.entity.DroneBee;
import com.company.bee.entity.QueenBee;
import com.company.bee.entity.WorkerBee;

import java.util.Arrays;
import java.util.Random;

interface RandomBee {
    void getRandom();
    void printBeeType();
    void attackBee();
}
public class BeeService extends Bee implements RandomBee{
    private int beeAmount;
    private Bee beeList[];
    public BeeService(){
    }
    public BeeService(int beeAmount){
        this.beeAmount=beeAmount;
        beeList = new Bee[beeAmount];
    }
    public int getBeeAmount() {
        return  beeAmount;
    }
    public void setBeeAmount(int beeAmount) {
        this.beeAmount = beeAmount;
        beeList = new Bee[beeAmount];
    }
    public void getRandom(){
        Random random = new Random();
        for (int i = 0; i < beeList.length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    this.beeList[i] = new QueenBee();
                    break;
                case 1:
                    this.beeList[i] = new DroneBee();
                    break;
                case 2:
                    this.beeList[i] = new WorkerBee();
                    break;
            }
        }
    }
    public void printBeeType(){
            for (Bee bee : beeList) {
                System.out.println(bee.getBeeType()+ " - "+ bee.getRemainHP()+"HP - "+isDead(bee));
            }
    }
    public void attackBee(){
        Random random = new Random();
        for (int i = 0; i < beeList.length; i++) {
                damage = random.nextInt(100);
                beeList[i].setRemainHP(damage);
        }
    }
    public String isDead(Bee bee){
        if(bee.getRemainHP()<20 && bee.getBeeType().equals("Queen Bee")){
            return ("Dead");
        }
        if(bee.getRemainHP()<50 && bee.getBeeType().equals("Drone Bee")){
            return ("Dead");
        }
        if(bee.getRemainHP()<70 && bee.getBeeType().equals("Worker Bee")){
            return ("Dead");
        }
        else {
            return ("Alive");
        }
    }
}
