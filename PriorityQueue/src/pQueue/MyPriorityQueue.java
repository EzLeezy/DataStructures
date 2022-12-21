package pQueue;

import java.util.ArrayList;

public class MyPriorityQueue implements PQInterface {
    ArrayList<PQElement> queue;

    public MyPriorityQueue() {
        this.queue = new ArrayList<>();
    }


    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }


    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object frontElement() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.get(0);
        }
    }




    @Override
    public void enqueue(Object element) {
        PQElement pqElement = (PQElement) element;
        for (PQElement e: queue) {
            if (e.getKey() < pqElement.getKey()) {
                queue.add(queue.indexOf(e), pqElement);
                return;
            }
        }

        queue.add(pqElement);
    }
    @Override
    public Object dequeue() {
        if (!queue.isEmpty() ) {
            return queue.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (PQElement e: queue) {
            s.append("- Element: ").append((String) e.getElement()).append(", Priority: ").append(e.getKey()).append("\n");
        }
        return s.toString();
    }

}