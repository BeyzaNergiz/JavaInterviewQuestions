package interwiev_questions;

public class DuplicateRemove {
    public static void main(String[] args) {


        String str = "IIISSSSTTTTAAAANNNNNBBBBUUULLLLL";

        System.out.println(removeDuplicate(str));

    }

    public static String removeDuplicate(String str){

        String result ="";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }


        return result;
    }

}
