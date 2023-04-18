package com.example.demo.Dependances;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ConcreteDependence1 {
  private final String variable1 = "Hello from here !!!";

  public String getVariable1() {
    return variable1;
  }
}
