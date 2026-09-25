import java.util.Scanner;
class queue{
    int[] arr;
    int size = 0;
    int front ;
    int rear ;

    queue(int s) {
        size = s;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int data){
        if ((rear+1)%size == front) {
            System.out.println("Queue full");
            return;
        }
        if (front==-1) {
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }
    int  dequeue(){
        if (front==-1) {
            System.out.println("Empty");
            return  -1;
        }
        int v = arr[front];
        if (front==rear) {
            front=-1;
            rear = -1;
        }
        else{
           front = (front+1)%size;
        }
        return v;
    }
    void display(){
        if (front==-1) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        while (true) { 
            System.out.println(arr[i]);
            if (i==rear) {
                break;
            }
            i = (i+1)%size;
        }
        System.out.println("");
    }
}
public class cir{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
      queue q = new queue(n);
        for (int i = 0; i < n; i++) {
            q.enqueue(s.nextInt());
        }
        int k = s.nextInt();
        k = k%n;
        for (int i = 0; i < k; i++) {
            int va = q.dequeue();
            q.enqueue(va);
        }
        q.display();
    }
}
