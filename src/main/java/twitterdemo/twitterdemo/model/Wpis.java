package twitterdemo.twitterdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wpis {

    private String tresc;
    private LocalDateTime dateTime;
}
