public class hw_2 {
    public static void main(String[] args) {
        for (int i = 1000; i > 2; i--){
            while(i>2 & i%(i-1)==0) {
                i= --i;
            }
            if(i>2 & i%(i-1)==0){
            System.out.println(i);
            }
            }
        }

        }


