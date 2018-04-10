package com.lobin.impls.boston;

import com.lobin.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component("bostonLeg")
public class BostonLeg implements Leg {
    public void move() {
        System.out.println("Move as Boston");
    }
}
