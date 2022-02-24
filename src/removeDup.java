public class removeDup {

    public static void main(String[] args) {


        String str = "AABBCCDD";
        String str2 = "";


        for  (int i = 0; i < str.length(); i++){
            if (str2.indexOf(str.charAt(i))==-1){
                str2 += str.charAt(i);

            }
        }
        System.out.println(str2);

    }
}
