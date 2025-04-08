package LeetCode75;

class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(i<j){
            while(i<j && vowels.indexOf(chars[i])==-1){
                i++;
            }
            while(i<j && vowels.indexOf(chars[j])==-1){
                j--;
            }
            char c=chars[i];
            chars[i]=chars[j];
            chars[j]=c;
            i++;
            j--;

        }
        return new String(chars);
    }
}
