public class Prob9 {
    public static void main(String[] args) {
        Prob9 prob9 = new Prob9();
        String s = "Hello World";
        int result = prob9.lengthOfLastWord(s);
        System.out.println(result);
    }
    public int lengthOfLastWord(String s) {
        int length=0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i-=1;
        }
        while (i>=0 && s.charAt(i)!=' '){
            length+=1;
            i-=1;
        }
        return length;
    }
}
