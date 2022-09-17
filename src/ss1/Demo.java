package ss1;

public class Demo {
    public static void main(String[] args) {

        System.out.println("hello world!!");

        int x = 10;

        System.out.println("x =" + x);

        String str = "Hello World";

        if (x > 5) {
            System.out.println(str);
        } else {
            System.out.println("not found");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
        }

        Car c = new Car();
        c.brand = "Toyota";
        Car c2 = new Car();
        System.out.println(c.brand);
        Car.color = "red";
        System.out.println(Car.color);
        c.showInfor();
        c2.showInfor();
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);

        TamGiac t = new TamGiac();
        t.setCanh1(4);
        t.canh2=5;
        t.canh3=6;
        System.out.println("Chu Vi =" + t.chuVi());
        System.out.println("Dien Tich =" + t.dienTich());

    }
}
