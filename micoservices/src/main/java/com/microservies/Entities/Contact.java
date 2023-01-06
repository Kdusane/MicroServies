package com.microservies.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Contact {
    private int cid;
    private String emailid;
    private String contactNumber;
    private String userid;
}
