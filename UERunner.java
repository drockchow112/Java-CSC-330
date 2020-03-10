public class UERunner
{
   public static void main(String[] args) {
       UEmployee employee = new UEmployee("Jennifer Hale", 57000);
       Faculty facEmployee = new Faculty("John Elms",120000, "Mathematics");
       Staff staffEmployee = new Staff("Issac Jones", 900000,"HR Director");

       System.out.println(employee);
       System.out.print("\n");
       System.out.println(facEmployee);
       System.out.print("\n");
       System.out.println(staffEmployee);
       System.out.print("\n");


       Customer firstCustomer= new Customer("Derrick Johnson","34 Johnson Place","718-456-6543",23,true);

       System.out.println(firstCustomer);

       PreferredCustomer preferredCustomer = new PreferredCustomer("John Doe","34 Myamon Place", "345-567-8765", 24, false, 789);
       System.out.print("\n");

       System.out.println(preferredCustomer);

       preferredCustomer.makePurchase(500);
       System.out.print("\n");

       System.out.println(preferredCustomer);
   }




}
