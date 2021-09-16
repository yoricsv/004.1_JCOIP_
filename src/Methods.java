//class Methods
//{
//    public int addTwoNumbers(int a, int b)
//    {
//         return a + b;
//    }
//}
//
//class Applying
//{
//    public static void main (String... args)
//    {
//        Methods add = new Methods();              // addition instance
//
//        int s = add.addTwoNumbers(-25,5);   // calling method to get the sum
//
//        System.out.println(
//                "Total: " + s
//        );
//   }
//}

class Test
{
    public static int i = 0;

    Test()                                      // constructor counts the number of the objects
    {
        i++;
    }

    public static int get()                     // STATIC gives access to the total number of created objects
    {
        // ... some statement(s) if any...
        return i;
    }

                                                // Instance calling object directly (created inside another class)
                                                // Can called by an object created in another method of the same class
    public int m1()
    {
        System.out.println(
                "m1() called via the object of another class"
        );

        this.m2();                              // calling m2() within the same class.

        // ... some statement(s) if any...

        return 1;                               // statements to be executed if any
    }

    public void m2()                            // Void - doesn't return anything
    {
        System.out.println(
                "m2() came from method m1"
        );
    }
}

class Applying
{
    public static void main(String... args)
    {
        Test obj = new Test();                  // Creating an instance

        int i = obj.m1();                       // Calling m1() by the object created in above

        System.out.println(
                "Control returned after m1(): " + i
        );

        int noOfObjects = Test.get();           // Call m2() method obj.m2();

        System.out.print(
                "No one instances created till now: " +
                 noOfObjects
        );
    }
}