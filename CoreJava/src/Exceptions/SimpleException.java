package Exceptions;

public class SimpleException {
    public static void main(String[] args) {
        var a = 0;
        var b= 7;

        try {
            System.out.println(b / a);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("works always");
        }
        System.out.println("cant reach this if dont use try");

        try {
            testEx();
        }catch (Exception e){
            //do something
        }
    }

    /***
     *
     * @throws Exception
     */
    public static void testEx () throws Exception{
        System.out.println("zzz");
        throw new Exception("exception message",new ArithmeticException("this is cause"));
    }
}
