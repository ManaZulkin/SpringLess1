package entety;

import interfaces.Knight;
import interfaces.Quest;

public class Adventurer implements Knight {
    Quest quest;
    @Override
    public String takeQuest(Quest newQuest) {
        this.quest = newQuest;
        return "You take quest: " + quest.getName() + "\nReward = " + quest.getRevard() ;
    }

    @Override
    public String compliteQuest() throws InterruptedException {
        System.out.println("You departure to quest area...");
        if (quest.getClass() == Serch.class){
            System.out.println("You are looking for items...");
            System.out.println("You found all what you need!");
        }
        if (quest.getClass() == Hunt.class){
            System.out.println("You are looking for enemies...");
            System.out.println("You go in fight!");
            System.out.println("It was great fight! You kill all enemies!");
        }
        if (quest.getClass() == Accompaniment.class){
            System.out.println("You meet you client...");
            System.out.println("You go to destination point");
            System.out.println("Mission complete!");
        }

        System.out.println("You returning to quest NPC");
        return null;
    }

    @Override
    public String changeQuest(Quest newQuest) {
        this.quest = newQuest;
        return "You change quest to " + quest.getName();
    }

    @Override
    public String currentQuest() {
        return this.quest.getName() + "\n" + this.quest.getRevard();
    }
}
