/**
 * index
 */
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(tinhLuong(number));
    };

    public static int tinhLuong(int hours) {
        if(hours == 8) {
            return 200000;
        } else if(hours < 8) {
            return hours*20000;
        } else {
            int newhours = hours - 8;
            return (200000 + newhours*30000);
        }
    }
}