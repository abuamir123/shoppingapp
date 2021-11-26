package com.example.shoppingapp.Controller.Auth;
import com.example.shoppingapp.DB.insertData;
import com.example.shoppingapp.Helpers.response;
import com.example.shoppingapp.Helpers.user;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class registerController {
    @PostMapping("/register")
    public response register(@RequestBody user u) {
        return insertData.addUser(u);
    }
}

