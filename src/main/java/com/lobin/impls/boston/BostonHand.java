package com.lobin.impls.boston;

import com.lobin.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component("bostonHand")
public class BostonHand implements Hand {
    public void push() {
        System.out.println("Push as Boston");
    }
}
