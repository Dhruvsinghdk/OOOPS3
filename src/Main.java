// Aggreagteion classs

class C {
    String name , city;

    C(String name , String city){
        this.name = name;
        this.city = city;
    }
}

class  D{
    String empname, empcity;
    C c;

    D(String empname , String empcity, C c){
        this.empname = empname;
        this.empcity = empcity;
        this.c = c;
    }
    void show(){
        System.out.println(empname);
        System.out.println(empcity);
        System.out.println(c.city);
        System.out.println(c.name);
    }
}

class  Student{
    String name , city;
    C a;

    Student(String name, String city, C a){
        this.name = name;
        this.city = city;
        this.a = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(city);
        System.out.println(a.name);
        System.out.println(a.city);
    }
}

public class Main {
    public static void main(String[] args) {
       C n1 = new C("Amit","Lucknow");

        D n6 = new D( "Rohit", "Patliputra"   ,  n1);


      Student s = new Student("Rohan", "Paris",n1);

      s.display();
    }
}
