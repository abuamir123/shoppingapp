package com.example.shoppingapp.Helpers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class response {
    int code;
    String msg;
    Object object;
}