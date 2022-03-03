// create a class (blueprint // Plan)
class NumericTwo {
// method square

    // [modifiers] <return type> <method name>([<parameter type> <parameter name>[, ...]])
    static int square(int num){ 
        int result = num*num;
        // missing return statement
        return result;
    }
// method cube
    static int cube (int num){ 
        int result = num*num*num;
        return result;
    }
    // method odd
    static boolean odd (int num){
       return num % 2 != 0;
    }
    // method even
    static boolean even (int num){
        return num % 2 == 0; 
    }
    // compile it 
    public static void main (String [] args){
        System.out.println("The square of 6 is " + square(6));
        System.out.println("The square of 7 is " + square(7));
        System.out.println("The cube of 6 is " + cube(6));
        System.out.println("The cube of 6 is " + cube(7));
        System.out.println("Three is an odd number " + odd(3));
        System.out.println("Five is an odd number " + odd(5));
        System.out.println("Four is an even number  " + even(4));
        System.out.println("Six is an even number  " + even(6));
    }

}
