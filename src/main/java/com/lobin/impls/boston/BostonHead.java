package com.lobin.impls.boston;

import com.lobin.interfaces.Head;
import org.springframework.stereotype.Component;

@Component("bostonHead")
public class BostonHead implements Head {
    public void think() {
        System.out.println("Think as Boston");
    }
}
