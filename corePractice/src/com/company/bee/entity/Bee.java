package com.company.bee.entity;

import com.company.bee.constant.Constant;

public class Bee extends Constant {
    private String beeType;
    private int remainHP;
    public int damage ;
    public Bee(){

    }
    public Bee(String beeType){
        this.beeType = beeType;
    }
    public String getBeeType() {
        return beeType;
    }
    public int getRemainHP() {
        return this.remainHP;
    }
    public void setRemainHP(int damage) {
        this.remainHP = fullHP-damage;
    }
}



