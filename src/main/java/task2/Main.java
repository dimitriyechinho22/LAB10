package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Autorisation autorisation = new Autorisation();
        if (autorisation.autorise(dataBase)) {
        } else {
            ReportBuilder rb = new ReportBuilder(dataBase);
        }
        Login lg = new Login();
        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.println("Select method");
        choose = sc.nextInt();
        if (choose == 1){
            lg.login("twitter");}
        else if (choose == 2){
            lg.login("facebook");}
        else {
            System.out.println("Wrong method");
        }
    }
}
