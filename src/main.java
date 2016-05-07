import Djekstra.vertex;
import PQHeap.PQHeap;

/**
 * Created by MGund on 5/7/2016.
 */
public class main {

    public static void main(String[] args) {


        PQHeap pq = new PQHeap(100);

        for (int i = 1; i < 20; i = i * 2) {
            pq.insert(new vertex(i,null));
        }

        for (int i = 0; i < 5; i++) {
            vertex q = pq.extractMin();
            System.out.println( q.getD() + " - " + q.getFL() );
        }
    }

}
