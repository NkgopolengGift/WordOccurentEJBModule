
package za.ac.tut.ejb.bl;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;

@Stateless
public class WordOccurentSB implements WordOccurentSBLocal {

    @Override
    public Map<String, Integer> countOccurent(String text) {
        
       
        text = text.trim().toLowerCase();
        
        String[] temp = text.split(" ");
        
        Map<String, Integer> theMap = new HashMap<>();
        
        for (String word: temp) {
            
            if(theMap.containsKey(word)){
                theMap.put(word, theMap.get(word)+1);
            }
            else{
                theMap.put(word, 1);
            }
        }
        
        return theMap;
    }
}
