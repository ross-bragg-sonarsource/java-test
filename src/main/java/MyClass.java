public class MyClass {
  // ...

  public Object clone() { // Noncompliant
    //...

    return new Object();
  }
}
