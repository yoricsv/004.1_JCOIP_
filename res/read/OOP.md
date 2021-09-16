# Object Oriented Programming (OOP)

As the name suggests, Object-Oriented Programming or OOPs refers to languages that uses objects in programming. Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc in programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function. 

Let us do discuss pre-requisite by polishing concepts of methods declaration and passing. Starting off with the method declaration, it consists of six components:

* [**Access Modifier**][1]: Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
   * **public**: accessible in all class in your application.
   * **protected**: accessible within the package in which it is defined and in its **subclass(es) (including subclasses declared outside the package)**
   * **private**: accessible only within the class in which it is defined.
   * **default** *(declared/defined without using any modifier)*: accessible within same class and package within which its class is defined.
* **The return type**: The data type of the value returned by the method or void if does not return a value.
* **Method Name**: the rules for field names apply to method names as well, but the convention is a little different.
* **Parameter list**: Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().
* **Exception list**: The exceptions you expect by the method can throw, you can specify these exception(s).
* **Method body**: it is enclosed between braces. The code you need to be executed to perform your intended operations.
[**Message Passing**][2]: Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent.

### OOPs Concepts are as follows: 
1. [Class][3]
2. [Object][4] 
3. [Method][5]
4. OOP Pivots:
   * [Abstraction][6]
   * [Encapsulation][7]
   * [Inheritance][8]
   * [Polymorphism][9]

![OOP Concepts](../img/Object-Oriented-Programming-Concepts.jpg)

A [Class][3] is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order: 

1. **Modifiers**: A class can be public or has default access (Refer [this][10] for details).
2. **Class name**: The name should begin with a initial letter (capitalized by convention).
3. **Superclass(if any)**: The name of the class’s parent (*superclass*), if any, preceded by the keyword extends. A class can only extend (*subclass*) one parent.
4. **Interfaces(if any)**: A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
5. **Body**: The class body surrounded by braces, *{ }*.

[**Object**][4] is a basic unit of Object Oriented Programming and represents the real life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of: 

1. **State**: It is represented by attributes of an object. It also reflects the properties of an object.
2. **Behavior**: It is represented by methods of an object. It also reflects the response of an object with other objects.
3. **Identity**: It gives a unique name to an object and enables one object to interact with other objects.
4. [**Method**][5]: A method is a collection of statements that perform some specific task and return result to the caller. A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping the code. In Java, every method must be part of some class which is different from languages like C, C++ and Python. 
Methods are time savers and help us to reuse the code without retyping the code.

## OOP Pivots
### [**Abstraction**][6]
Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
<br/>
Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviours of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
<br/>
Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is.
<br/> 
In java, abstraction is achieved by [interfaces][11] and [abstract classes][12]. We can achieve 100% abstraction using interfaces.

### [**Encapsulation**][7]
It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.
* Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
* As in encapsulation, the data in a class is hidden from other classes, so it is also known as **data-hiding**.
* Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

### [**interfaces**][11]
Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class. 

Let us discuss some of frequent used important terminologies:
**Super Class**: The class whose features are inherited is known as superclass(or a base class or a parent class).
**Sub Class**: The class that inherits the other class is known as subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
**Reusability**: Inheritance supports the concept of *"reusability"*, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

### [**Polymorphism**][9]
It refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently. This is done by Java with the help of the signature and declaration of these entities. 

> ***Note**: Polymorphism in Java are mainly of 2 types:*
> 1. [*Overloading*][13]
> 2. [*Overriding*][14]

The example below demonstrate how the class contains 3 methods with the same name but the program will compile and run successfully.

#### Example:
```java
public class MathSum
{
    public static void main(String... args)
    {
        Sum s = new Sum();

        System.out.println(
                s.sum(-65, -10)                 // Output: -75
        );
        System.out.println(
                s.sum(3.75, -2.35)              // Output: 1.4
        );
        System.out.println(
                s.sum(-54, 19, -5)              // Output: -40
        );
    }

    private static class Sum                    // OVERLOADING sum()
    {
        public    int sum(int x, int y)         // gets TWO INT parameters
        {
            return (x + y);
        }

        public double sum(double x, double y)   // gets TWO DOUBLE parameters
        {
            return (x + y);
        }

        public    int sum(int x, int y, int z)  // gets THREE INT parameters
        {
            return (x + y + z);
        }
    }
}

```
---

<!--  

FILE:  OOP.md
* [Access Modifier][1]   ->  Done!
* [Message Passing][2]   ->  Done! TODO: Discribe Queue
* [Class][3]             ->  Done!
* [Object][4] 
* [Method][5]
* [Abstraction][6]
* [Encapsulation][7]
* [Inheritance][8]
* [Polymorphism][9]
* [this][10]             ->  Done!
* [interfaces][11]
* [abstract classes][12]
* [Overloading][13]
* [Overriding][14]
-->

[1]: AccessModifier.md
[2]: MethodPassing.md
[3]: Class.md
[4]: Object.md
[5]: Method.md
[6]: Abstraction.md
[7]: Encapsulation.md
[8]: Inheritance.md
[9]: Polymorphism.md
[10]: This.md
[11]: Interface.md
[12]: AbstractClass.md
[13]: Overloading.md
[14]: Overriding.md