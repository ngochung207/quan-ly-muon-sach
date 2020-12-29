import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CardManager {
    private Map<String, CardLibrary> cardLibraryManager = new HashMap<>();

    public CardManager() {
    }

    public void addCardLibraryManager(CardLibrary cardLibrary) {
        cardLibraryManager.put(cardLibrary.getId(), cardLibrary);
    }

    public CardLibrary getCardLibraryByID(String id) {
        return cardLibraryManager.get(id);
    }

    public String getmDateByID(String id) {
        CardLibrary cardLibrary = getCardLibraryByID(id);
        return cardLibrary.getmDate();
    }

    public String gettDateByID(String id) {
        CardLibrary cardLibrary = getCardLibraryByID(id);
        return cardLibrary.gettDate();
    }

    public Set listKeys() {
        return cardLibraryManager.keySet();
    }
}
