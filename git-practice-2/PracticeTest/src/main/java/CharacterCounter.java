/**
 * Created by karen.kiener on 5/28/17.
 */
public class CharacterCounter {

    private String letters;

    public CharacterCounter(String letters) {
        this.letters = letters;
    }

    public int count(char a) {
        int counter = 0;
        for (int i = 0; i < letters.length(); i++) {
            if(a == letters.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
