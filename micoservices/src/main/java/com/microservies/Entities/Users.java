package com.microservies.Entities;


import lombok.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Users {
    private int userId;
    private String name;
    private String phoneno;

    private List<Contact> contactList = new ArrayList<>();
}
