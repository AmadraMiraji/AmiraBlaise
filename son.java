class father{
    void mother(){
       int myAge=12;
       String name= "amadra miraji";
       String sex= "male";
       System.out.println("NAME: " + name);
       System.out.println("AGE: " + myAge);
       System.out.println("SEX: " + sex);
   }
}
class children extends father{
   void boy(){
       int children=12;
       System.out.println("No of children: " + children);
       
   }
}




public class son{
   public static void main(String[] args){
       children children = new  children();
       children.mother();
       children.boy();

       

   }
}
