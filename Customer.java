//Derrick Chow CSC 330
public class Customer extends Person
{
    private int customerNumber;
    private boolean isOnMailingList;

    Customer()
    {

    }
    /**
     *
     * @param name String
     * @param address String
     * @param phoneNumber String
     * @param customerNumber int
     * @param isOnMailingList bool
     */
    Customer(String name,String address,String phoneNumber,int customerNumber,boolean isOnMailingList)
    {
        super(name,address,phoneNumber);
        this.customerNumber=customerNumber;
        this.isOnMailingList=isOnMailingList;
    }

    /**
     *
     * @return int getter
     */
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    /**
     *
     * @param customerNumber int setter
     */
    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber=customerNumber;
    }
    /**
     *
     * @return bool getter
     */
    public boolean getIsOnMailingList()
    {
        return isOnMailingList;
    }
    /**
     *
     * @param onMailingList bool setter
     */
    public void setOnMailingList(boolean onMailingList)
    {
        isOnMailingList=onMailingList;
    }

    /**
     *
     * @return String returns string representation of Customer
     */
    public String toString()
    {
        return
            "Customer name: " + getName() +
            "\nCustomer address: " + getAddress() +
            "\nCustomer phone number: " + getPhoneNumber() +
            "\nCustomer Number: "+getCustomerNumber()+
            "\nOn the mailing list: "+ getIsOnMailingList();

    }
}
