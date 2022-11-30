package task2;


import java.time.LocalTime;

public class MessageSender {
    public void send(String text, WorkingUser user, String country) {
        String msg = "Message:\n<<" + text + ">>\nWas sent to user with email: " +
                user.getUserEmail() + "\nFrom country " + country;
        if (user.getUserCountry() != null && country.equals("Ukraine"))
            if (LocalTime.from(LocalTime.parse(user.getUserActiveTime())).compareTo(LocalTime.of(1, 0)) > 0)
                System.out.println(msg);

    }
}