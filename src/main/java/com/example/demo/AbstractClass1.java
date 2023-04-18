package com.example.demo;
import com.example.demo.Dependances.ConcreteDependence1;
import com.example.demo.Dependances.ConcreteDependence2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public abstract class AbstractClass1 {

  private final ConcreteDependence1 concreteDependence1;

  private final ConcreteDependence2 concreteDependence2;

  public abstract String say();
}
