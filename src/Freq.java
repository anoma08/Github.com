public class Freq {
    public static void main(String[] args) {

        String str = "AAABBCCDD";
        String str2 = "";
        int count = 0;

        for (int a = 0; a < str.length(); a++) {
            if (str2.indexOf(str.charAt(a)) == -1) {
                str2 += str.charAt(a);
            }
        }
        for(int i = 0; i < str2.length(); i++){
            for (int j = 0; j < str.length(); j++){
                if(str2.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.print(str2.charAt(i));
            System.out.print(count);
            count=0;
        }
    }
}
