package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.AppConfig;

/**
 * «На океане есть остров,
 * на том острове дуб стоит, под дубом сундук зарыт,
 * в сундуке — заяц, в зайце — утка, в утке — яйцо, в яйце — игла, — смерть Кощея»
 * <p>
 * There is an ocean in the world, there is an island in the ocean,
 * there is an oak on that island, a chest is buried under the oak,
 * a hare in the chest, a duck in the hare, an egg in the duck, a needle in the egg, Koshchei's death
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless = applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}