package pQueue;

public class QueueMain {
    public static void main(String[] args) {

        MyPriorityQueue pq = new MyPriorityQueue();

        System.out.println("Queue Empty : " +pq.isEmpty() +"\n");

        PQElement reading = new PQElement(5, "Reading");
        PQElement watchingYouTube = new PQElement(4, "Watching YouTube");
        PQElement exercise = new PQElement(1, "Exercise");


        pq.enqueue(exercise);
        pq.enqueue(watchingYouTube);
        pq.enqueue(reading);

        System.out.println(pq.frontElement());

        pq.enqueue(new PQElement(10, "Take out trash"));

        System.out.println(pq);

        PQElement del = (PQElement) pq.dequeue();
        System.out.println("Element " + del.getElement() +
                " with priority " + del.getKey() +
                " has been deleted\n");

        System.out.println("The size of the queue is: " + pq.size()+"\n");

        System.out.println(pq);
    }
}