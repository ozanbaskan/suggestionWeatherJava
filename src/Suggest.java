import java.util.Scanner;

public class Suggest {
    public static void main(String[] args) {
        float temp;

        Scanner s = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık giriniz(°C): ");
        temp = s.nextFloat();

        if (temp < 5)
        {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else
        {
            if (temp <= 15)
            {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (temp <= 25)
            {
                System.out.println("Pikniğe gidebilirsin.");
            }
            else
            {
                System.out.println("Yüzmeye gidebilirsin.");
            }
        }
    }
}
