public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account("12345", 500,
//                "Bob Brown", "myemail@bob.com",
//                "(087) 123-4567");
        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

//        bobsaccount.setAccountNumber("12345");
//        bobsaccount.setAccountBalance(1000.00);
//        bobsaccount.setCustomerName("Bob Lang");
//        bobsaccount.setEmail("bob@gmail.com");
//        bobsaccount.setPhoneNumber("+6512345678");


        bobsAccount.withdrawFund(99.76);
        bobsAccount.depositFund(200.0);

        Account timsAccount = new Account("Tim",
                "tim@gmail.com", "12345");
        System.out.println("Account No: " + timsAccount.getAccountNumber() +
                "; name: " + timsAccount.getCustomerName());
    }
}
