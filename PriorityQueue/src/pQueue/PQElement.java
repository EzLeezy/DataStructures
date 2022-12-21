package pQueue;

public class PQElement {
    private final int key;
    private final Object element;

    public PQElement(int pKey,Object e) {
        key = pKey;
        element = e;

    }

    public int getKey() {
        return key;
    }

    public Object getElement() {
        return element;
    }

    @Override
    public String toString() {
        // Return a string representation of the PQElement object
        return "Element : " + element + ", Priority: "+key +"\n";   }

}
