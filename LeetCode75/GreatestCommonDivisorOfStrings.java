package LeetCode75;
class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        String prefix="",result="";
        for(int i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)==str2.charAt(i)){
                prefix+=str1.charAt(i);
            }
            if((str1.split(prefix, -1).length-1)*prefix.length()==str1.length() && (str2.split(prefix, -1).length-1)*prefix.length()==str2.length()){
                result = (prefix.length()>result.length())?prefix:result;
            }
        }
        return result;
    }
}