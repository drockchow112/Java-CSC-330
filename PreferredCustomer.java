//Derrick Chow CSC 330
public class PreferredCustomer extends Customer
{
    private double amountOfPurchases;
    private double discountLevel;

    /**
     *
     * @return double getter
     */
    public double getAmountOfPurchases()
    {
        return amountOfPurchases;
    }

    /**
     *
     * @param amountOfPurchases double setter
     */
    public void setAmountOfPurchases(double amountOfPurchases)
    {
        this.amountOfPurchases=amountOfPurchases;
    }

    /**
     *
     * @return double getter
     */
    public double getDiscountLevel()
    {
        return discountLevel;
    }

    /**
     *
     * @param discountLevel double setter
     */
    public void setDiscountLevel(double discountLevel)
    {
        this.discountLevel=discountLevel;
    }

    /**
     *
     * @param name String
     * @param address String
     * @param phoneNumber String
     * @param customerNumber int
     * @param isOnMailingList bool
     * @param amountOfPurchases int
     */
    PreferredCustomer(String name,String address,String phoneNumber,
                      int customerNumber,boolean isOnMailingList,
                      int amountOfPurchases)
    {
        super(name,address,phoneNumber,customerNumber,isOnMailingList);
        this.amountOfPurchases=amountOfPurchases;

        //Basically set the discount level if it is between a range of numbers.
        //Else, you get no discount (set it == 0)
        if(this.amountOfPurchases >= 500&&this.amountOfPurchases<1000)
        {
            this.discountLevel=.05;
        }
        else if(this.amountOfPurchases >= 1000&&this.amountOfPurchases<1500)
        {
            this.discountLevel=.06;
        }
        else if(this.amountOfPurchases >= 1500&&this.amountOfPurchases<2000)
        {
            this.discountLevel=.07;
        }
        else if(this.amountOfPurchases >= 2000)
        {
            this.discountLevel=.10;
        } else {
            this.discountLevel = 0;
        }
    }

    /**
     *
     * @return String rep. of Preferred Customer
     */
    public String toString()
    {
        return
            "Preferred Customer name: " + getName() +
                "\nPreferred Customer address: " + getAddress() +
                "\nPreferred Customer phone number: " + getPhoneNumber() +
                "\nPreferred Customer Number: "+getCustomerNumber()+
                "\nOn the mailing list: "+ getIsOnMailingList() +
                "\nAmount of Purchases: " + getAmountOfPurchases() +
                "\nDiscount Level: " + getDiscountLevel();


    }

    /**
     *
     * @param value If customer makes a purchase, update the value.
     */
    public void makePurchase(double value) {

        this.amountOfPurchases += value;
        //Basically set the discount level if it is between a range of numbers.
        //Else, you get no discount (set it == 0)
        if(this.amountOfPurchases >= 500&&this.amountOfPurchases<1000)
        {
            this.discountLevel=.05;
        }
        else if(this.amountOfPurchases >= 1000&&this.amountOfPurchases<1500)
        {
            this.discountLevel=.06;
        }
        else if(this.amountOfPurchases >= 1500&&this.amountOfPurchases<2000)
        {
            this.discountLevel=.07;
        }
        else if(this.amountOfPurchases >= 2000)
        {
            this.discountLevel=.10;
        } else {
            this.discountLevel = 0;
        }
    }



}
