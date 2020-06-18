public class ReverseArray {



    public int[] reverseInt(int[] number){

        for(int i=0; i<number.length; i++){

         /*   int temp[] = int[i];
            number[i] = number[number.length-i-1];
            number[number.length-i-1] = temp;
*/

        }
        return number;
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,4};
        ReverseArray rev = new ReverseArray();
        for(int i: arr){
            System.out.println(i);
        }

        int[] revArray = rev.reverseInt(arr);
        for(int i: revArray){
            System.out.println(i);
        }
        System.out.println(revArray);
    }
}
