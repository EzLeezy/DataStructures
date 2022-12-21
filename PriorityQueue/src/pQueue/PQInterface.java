package pQueue;

public interface PQInterface {
     boolean isEmpty();
     int size();
     Object frontElement();
     void enqueue(Object element);
     Object dequeue();

}

