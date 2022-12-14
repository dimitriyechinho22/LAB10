package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FacebookUser extends User{
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;

    public LocalDate getUserActiveTime() {
        return getUserActiveTime;
    }
}