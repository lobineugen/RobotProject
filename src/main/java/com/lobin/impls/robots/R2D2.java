package com.lobin.impls.robots;

import com.lobin.interfaces.Hand;
import com.lobin.interfaces.Head;
import com.lobin.interfaces.Leg;
import com.lobin.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("r2d2")
public class R2D2 implements Robot{
    @Autowired
    @Qualifier("bostonHand")
    private Hand hand;
    @Autowired
    @Qualifier("bostonHead")
    private Head head;
    @Autowired
    @Qualifier("bostonLeg")
    private Leg leg;
    @Value("red")
    private String color;
    @Value("2")
    private int memory;

//    public R2D2(Hand hand, Head head) {
//        this.hand = hand;
//        this.head = head;
//    }
//
//    public R2D2(String color, int memory) {
//        this.color = color;
//        this.memory = memory;
//    }
//
//    public R2D2(Hand hand, Head head, Leg leg, String color, int memory) {
//        this.hand = hand;
//        this.head = head;
//        this.leg = leg;
//        this.color = color;
//        this.memory = memory;
//    }
//
//    public R2D2() {
//    }
//
//    public Hand getHand() {
//        return hand;
//    }
//
//    public void setHand(Hand hand) {
//        this.hand = hand;
//    }
//
//    public Head getHead() {
//        return head;
//    }
//
//    public void setHead(Head head) {
//        this.head = head;
//    }
//
//    public Leg getLeg() {
//        return leg;
//    }
//
//    public void setLeg(Leg leg) {
//        this.leg = leg;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getMemory() {
//        return memory;
//    }
//
//    public void setMemory(int memory) {
//        this.memory = memory;
//    }

    public void action() {
        head.think();
        hand.push();
        leg.move();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "R2D2{" +
                "hand=" + hand +
                ", head=" + head +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                '}';
    }


}
