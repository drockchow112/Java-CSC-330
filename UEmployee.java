public class UEmployee
{
    private String name;
    private double salary;

    UEmployee() {

    }

    /**
     *
     * @param name String
     * @param salary double
     */
    UEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    /**
     *
     * @return name getter
     */
    public String getName()
    {
        return name;
    }
    /**
     *
     * @return salary getter
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     *
     * @return String rep. of University Employee member.
     */
    public String toString() {
        return "University Employee Name: " + getName() + "\nSalary: " + getSalary();
     }
}

