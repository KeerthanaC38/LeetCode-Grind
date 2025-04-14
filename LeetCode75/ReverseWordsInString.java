package LeetCode75;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        java.util.StringTokenizer st=new java.util.StringTokenizer(s);
        int i=0;
        String[] arr= new String[st.countTokens()];
        while(st.hasMoreTokens()){
            arr[i++]=st.nextToken().toString();
        }
        String word="";
        i=0;int j=arr.length-1;
        while(i<j){
            word=arr[i];
            arr[i++]=arr[j];
            arr[j--]=word;
        }
        String ans="";
        for(int k=0;k<arr.length-1;k++){
            System.out.print(arr[k]);
            System.out.println("ok");
            ans=ans+arr[k]+" ";
        } 
        ans=ans+arr[arr.length-1];
        return ans;
    }
}
