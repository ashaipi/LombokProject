package org.example;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class UserLombokModel2 {
    private final double PI;
    @NonNull
    private int id;
    private String name;
}
