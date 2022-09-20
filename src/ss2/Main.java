package ss2;

import ss1.Car;

public class Main {
    public static void main(String[] args){
        Human h = new Human();
        h.run(5);
        h.run("Cho Duoi");
        h.run(10,"cho duoi");
        h.run("cho duoi",10);

        Human h2 = new Human("Nguyen Tuan Anh");
        System.out.println(h2.name);
//        Student s = new Student("Nguyen Van A","013012331","So 8 Ton That Thuyet",18);
//        s.girlFriends[0] = "Ngoc Trinh";
//        s.girlFriends[1] = "Thi No";
//        s.myCar = new Car();


        int[] mark = new int[4];
        mark[0] = 19;

        Student[] students = new Student[10];

//        students[0] = new Student("Nguyen Van A","013012331","So 8 Ton That Thuyet",18);

        for(int i = 0 ; i< students.length ; i++){
            students[i] = new Student();
        }
    //set 10 sv theo do tuoi 20->29
        for(int i=0;i<students.length;i++){
            students[i].setAge(i+20);
        }
        for(int i=0;i<students.length;i++){
           System.out.println(students[i].getAge());
        }
//        for(Student st : students){
//            System.out.println(st.getAge());
//        }
    }



}
