package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/Notify")
    public String notifyDetails(@RequestBody UserDetails userDetails)
    {
        String notificationMessage = String.format("User %s at email %s has successfully registered",
                userDetails.getName(), userDetails.getEmail());
        return notificationMessage;
    }
}


