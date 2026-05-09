package oops.Encapsulation;
public class Main {
    public static void main(String[] args) {
        
        Logic s1= new Logic();
        //seter to set values;
        s1.setAmounts(4000L);
        s1.setName("Sarvan Maurya");
        s1.setCredit(40000);
        s1.setDebit(30000);


        // geter toget there values;
        System.out.println("Amount: " + s1.getAmounts());
        System.out.println("Name: " + s1.getName());
        System.out.println("Credit: " + s1.getCredit());
        System.out.println("Debit: " + s1.getDebit());
    }
}
