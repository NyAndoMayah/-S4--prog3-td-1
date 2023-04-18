package com.example.demo.Classes;
import com.example.demo.AbstractClass1;
import com.example.demo.Dependances.ConcreteDependence1;
import com.example.demo.Dependances.ConcreteDependence2;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1 {
  public ConcreteClass2(ConcreteDependence1 concreteDependence1, ConcreteDependence2 concreteDependence2) {
    super(concreteDependence1, concreteDependence2);
  }

  @Override
  public String say() {
    return getConcreteDependence2().getVariable2();
  }
}
