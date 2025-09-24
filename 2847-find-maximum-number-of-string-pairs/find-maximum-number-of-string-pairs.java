class Solution {
    // public String reverse(String s){
    //     String rev="";
    //     for(int i=s.length()-1;i>=0;i--){
    //         rev=rev+s.charAt(i);
    //     }
    //     return rev;
    // }
    public int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        int n=words.length;
        for(int i=0;i<n;i++){
            String a=words[i];
            if(a.equals("0")){
                    break;
                }
            for(int j=i+1;j<n;j++){
                String b=words[j];
                
                String reversing=new StringBuilder(b).reverse().toString();
                // String reversing=reverse(b);
                if(reversing.equals(a)){
                    count++;
                    b="0";
                    break;
                }
            }
        }
        return count;
    }
}