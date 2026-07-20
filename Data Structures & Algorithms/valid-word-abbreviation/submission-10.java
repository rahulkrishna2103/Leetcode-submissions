class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

       
        
        int i=0,j=0;
        String num = "";

        while(i < word.length() && j < abbr.length()){
            if(word.charAt(i) != abbr.charAt(j)){
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                    if(num.isEmpty() && abbr.charAt(j) == '0'){
                        return false;
                    }
                    num += abbr.charAt(j++);
                }
                if(num.isEmpty()){
                    return false;
                }
                i += Integer.parseInt(num);
                num = "";
            }
            else{
                i++;
                j++;
            }
        }
        return i == word.length() && j == abbr.length();
    }
}