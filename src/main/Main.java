package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Grade gr = new Grade();
            Account ac = new Account();
            Product pr = new Product();
            
            String transaction;
            
            System.out.println("Product CRUD System\n");
            
            do {
                System.out.println("1. Grade");
                System.out.println("2. Account");
                System.out.println("3. Product");
                System.out.println("Enter selection: ");
                
                int select = sc.nextInt();
                
                switch(select) {
                    case 1:
                        gr.getGrade();
                        break;
                    case 2:
                        ac.getAccounts();
                        break;
                    case 3:
                        pr.getPoroduct();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.print("Make another transaction? (y/n): ");
                transaction = sc.next();
            } while(transaction.equalsIgnoreCase("y"));
        }
    }

    private static class Grade {

        public Grade() {
        }

        private void getGrade() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    private static class Account {

        public Account() {
        }

        private void getAccounts() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }

    private static class Product {

        public Product() {
        }

        private void getPoroduct() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}