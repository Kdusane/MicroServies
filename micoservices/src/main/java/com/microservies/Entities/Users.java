package com.microservies.Entities;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Users {
    private int userId;
    private String name;
    private String phoneno;

}
