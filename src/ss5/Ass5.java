package ss5;

public class Ass5 {
    public static void main(String[] args) {
        News n = new News(1, "Nay buon", "25/09/2022", "Thai", "Sad", "123");
        n.RateList[0] = 6;
        n.RateList[1] = 3;
        n.RateList[2] = 1;
        n.Calculate();
        n.Display();
    }
}
