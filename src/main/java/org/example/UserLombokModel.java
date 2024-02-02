package org.example;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLombokModel {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
}