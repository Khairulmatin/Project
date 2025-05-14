class BankCustomer{
    String name;
    int accountNumber;
    int customer_age;

    BankCustomer(String name, int accountNumber, int customer_age){
        this.name = name;
        this.accountNumber=accountNumber;
        this.customer_age=customer_age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("account number:"+accountNumber);
        System.out.println("customer age:"+customer_age);
    }
}

public class main{
    public static void Main (String [] args) {
        BankCustomer customer1 = new BankCustomer("John", 12345, 25);
        customer1.display();
    }
}