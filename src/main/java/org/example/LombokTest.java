package org.example;

public class LombokTest {
    public static void main(String[] args) {
        // test constructor
        System.out.println("-----------------------------------");
        UserLombokModel lombokModel = new UserLombokModel(100, "Ramesh", "Fadatare", 28, "Male");
        System.out.println(lombokModel.toString());

        UserLombokModel lombokMdl = new UserLombokModel();

        // test getter and setter methods
        lombokMdl.setId(100);
        lombokMdl.setFirstName("Ramesh");
        lombokMdl.setLastName("Fadatare");
        lombokMdl.setAge(28);
        lombokMdl.setGender("Male");

        System.out.println(lombokMdl.getId());
        System.out.println(lombokMdl.getFirstName());
        System.out.println(lombokMdl.getLastName());
        System.out.println(lombokMdl.getGender());
        System.out.println(lombokMdl.getAge());

        UserLombokModel2 lm2 = new UserLombokModel2(3.14,12);
        System.out.println(lm2);

    }
}