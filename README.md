# -S4--prog3-td-1
##Subject
At one point in the course, I tried to put in an abstract class SavableAccountRepository, but I changed my mind because the dependency injection in concrete classes might be magic for you. In this question, you will solve that.

Create a Spring Boot project from scratch. Create the following classes:
* ConcreteDependence1 and ConcreteDependence2: 2 concrete classes
* AbstractClass1: abstract class which has 2 attributes of type ConcreteDependance1 and ConcreteDependance2.
* ConcreteClass1 which is a concretization of AbstractClass1
* ConcreteClass2 which is another concretization of AbstractClass1

All these classes are @Component, and their instantiation should be done by Spring during its @ComponentScan.

In particular, make sure that ConcreteClassX have access to ConcreteDependencyX (i.e. make sure to use the right level of visibility for the attributes in AbstractClassX)

Translated with www.DeepL.com/Translator (free version)
