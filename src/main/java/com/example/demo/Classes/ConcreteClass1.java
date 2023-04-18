package com.example.demo.Classes;

import com.example.demo.AbstractClass1;
import com.example.demo.Dependances.ConcreteDependence1;
import com.example.demo.Dependances.ConcreteDependence2;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass1 {
  public ConcreteClass1(ConcreteDependence1 concreteDependence1, ConcreteDependence2 concreteDependence2) {
    super(concreteDependence1, concreteDependence2);
  }
  @Override
  public String say() {
      return getConcreteDependence1().getVariable1();
  }
}
