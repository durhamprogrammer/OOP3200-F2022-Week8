import java.util.Scanner;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        Vector<Person> people = new Vector<Person>(); // create an empty container
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            var person = new Person();

            try {
                System.out.print("Enter Name: ");
                person.setName(scanner.next());
                System.out.print("Enter Age: ");
                person.setAge(scanner.nextInt());
                System.out.println();

                people.add(person);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

        for (var person : people)
        {
            System.out.println(person);
        }
    }
}