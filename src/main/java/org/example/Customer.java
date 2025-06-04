package org.example;

public class Customer implements IDrink {

            private String name;
            private int age;
            private String email;

            public Customer(String name, int age, String email) {

                this.name = name;
                this.age = age;
                this.email = email;

            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getEmail() {
                return name;
            }

            public void setEmail() {
                this.email = email;
            }

    @Override
    public void drinking() {
        System.out.println(name + " is drinking some water!");
    }
}
