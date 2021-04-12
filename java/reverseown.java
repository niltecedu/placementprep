public class reverseown {
    public static void main(String[] args){
        String str="nilesh asdasd  dadsddas a sd as";
        String output="";
        for(int i=str.length()-1;i>=0;i--){
            output=output+str.charAt(i);
        }
        System.out.println(output);

    }
    
}
