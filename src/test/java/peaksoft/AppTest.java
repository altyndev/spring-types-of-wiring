package peaksoft;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import peaksoft.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        String text = "There is an ocean in the world, there is an island in the ocean," +
                " there is an oak on that island, a chest is buried under the oak," +
                " a hare in the chest, a duck in the hare, an egg in the duck," +
                " a needle in the egg, Koshchei's death";

        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
        String testText = koscheiTheDeathless.getRulesByDeth();

        if (!testText.contains(text) && testText.length() <= text.length()) {
            Assert.fail("Test failed, incorrect bin association. The final sentence is not correct.");
        }
    }
}
