import java.util.*;

class Main1 {
    String id, sender, receiver, status, date;
    double amount;

    Main1(String i, String s, String r, double a, String st, String d) {
        id = i; sender = s; receiver = r; amount = a; status = st; date = d;
    }

    public String toString() {
        return id + " | " + sender + " -> " + receiver + " | " + amount + " | " + status + " | " + date;
    }
}

public class Transaction{
    public static void main(String[] args) {
        List<Main1> transactions = new ArrayList<>();
        transactions.add(new Main1("TXN001", "Alice", "Bob", 100.5, "Success", "14-05-2025"));
        transactions.add(new Main1("TXN002", "Charlie", "Dana", 250.0, "Failed", "13-05-2025"));

        for (Main1 t : transactions)
            System.out.println(t);
    }
}