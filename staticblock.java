class details{
    int empid;
    int salary;
    static String ceo;

    public  details(int e1,int s1){
        empid =e1;
        salary=s1;
        System.out.println("in constructor");
    }
    static{
        ceo="Harsha";
    }
    void display(){
        System.out.println(empid+""+salary+""+ceo);
    }
}



public class staticblock {
    public static void main(String[] args) {
        details naveen =new details(100,25000);
        details rahul =new details(200 , 35000);
        naveen.display();
        rahul.display();
    }
}
