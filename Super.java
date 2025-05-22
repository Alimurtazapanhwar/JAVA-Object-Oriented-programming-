
class A{
    A(){
        System.out.println("A");
    }
    A(int a){
        System.out.println("The values of a in "+a);
    }
}
class B extends A{
    B(){

        System.out.println("B");
    }
    B(int a,int b){
        super (a);
        System.out.println("The value of b in "+b);
    }
}
class C extends B{
    C(){
        System.out.println("C");
    }
    C(int a,int b,int c){
        super (a, b);
        System.out.println("The value of b in "+c);
    }
}
public class Super {
    public static void main(String[] args) {

        C ob=new C(7,2,4);


    }

}

