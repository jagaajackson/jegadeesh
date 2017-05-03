public class student1 {
   int rajaage;
   int rollno;

   public student1(String name) {
      System.out.println("Name is :" + name );
   }

   public void setAge( int age ) {
      rajaage = age;
   }
   public void setrollno(int no){
rollno=no;
}

   public int getAge( ) {
      System.out.println("student's age is :" + rajaage );
      return rajaage;
   }
public int getrollno( ) {
      System.out.println("student's rollno is :" + rollno);
      return rollno;
   }

   public static void main(String []args) {
     
      student1 mya = new student1( "raja" );

      mya.setAge( 12 );

      mya.setrollno(23);

      mya.getAge( );
      mya.getrollno();
   }
}