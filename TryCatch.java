public class TryCatch{
    public static void main(String A[]){
        int i=2;
        int j=0;
        int nums[] = new int[6];
        String str = "SurendharG";
        try {
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(str.length());


        } 
        catch (ArithmeticException e) {
            System.out.println("not divided by zero " +e);

            }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("be in your limites not go out of bounds  : "+e );

        }
        catch(Exception e){
            System.out.println("something went wrong " +e);
        }
        finally{
            System.out.println(j);
            System.out.println("Bye");
        }


    }
}