package task2;

public class WorkingUser implements UserInterface{

    private final User user;

    public WorkingUser(User user) {
        this.user = user;
    }

    @Override
    public String getUserEmail() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getUserMail();
        }
        else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getEmail();
        }
        return null;
    }

    @Override
    public String getUserCountry() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getCountry();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getUserCountry().toString();
        }
        return null;
    }

    @Override
    public String getUserActiveTime() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getLastActiveTime().toString();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getGetUserActiveTime().toString();
        }
        return null;
    }
}
