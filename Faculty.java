//Derrick Chow CSC 330
public class Faculty extends UEmployee
{


    private String deptName;

    /**
     *
     * @param name String
     * @param salary double
     * @param deptName String
     */
    Faculty(String name, double salary, String deptName) {
        super(name,salary);
        this.deptName = deptName;
    }

    /**
     *
     * @return String getter
     */
    public String getDeptName()
    {
        return deptName;
    }

    /**
     *
     * @return String representation of Faculty member
     */
    public String toString() {
        return "Name of Faculty Member: " + getName() + "\nSalary: " + getSalary()
            + "\nDepartment Name: " + getDeptName();
    }

}
