package com.mozart.codinglikemozart.classPackage;

import com.mozart.codinglikemozart.dependance.ConcreteDependance1;
import com.mozart.codinglikemozart.dependance.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
public class AbstractClass1 {
    public ConcreteDependance1 concreteDependance1;
    public ConcreteDependance2 concreteDependance2;
}
