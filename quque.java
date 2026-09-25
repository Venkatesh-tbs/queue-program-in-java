import java.util.Scanner;
class q{
    int arr[];
    int rear ;
    int front;

     q(int s) {
        arr = new int[s];
        rear = -1;
        front = 0;
    }
    void enque(int data){
        if (rear==arr.length-1) {
            System.out.println("Q is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }
    int deque(){
        if (front>rear) {
            System.out.println("No");
            return -1;
        }
        int v = arr[front];
        front++;
        return v;
    }
   int ispeak(){
    if (front>rear) {
        System.out.println("No");
         return -1;
    }
    return arr[front];
   }

    void  display(){
     if (front>rear) {
        System.out.println("No");
        return;
     }
     for (int i = front; i <= rear; i++) {
         System.out.print(arr[i]+" ");
     }
     System.out.println("");
   }
}
class quque{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
        int n = s.nextInt();
        q c = new q(n);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for(int i : arr){
            c.enque(i);
        }
        c.display();
        c.deque();
        c.deque();
        c.display();
    }
}