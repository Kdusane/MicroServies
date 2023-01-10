package MicroServicetwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feignServices")
public class Controller {
    @Autowired
    private FeignUtil feignUtil;

    @GetMapping("/{id}")
    public Optional<PersonalDetails> getName(int id){
        return feignUtil.getAllPersonalDetailById( id);
    }
}
