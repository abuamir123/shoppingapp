package com.example.shoppingapp.Controller.Auth;


import com.example.shoppingapp.Helpers.authlogin;
import com.example.shoppingapp.Helpers.response;
import com.example.shoppingapp.DB.insertData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class loginController {

    @PostMapping("/login")
    public response login(@RequestBody authlogin credentials) {
        return insertData.userLogin(credentials);
    }

    @GetMapping("/allUser")
    public response getallUsers() {
        return insertData.meow();
    }
}
    

