package Djekstra;

import PQHeap.PQHeap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MGund on 5/7/2016.
 */
public class Djekstra {

    private void initialize_single_source (List<vertex> graph, vertex s) {
        for (vertex v : graph) {
            //Setting D(our estimated shortest path from s to v) to ~infinite
            v.setD(Integer.MAX_VALUE);
            //Sætter dens forrige til null
            v.setPredecessor(null);
        }
        //Sætter source(første vertex) til at have afstand = 0(til sig selv)
        s.setD(0);
    }

    public void Djekstra_algorithm(List<vertex> graph, vertex s) {
        //Empty set of vertices
        ArrayList<vertex> setOfVertices = new ArrayList<>();

        //Inserting all our vertices from graph into our minHeap
        PQHeap q = new PQHeap(100);
        for (vertex v : graph) {
            q.insert(v);
        }
        while (!q.empty()) {
            vertex u = q.extractMin();
            setOfVertices.add(u);
            //MANGLER FOR LOOP(Side. 658)
        }


    }
}
