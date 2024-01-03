
 
public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("haroune", true); 
        Wilder wilder2 = new Wilder("Jean-Claude", true); 
        Wilder wilder3 = new Wilder("Henri", false); 

        Wilder [] wilders = {wilder1,wilder2,wilder3}; 

        for (Wilder wilder : wilders) {
            System.out.println(wilder.whoAmI());
        }
 
    }
}
