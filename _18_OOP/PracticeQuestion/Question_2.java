public class Question_2 {

    public static void main(String[] args) {
        Person p = new Person();
        p.name="Yash";
        p.weight=74;
    }
}

class Person {
    String name;
    int weight;
}

class Students extends Person {
    int rollumber;
    String schoolName;
}    
