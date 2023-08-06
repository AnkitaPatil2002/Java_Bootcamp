public class Comparison {
    public static void main(String[] args) {
        String a="Ankita";
       // String b="Ankita";
        //== method a->Ankita b->Ankita
        //== checks references variable pointing to same object
        //how to create different object of same string?
        //String a =new String("Kunal")
        //String b=new String("Kunal")
        //.equals method for checking values

        String name1= new String("Ankita");
        String name2= new String("Ankita");
        //System.out.println(name1==name2);

        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(1));
    }
}
