import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> seashells = new ArrayList<>();
        while(seashells.size() < 100 && in.hasNextInt()) {
            seashells.add(in.nextInt());
            System.out.println(seashells.size());
        }
        Collections.sort(seashells, Collections.reverseOrder());
        Seashells orders = new Seashells(seashells);
        System.out.println(orders.countBuckets());

    }
}
