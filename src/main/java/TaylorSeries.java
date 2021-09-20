public class TaylorSeries {

    // this will make the facotrial (bottom of the equation) and will take the n and if it is not 1 or 0 will take
    // every number and multiply them together to make the n! of whatever n you want and will return the answer for this part
    public static double factorial(int n){


        if(n != 0){
            return (n*factorial(n-1));
        }else {
            return 1;
        }


    }


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // this will make the pow (top of the equation) and will take the x and n and will find out if n is 0 or not cause
    // we will be taking the n and making it the power of x and will return the answer for this part
    public static double pow(int x, int n){
        if(n != 0){
            return x*pow(x,n-1);
        }else {
            return 1;
        }


    }


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // will take the code from above and will preform the TaylorSeries equation with the numbers you put in from x and n
    // and will return the answer
    public static double approximateExp(int x, int n){
        double Answer = 0;
        double add = 0;

        while(n >= 0){
            add = pow(x, n)/factorial(n);
            Answer += add;
            n-=1;
        }



        return(Answer);
    }
}

