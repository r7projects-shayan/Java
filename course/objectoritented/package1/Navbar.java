import java.lang.reflect.Field;


class Navitems{
     String item1 = "home";
     String item2 = "About";
     String item3 = "Contact";
    Boolean item4 = false;
}

public class Navbar{

    public static void main(String [] args){

        Navitems n = new Navitems();

        Class <?> nclass = n.getClass();

        Field[] f= nclass.getDeclaredFields();
 try {
                // Make the field accessible
                i.setAccessible(true);
                // Get the field value
                Object itemvalues = i.get(n);

                System.out.println(i.getName() + " : " + itemvalues);
            } catch (IllegalAccessException e) {
                // Handle the exception if it occurs
                System.out.println("Error accessing field: " + i.getName());
                e.printStackTrace();
            }

        

        

        
    }
}