# <p align=center><b>Private Constructors and Singleton Classes in Java</b></p>

As you can easily guess, like any method we can provide access specifier to the constructor. If it’s made private, then it can only be accessed inside the class.

There are various scenarios where we can use private constructors. The major ones are
1. Internal Constructor chaining
2. Singleton class design pattern

## Enum constructor as an example of an Internal Constructor
* enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
* We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
<br/>

**Parameterizing a constructor for an enum class:**
1. To create enum with the own values we have to create parameterized constructor for this enum class. Why? Because as we know that enum class’s object can’t be create explicitly so for initializing we use parameterized constructor. However, the **constructor** can't be the public or protected it **must have private or default modifiers**. *(In case, creation public or protected, it will allow initializing more than one objects. This is totally against enum concept.)*
2. We have to create one getter method to get the value of enums.

#### Example:
```java
enum TrafficSignal
{
    RED     ("STOP"),                                   // Assigning via the ENUM CONSTRUCTOR
    ORANGE  ("WAIT"),
    GREEN   ("GO"); 

    private String action;                              // PRIVATE VARIABLE FOR PASSING VALUE
 
/*
    *************************************************************
    * REQUIREMENTS FOR THE ENUM CONCTRUCTOR:                    *
    *                                                           *
    *   - The constructor ALWAYS have to be PRIVATE!!!          *
    *   - The constructor called SEPARATELY for each constant   *
    *************************************************************
*/

    private TrafficSignal(String action)                // PRIVATE ENUM CONSTRUCTOR
    {
        this.action = action;
    }

    public String getAction()                           // GETTER
    {
        return this.action;
    }
}

public class EnumConstructor
{
    public static void main(String... args)
    {
        TrafficSignal[] signals = TrafficSignal.values();
  
        for (TrafficSignal signal : signals)
        {
            System.out.println(                         // Output: Signal is: RED, action is: STOP
                "Signal is: "    + signal.name()      + // Output: Signal is: ORANGE, action is: WAIT
                ", action is : " + signal.getAction()   // Output: Signal is: GREEN, action is: GO
            );
        }
    }
}
```

## Singleton
As the name implies, a class is said to be singleton if it limits the number of objects of that class to one.<br/>
We **can’t have more than a single object** for such classes.<br/>
Singleton classes are employed extensively in *concepts like Networking and Database Connectivity*.

## Design Pattern of Singleton classes:
The **constructor of singleton** class would be **private** so there *must be another way to get the instance* of that class. This problem is resolved **using a class member instance** and a **factory method to return the class member**.

#### Example:
```java
class MySingleton
{
    static MySingleton instance = null;                 // IMPORTANT!!!
    public int x = 10;
    
    private MySingleton() {  }                          // PRIVATE CONSTRUCTOR

    static public MySingleton getInstance()             // FACTORY METHOD (can provide the instance)
    {
        if (instance == null)        
             instance = new MySingleton();
   
        return instance;
    } 
}

class Main
{
   public static void main(String... args)    
   {
       MySingleton a = MySingleton.getInstance();       // GET SINGLETON INSTANCE
       MySingleton b = MySingleton.getInstance();       // get a pointer to the first instance
       a.x = a.x + 10;
       System.out.println("Value of a.x = " + a.x);     // Output: 20
       System.out.println("Value of b.x = " + b.x);     // Output: 20
   }    
}
```

We changed value of a.x, value of b.x also got updated because both **"a"** and **"b"** refer to same object, i.e., they are objects of a singleton class.

---