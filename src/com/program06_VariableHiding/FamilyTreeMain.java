package com.program06_VariableHiding;

public class FamilyTreeMain {
  public static void main(String[] args) {
    //
    Child child = new Child();
    child.name = "Aloona";
    child.doIt();
    System.out.println(child.name);

    System.out.println();

    Parent parent = child;              // <-- try to casting Child object to Parent [POLYMORPHISM]
    parent.doIt();                      // ACCESSED METHOD OVERRIDE (METHOD IN OBJECT)
    System.out.println(parent.name);    // ACCESSED VARIABLE/FIELD IN PARENT CLASS
  }
}
