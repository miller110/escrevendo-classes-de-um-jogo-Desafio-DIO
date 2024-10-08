import java.util.InputMismatchException;
import java.util.Scanner;

public class HeroFactory {
    private Scanner input = new Scanner(System.in);

    public Hero createHero() {
        String type = getHeroType();
        String name = getHeroName() ;
        int age = getHeroAge();

        return new Hero(name, age, type);
    }

    private String getHeroType() {
        System.out.println("                      ******************* Bem-vindo ao jogo! *******************                               ");
        System.out.println("******************* Escolha um dos seguintes tipos de heróis: mago, guerreiro, monge, ninja *******************");
        System.out.println("Digite o tipo do herói: ");
        String type = input.nextLine().toLowerCase();

        while (!isValidHeroType(type)){
            System.out.println("Erro: Por favor, digite apenas um desses heróis: mago, guerreiro, monge, ninja.");
            type = input.nextLine().toLowerCase();
        }
        return type;
    }

    private boolean isValidHeroType(String type) {
        return type.equals("mago") || type.equals("guerreiro") || type.equals("monge") || type.equals("ninja");
    }

    private String getHeroName() {
        System.out.println("Digite o nome do herói: ");
        return input.nextLine();
    }

    private int getHeroAge() {
        int age = 0;
        boolean validAge = false;

        while(!validAge) {
            System.out.println("Digite a idade do herói: ");
            try {
                age = input.nextInt();
                validAge = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite apenas números para a idade.");
                input.next();
            }
        }
        input.nextLine();
        return age;
    }
}
