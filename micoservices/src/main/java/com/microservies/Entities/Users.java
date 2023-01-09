package com.microservies.Entities;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String phoneno;

//    @OneToMany(targetEntity = Contact.class, cascade = CascadeType.ALL)
//    @JoinColumn(name="contact_id", referencedColumnName = "userId")
   private List<PersonalDetails> contactList = new ArrayList<>();
}
