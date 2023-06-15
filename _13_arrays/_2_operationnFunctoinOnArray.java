public class _2_operationnFunctoinOnArray {

    static void addArray(int [] marks){
        for(int i=0;i<marks.length;i++){
            marks[i]+=10;
            System.out.print(marks[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] marks = {20,22,12};
        addArray(marks);

    }
}
