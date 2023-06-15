import java.util.ArrayList;

public class _2_stackUsingArrayList{

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public boolean isEmpty(){
            return (list.size()==0);
        }

        // push
        public void push(int data){
            list.add(data);
        }

        // poop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public int peek(){
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}