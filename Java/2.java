public class PangramChecker {
  
      public boolean check_letter(int size, int i, String sentence){
        for(int element=0; element<size; element++){
            if(sentence.charAt(element)=='a'+i || sentence.charAt(element)=='A'+i){
                return true;
            }
        }
        return false;
    }


    public boolean check(String sentence){
        int size = sentence.length();
        boolean tenses;
        for(int i=0; i<=22; i++){
            if(!check_letter(size, i, sentence))return false;
        }
        return true;
    }
}


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PangramTest {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
}
