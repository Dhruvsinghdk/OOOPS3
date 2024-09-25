public class B {
    private int a;
    private String b;
    private int c;

    B(){
        a = 12;
        b = "podi";
    }

    B(int x){
        this.a = x;


    }
    B(int a , String b){
        this.b = b;
        this.a = a;

    }
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    B(int a , String b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
