package task1;

public class Main {
    public static void main(String[] args) {
        DBase database = DBase.creation();
        User Dima = new User("Dima", "Dima.com", 18);
        Dima.setDB(database);
        Dima.save();


    }
}