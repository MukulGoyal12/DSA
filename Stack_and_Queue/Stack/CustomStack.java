package Stack_and_Queue.Stack;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data= new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full..");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;   //ptr is at last index
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack..");
        }
        return data[ptr--];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int peek() throws Exception{         //peek means at the top
        if(isEmpty()){
            throw new Exception("Cannot peek from empty stack..");
        }

        return data[ptr];
    }

    public static void main(String[] args) {
    }
}
