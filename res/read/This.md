# Access specifiers for classes or interfaces in Java

In Java, methods and data members of a class/interface can have one of the following four access specifiers. The access specifiers are listed according to their restrictiveness order.

1. *private* (accessible within the class where defined)
1. *default* or *package private* (when no access specifier is specified)
1. *protected*
1. *public* (accessible from any class)

But, the classes and interfaces themselves can have only two access specifiers when declared outside any other class.
1. public
1. default (when no access specifier is specified)

We cannot declare class/interface with private or protected access specifiers. For example, following program fails in compilation.

#### Example:
```java
protected class Test
{
    ... statement(s) ...
}
  
public class Main
{
    public static void main(String... args)
    {
    
    }
}
```

> *Note:* Nested interfaces and classes can have all access specifiers.
---
