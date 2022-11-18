import java.util.ArrayList;

public class Seashells {
    ArrayList<Integer> seashells;
    int buckets;

    public Seashells(ArrayList<Integer> seashells) {
        this.seashells = seashells;
    }

    public int countBuckets() {
        int currentBucket = 0;
        int i = 0;
        while(seashells.size() > 0) {
            if(seashells.get(i) <= 100 - currentBucket) {
                currentBucket = seashells.get(i);
                for(int j = i + 1; j < seashells.size(); j++) {
                    if(seashells.get(j) + currentBucket <= 100) {
                        currentBucket += seashells.get(j);
                        seashells.remove(j);
                        j--;
                    }
                }
                buckets++;
                seashells.remove(i);
                currentBucket = 0;
            }
        }
        return buckets;
    }
}
