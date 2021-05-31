package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilites.result.ErrorDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

//    public DataResult<User> findByEmail(String email) {}

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody User user) {       //Response entity'nin içerisine ? işareti koyduk çünkü ne döneceğini bilmiyoruz
        return ResponseEntity.ok(this.userService.add(user));   // validation dan geçemez ise errorResult dönecek mesela
    }

    @ExceptionHandler(MethodArgumentNotValidException.class) //sistemde bu türden bir hata olursa yukrıdaki responseEntity'i bad request ile sarmala //hataları yakala
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
        Map<String, String> validationErrors = new HashMap<String, String>();
        for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors = new ErrorDataResult<>(validationErrors, "Doğrulama hataları");
        return errors;
    }
}

//200
//300
//400