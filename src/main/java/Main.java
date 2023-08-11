import entety.Adventurer;
import entety.Hunt;
import interfaces.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Knight knight = context.getBean("Adventurer", Adventurer.class);

        knight.takeQuest(context.getBean("Hunt", Hunt.class));
        knight.currentQuest();
        knight.compliteQuest();
    }
}
