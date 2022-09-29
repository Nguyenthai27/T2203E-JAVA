package ss5;

import ss4.Human;

public class main {
    public static void main(String[] args){
        StudentInterface s = new StudentInterface() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }
            @Override
            public void learn() {

            }
        };
        Human h = new Human() {
            @Override
            public void eat() {
                System.out.println("eat ...");
            }

            @Override
            public void run() {
                System.out.println("Run...");
            }
        };
            h.eat();
            Human h2 = new Human() {
                @Override
                public void eat() {
                    System.out.println("Eatingg..");
                }

                @Override
                public void run() {

                }
            };
            h2.eat();

    }
}
