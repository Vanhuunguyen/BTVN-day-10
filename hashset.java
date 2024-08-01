package BTVNday10;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        int[] soNguyen = {1,2,3,4,1,2,3,4,5,7,8,9};
        HashSet<Integer> number = new HashSet<>();
        for (int i = 0; i<soNguyen.length;i++){
            number.add(soNguyen[i]);
        }
        System.out.println(number);
    }
}
