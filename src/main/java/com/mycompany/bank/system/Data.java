/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author RUMMON
 */
enum branches {
    Dhaka,
    Chittagong,
    Shylet,
    Khulna,
    Rajshahi,
    Dinajpur
}

class manager {

    String branch, name, password;
}

class user {

    String name, accId, password, balance, phone, branch, address, loan, cloan, reason;
}

class business {

    String comname, comaccid, password, balance, phone, branch, address, loan, cloan, reason;
}

class cashier {

    String name, branch, counter, password, transferred;

}

public class Data {

    static LinkedList<manager> managers = new LinkedList<>();
    static LinkedList<user> users = new LinkedList<>();
    static LinkedList<business> businesses = new LinkedList<>();
    static LinkedList<cashier> cashiers = new LinkedList<>();

    static String newAccId, newBusId;  //for giving account id after creating user account

    //take data from file to array
    static void fillManager() {
        System.out.println("filling manager data");
        managers.clear();
        try {
            File myObj = new File("manager.txt");
            try (Scanner fileManager = new Scanner(myObj)) {
                while (fileManager.hasNextLine()) {
                    String curLine = fileManager.nextLine();
                    String[] splitted = curLine.split(",");
                    manager nmanager = new manager();
                    nmanager.branch = splitted[0].trim();
                    nmanager.name = splitted[1].trim();
                    nmanager.password = splitted[2].trim();
                    managers.add(nmanager);
                }
                fileManager.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }

    static void fillCashier() {
        System.out.println("filling cashier data");
        cashiers.clear();
        try {
            File myObj = new File("cashier.txt");
            try (Scanner fileManager = new Scanner(myObj)) {
                while (fileManager.hasNextLine()) {
                    String curLine = fileManager.nextLine();
                    String[] splitted = curLine.split(",");
                    cashier nuser = new cashier();
                    nuser.name = splitted[0].trim();
                    nuser.branch = splitted[1].trim();
                    nuser.counter = splitted[2].trim();
                    nuser.password = splitted[3].trim();
                    nuser.transferred = splitted[4].trim();
                    cashiers.add(nuser);
                }
                fileManager.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }

    //take data from file to array
    static void fillUser() {
        System.out.println("filling user data");
        users.clear();
        try {
            File myObj = new File("user.txt");
            try (Scanner fileManager = new Scanner(myObj)) {
                while (fileManager.hasNextLine()) {
                    String curLine = fileManager.nextLine();
                    String[] splitted = curLine.split("\\|");
                    user nuser = new user();
                    nuser.name = splitted[0].trim();
                    nuser.accId = splitted[1].trim();
                    nuser.password = splitted[2].trim();
                    nuser.balance = splitted[3].trim();
                    nuser.phone = splitted[4].trim();
                    nuser.branch = splitted[5].trim();
                    nuser.address = splitted[6].trim();
                    nuser.loan = splitted[7].trim();
                    nuser.cloan = splitted[8].trim();
                    nuser.reason = splitted[9].trim();
                    users.add(nuser);
                    newAccId = splitted[1].trim();
                }
                fileManager.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }

    //take data from file to array
    static void fillBusiness() {
        System.out.println("filling bussiness data");
        businesses.clear();
        try {
            File myObj = new File("business.txt");
            try (Scanner fileManager = new Scanner(myObj)) {
                while (fileManager.hasNextLine()) {
                    String curLine = fileManager.nextLine();
                    String[] splitted = curLine.split("\\|");
                    business nuser = new business();
                    nuser.comname = splitted[0].trim();
                    nuser.comaccid = splitted[1].trim();
                    nuser.password = splitted[2].trim();
                    nuser.balance = splitted[3].trim();
                    nuser.phone = splitted[4].trim();
                    nuser.branch = splitted[5].trim();
                    nuser.address = splitted[6].trim();
                    nuser.loan = splitted[7].trim();
                    nuser.cloan = splitted[8].trim();
                    nuser.reason = splitted[9].trim();
                    businesses.add(nuser);
                    newBusId = splitted[1].trim();
                }
                fileManager.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }

    //update file after editing
    static void update() {
        File usersdata = new File("user.txt");
        usersdata.delete();
        try {
            try (FileWriter myWriter = new FileWriter("user.txt", true)) {
                for (user i : users) {
                    String fuser = i.name + "|" + i.accId + "|" + i.password + "|" + i.balance + "|" + i.phone + "|" + i.branch + "|" + i.address + "|" + i.loan +"|" + i.cloan +"|" + i.reason + "\n";
                    myWriter.write(fuser);
                }
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    static void updateCashier() {
        File cdata = new File("cashier.txt");
        cdata.delete();

        try {
            try (FileWriter myWriter = new FileWriter("cashier.txt", true)) {
                for (cashier i : cashiers) {
                    String Ncashier = i.name + "," + i.branch + "," + i.counter + "," + i.password + "," + i.transferred + "\n";
                    myWriter.write(Ncashier);
                }
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    static void updateBus() {
        File cdata = new File("business.txt");
        cdata.delete();

        try {
            try (FileWriter myWriter = new FileWriter("business.txt", true)) {
                for (business i : businesses) {
//                    String Ncashier = i.name + "," + i.branch + "," + i.counter + "," + i.password + "," + i.transferred + "\n";
                    String fuser = i.comname + "|" + i.comaccid + "|" + i.password + "|" + i.balance + "|" + i.phone + "|" + i.branch + "|" + i.address + "|" + i.loan +"|" + i.cloan + "|" + i.reason + "\n";
                    myWriter.write(fuser);
                }
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static void main() {
        Data.fillManager();
        Data.fillUser();
        Data.fillCashier();
        Data.fillBusiness();
    }
}
