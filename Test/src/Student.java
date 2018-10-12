public class Student {
     String name ;
     String id ;
     int year = 2;

    Student(String name, String id ){
        this.name = name;
        this.id = id;
    }

    String get_data(){
        return name + " " + id + " " + year;
    }


    public static void main(String args[]){

            Student s = new Student("Temirlan", "17BD11027");
            String d = s.get_data();
            System.out.println(d);

    }
}