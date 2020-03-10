//Derrick Chow CSC 330
public class Staff extends UEmployee
{
    private String jobTitle;

    /**
     *
     * @param name String
     * @param salary double
     * @param jobTitle String
     */
    Staff(String name, double salary, String jobTitle) {
        super(name,salary);
        this.jobTitle = jobTitle;
    }

    /**
     *
     * @return String getter
     */
    public String getJobTitle()
    {
        return jobTitle;
    }

    /**
     *
     * @return String rep. of Staff member
     */
    public String toString() {
        return "Name of Staff Member: " + getName() + "\nSalary: " + getSalary()
            + "\nJob Title: " + getJobTitle();
    }
}
