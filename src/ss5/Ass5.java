package ss5;

public class Ass5 {
    public static void main(String[] args){
        INews i = new INews() {
            @Override
            public void Display() {

            }
            public void Title(){
                System.out.println("Ngay chu nhat buon");
            }
            public void PublishDate(){
                System.out.println("27/9/2022");
            }
            public void Author(){
                System.out.println("Nguyen Quang Thai");
            }
            public void Content(){
                System.out.println("Hom nay se rat tuyet");
            }
            public void AverageRate(){
                System.out.println(8);
            }

        };
    }
}
