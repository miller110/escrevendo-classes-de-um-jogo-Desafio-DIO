public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        Hero hero = heroFactory.createHero();

        hero.attack();
    }

}
