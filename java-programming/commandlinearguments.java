public class CommandLineArgument {
    public static void main(String[] args) {
       try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum is " + sum);
       }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Provide two values for addition");
        }catch(NumberFormatException e){
           System.out.println("Please Provide numbers as argument");
       }
    }
}
