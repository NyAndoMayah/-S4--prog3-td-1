package com.example.demo.Dependances;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ConcreteDependence2 {
  private final String variable2 = "Goodbye !!!";
}
