package PQHeap;
import Djekstra.vertex;

public interface PQ {
    public vertex extractMin();
    public void insert (vertex e);
}