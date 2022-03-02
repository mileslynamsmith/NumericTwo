// create a class (blueprint // Plan)
class NumericTwo {
        // objects are variables(state) and methods (behaviour)
        // give int num a value
        private int num = 5;
// method square
    int square(){
        int result = num*num;
        // missing return statement
        return result;
    }
// method cube
    int cube (){
        int result = num*num*num;
        return result;
    }
    // method odd
    int odd (){
        int result = (num % 2 != 0 );
        return result;
    }
    // method even
    int even (){
        int result = (num % 2 == 0 );
        return result;
    }
    public static void main(String[] args){
    }
}
