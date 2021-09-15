# Access Modifiers

As the name suggests access modifiers in Java helps to restrict the scope of a class, constructor, variable, method, or data member. There are four types of access modifiers available in java: 
1. Default – No keyword required
2. Private
3. Protected
4. Public

### Limits:
![Object Oriented Programming (OOP)](../img/Access-Modifiers-in-Java.png)

* **Default**: When no access modifier is specified for a class, method, or data member – It is said to be having the **default** access modifier by default. 
   * The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier are accessible **only within the same package**.

In this example, we will create two packages and the classes in the packages will be having the default access modifiers and we will try to access a class from one package from a class of the second package.

#### Example (Package 1):
```java
package p1; 
  
class A 
{ 
    void display()                              // DEFAULT ACCESS MODIFIER
    { 
        System.out.println(
            "The message from Class A, "     +
            "Package - p1. (DEFAULT MODIFIER)."
        ); 
    } 
} 
```

#### Example (Package 2):
```java
package p2;

import p1.*;                                    // import all classes from p1 

class B 
{ 
    public static void main(String... args) 
    { 

        A obj = new A();                        // ERROR: Compile time error
        obj.display(); 
    } 
} 
```

* **Private**: The private access modifier is specified using the keyword **private**. 
   * The methods or data members declared as private are accessible only within the class in which they are declared.
   * Any other **class of** the **same package won't be able to access** these members.
   * Top-level classes or interfaces can not be declared as private because
      1. *private* means *"only visible within the enclosing class"*.
      2. *protected* means *"only visible within the enclosing class and any subclasses"*

Hence these modifiers in terms of application to classes, apply only to nested classes and not on top-level classes.
<br/>
In this example, we will create two classes A and B within the same package p1. We will declare a method in class A as private and try to access this method from class B and see the result.

#### Example:
```java
package p1; 
  
class A 
{ 
    private void display() 
    { 
        System.out.println(
            "The message from Class A, "     +
            "Package - p1. (PRIVAT MODIFIER)."
        ); 
    } 
} 
  
class B 
{ 
    public static void main(String... args) 
    { 
        A obj = new A(); 
        obj.display();                          // ERROR: display() has private access in A
    } 
} 
```

* **protected**: The protected access modifier is specified using the keyword **protected**.
    * The methods or data members declared as protected are **accessible within the same package or subclasses in different packages**

In this example, we will create two packages p1 and p2. Class A in p1 is made public, to access it in p2. The method display in class A is protected and class B is inherited from class A and this protected method is then accessed by creating an object of class B.

#### Example:
```java
package p1; 
  
public class A 
{ 
    protected void display() 
    { 
        System.out.println(
            "The message from Class A, "        +
            "Package - p1. (PROTECTED MODIFIER)."
        ); 
    } 
} 
```

#### Example:
```java
package p2;

import p1.*;                                    // import all classes from p1

class B extends A                               // Class B is subclass of A 
{ 
    public static void main(String... args) 
    { 
        B obj = new B(); 
        obj.display();                          // Output: The message from Class A,
                                                //         Package - p1. (PROTECTED MODIFIER).
    } 
} 
```

* **public**: The public access modifier is specified using the keyword **public**.
   * The public access modifier has the **widest scope** among all other access modifiers.
   * Classes, methods, or data members that are declared as public are **accessible from everywhere** in the program. There is no restriction on the scope of public data members.

#### Example:
```java
package p1;

public class A 
{ 
    public void display() 
    { 
        System.out.println(
            "The message from Class A, "        +
            "Package - p1. (PUBLIC MODIFIER)."
        );
    } 
}
```

#### Example:
```java
package p2;

import p1.*;                                    // import all classes from p1

class B
{
    public static void main(String... args)
    {
        A obj = new A;
        obj.display();                          // Output: The message from Class A,
                                                //         Package - p1. (PUBLIC MODIFIER).
    }
}
```

## **Important Points**:
* If other programmers use your class, try to use the most restrictive access level that makes sense for a particular member. Use private unless you have a good reason not to.
* Avoid public fields except for constants.
---