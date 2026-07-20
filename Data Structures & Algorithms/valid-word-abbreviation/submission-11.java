class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

       
        
        int i=0,j=0;
        String num = "";

        while(i < word.length() && j < abbr.length()){
            if(word.charAt(i) != abbr.charAt(j)){
                if(!Character.isDigit(abbr.charAt(j))){
                    return false;
                }
                else{
                    if(num.isEmpty() && abbr.charAt(j) == '0'){
                        return false;
                    }
                    while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                        num += abbr.charAt(j++);
                    }
                    i += Integer.parseInt(num);
                    num = "";
                }
                
            }
            else{
                i++;
                j++;
            }
        }
        return i == word.length() && j == abbr.length();
    }
}