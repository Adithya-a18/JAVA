class A {
    void show() {
        System.out.println("class A");
    }

    class B {
        void display() {
            System.out.println("class B");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
        
      
        A.B b1 = a1.new B();
        b1.display();
    }
}
