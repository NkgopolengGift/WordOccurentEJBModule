
package za.ac.tut.ejb.bl;

import java.util.Map;
import javax.ejb.Local;
@Local
public interface WordOccurentSBLocal {

    Map<String, Integer> countOccurent(String text);
    
}
