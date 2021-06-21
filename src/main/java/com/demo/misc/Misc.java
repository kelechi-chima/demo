package com.demo.misc;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class Misc {
    
    public static void main(String[] args) throws Exception {
        //questionOne();
        //questionTwo();
        //questionThree();
        //questionFour();
        //questionFive();
        //questionSix();
        //questionSeven();
    }
    
    private static void questionOne() {
        String result = "";
        for (int i = 0; i < 10_000; i++) {
            result += i;
        }
        System.out.println(result);
    }
    
    private static void questionTwo() {
        Long sum = 0L;
        for (long i = 0; i < 10_000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    
    private static void questionThree() throws IOException {
        Path tempFile = Files.createTempFile("demo", "txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(tempFile.toFile());
            writer.write("Line 1" + System.lineSeparator());
            writer.write("Line 2");
            writer.flush();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
    
    private static void questionFour() {
        Map<Customer, Account> accounts = new HashMap<>();
        accounts.put(new Customer("Joe", "Bloggs"), new Account("100000", 1.05));
        
        Account account = accounts.get(new Customer("Joe", "Bloggs"));
        System.out.println(account);
        
        double balance = account.getBalance();
        balance -= 0.42;
        account.setBalance(balance);
        System.out.println(account.getBalance());
    }
    
    private static void questionFive() {
        SortedSet<Customer> customers = new TreeSet<>();
        customers.add(new Customer("Victoria", "Gotti"));
        customers.add(new Customer("John", "Barnes"));
        customers.add(new Customer("Rajeev", "Sasid"));
        customers.add(new Customer("Miriam", "Makeba"));
        customers.add(new Customer("Freddie", "Flintoff"));
        customers.add(new Customer("Esther", "Tester"));
        
        for (final Customer customer : customers) {
            System.out.println(customer);
        }
    }
    
    private static void questionSix() throws InterruptedException {
        Runnable task = new LongRunningTask();
        Thread thread = new Thread(task);
        thread.start();
        
        // Replace thread with Executor service
    }
    
    private static void questionSeven() {
        // Events shoud be immutable
        Event event = new Event(new Date(), "Payload");
        Date anotherDate = Date.from(LocalDate.now().plusDays(4).atStartOfDay(ZoneId.systemDefault()).toInstant());
        event.setDate(anotherDate);
    }
}
