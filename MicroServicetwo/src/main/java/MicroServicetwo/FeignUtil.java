package MicroServicetwo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@FeignClient(value = "feignclientdemo",url = "http://localhost:8080/microservices")

public interface FeignUtil {


    @GetMapping("/name")

    public Optional<PersonalDetails> getAllPersonalDetailById(int id);
    @GetMapping("/address")
    public String getAddress();

}
