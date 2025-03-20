// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CheckArmstrong {
    public static void main(String[] args) {
        int n=371,r,sum=0,temp;
        temp=n;
        for(int i=1;i<=3;i++){
            r=n%10;
            sum=r*r*r + sum;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(temp+" is Amstrong.");
        }
        else{
            System.out.println(temp+" is not Amstrong.");
        }
        
    }
}
