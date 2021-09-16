public class Classes
{
    public static void main(String... args)
    {
        Sum s = new Sum();

        System.out.println(
                s.sum(-65, -10)                   // Output: 30
        );
        System.out.println(
                s.sum(3.75, -2.35)              // Output: 1.40
        );
        System.out.println(
                s.sum(-54, 19, -5)             // Output: 30
        );
    }


}

class Sum
{
    public    int sum(int x, int y)            // Overloaded sum(). This sum takes two int parameters
    {
        return (x + y);
    }

    public double sum(double x, double y)   // Overloaded sum(). This sum takes two double parameters
    {
        return (x + y);
    }

    public    int sum(int x, int y, int z)     // Overloaded sum(). This sum takes three int parameters
    {
        return (x + y + z);
    }
}