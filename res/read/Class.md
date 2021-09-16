# Classes in Java

## <p align=center><b>Class</b></p>
A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:
1. **Modifiers**: A class can be public or has default access (*Refer [this][1] for details*).
2. **class keyword**: class keyword is used to create a class.
3. **Class name**: The name should begin with an initial letter (*capitalized by convention*).
4. **Superclass(if any)**: The name of the class’s parent (*superclass*), if any, preceded by the keyword extends. A class can only extend (*subclass*) one parent.
5. **Interfaces(if any)**: A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
6. **Body**: The class body surrounded by braces, *{ }*.

Constructors are used for initializing new objects. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.
There are various types of classes that are used in real time applications such as [nested classes][2], [anonymous classes][3], [lambda expressions][4]. 

---

<!--
* [this][1]                             ->  Done!
* [nested classes][2]
* [anonymous classes][3]
* [lambda expressions][4]
-->

[1]: This.md
[2]: NestedClass.md
[3]: AnnonymousClass.md
[4]: LambdaExpression.md