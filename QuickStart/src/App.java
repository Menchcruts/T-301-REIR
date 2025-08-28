public class App {
    public static void main(String[] args) throws Exception {
        Kattio io = new Kattio(System.in);
        
        double field = 0.09144;
        double num = io.getDouble();
        
        io.println("" + num*field);
        
        io.close();
    }
}