public class Person
{
    // Private Instance Members (Data Fields)
    String m_name;
    int m_age;

    // Getters and Setters

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int age)
    {
        m_age = age;
    }

    // Constructor
    public Person(String name, int age)
    {
        m_name = name;
        m_age = age;
    }

    // Public Methods
    public void saysHello()
    {
        System.out.println(getName() + " says Hello!");
    }

    // Private Methods

    // Overridden Methods
    @Override
    public String toString()
    {
        return "Person ( Name: " + getName() + ", Age: " + getAge() + " )";
    }
}
