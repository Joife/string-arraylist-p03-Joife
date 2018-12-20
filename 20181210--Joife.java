Skip to content
 
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 @HengzhiChen
Sign out
 Watch 0
 Star 0  Fork 1 HengzhiChen/string-arraylist-p03-HengzhiChen
forked from APCS2019/string-arraylist-p03-HengzhiChen
 Code  Pull requests 0  Projects 0  Wiki  Insights  Settings
Branch: master Find file Copy path string-arraylist-p03-HengzhiChen/20181206--Sophia.java
8295e39  11 days ago
@HengzhiChen HengzhiChen Update 20181206--Sophia.java
1 contributor
RawBlameHistory     
70 lines (63 sloc)  2.55 KB
import java.util.ArrayList;
import java.util.List;

public class Word{
    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" was swapped
     *  - letters were swapped at most one
     */
    public static String scrambleWord(String word)
    {
       
        String tmp = "";
        for(int i = 0;i<word.length()-1;i++){
            String a = word.substring(i,i+1);
            String b = word.substring(i+1,i+2);
            if(a.equals("A")&&!b.equals("A")){
                tmp+=b+a;
                i++;
            }
            else{
                tmp+=a;
                if(i==word.length()-2){
                    tmp+=word.substring(i+1,i+2);
                 }
            }}
        return tmp;
    }
    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was 
     *    before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
        /* part (b) */
        for(int i = 0;i<wordList.size;i++){
            if(scramble(wordList.get(i).equals(wordList.get(i)){
                word.remove(i);
                i--;
            }
        }
        
    }

    public static void main(String[] args)
    {
        
    }
}
