package interfaces;

public interface Knight {
    String takeQuest(Quest quest);
    String compliteQuest() throws InterruptedException;
    String changeQuest(Quest quest);
    String currentQuest();
}
