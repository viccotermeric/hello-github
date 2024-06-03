class student{
    int rollno;
    String name;
    student(int r, String n){
    rollno = r;
    name = n;
    }
    }
    class marks extends student{
    int mark1, mark2;
    marks(int r, String n, int m1, int m2){
    super(r, n);
    mark1 = m1;
    mark2 = m2;
    }
    }
    class result extends marks{
    int Sports_marks;
    float total;
    result(int r, String n, int m1, int m2, int s){
    super(r, n, m1, m2);
    Sports_marks = s;
    }
    void display(){
    total = mark1 + mark2 + Sports_marks;
    System.out.println("\nThe Roll no is "+rollno);
    System.out.println("The Name is "+name);
    System.out.println("The Total result is "+total);
    }
    }
    class main{
    public static void main(String [] args){
    result r1 = new result(10, "Kuber", 99, 98, 99);
    result r2 = new result(43, "Knights", 97, 98, 99);
    r1.display();
    r2.display();
    }
    }
    