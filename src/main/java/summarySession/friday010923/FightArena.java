package summarySession.friday010923;

import java.util.ArrayList;
import java.util.Random;

public class FightArena {
    public static void main(String[] args) {
        fight(addList(generateRandomSuperHero()));
    }

    private static Weapon generateRandomWeapon(){
        String[] names = {"Sword", "Knife", "Gun", "Stick", "Pen"};
        int[] forces = {20, 10, 50, 5, 2};
        int number = names.length;
        Random random = new Random();
        int randomInd = random.nextInt(number);
        return new Weapon(names[randomInd], forces[randomInd]);
    }

    private static Superhero generateRandomSuperHero(){
        Random randomForce= new Random();
        String[] names = {"Batman", "Superman", "Spiderman", "Joker"};
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        Weapon weapon = generateRandomWeapon();
        return new Superhero(randomName,100,randomForce.nextDouble(100),weapon);
    }
    private static ArrayList<Superhero> addList(Superhero superhero){
        ArrayList<Superhero> superheroes = new ArrayList<>();
        superheroes.add(generateRandomSuperHero());
        superheroes.add(generateRandomSuperHero());
        System.out.println(superheroes);
        return superheroes;
    }

    private static void fight(ArrayList<Superhero> superheroes) {
        for (int i = 1; i < superheroes.size(); i++) {
            double health1 = superheroes.get(i-1).getHealth();
            double health2 = superheroes.get(i).getHealth();
            double force1 = superheroes.get(i-1).getForce();
            double force2 = superheroes.get(i).getForce();
            double win1 =  health1 - (force2 + superheroes.get(i).getWeapon().getForce());
            double win2 =  health2 - (force1 + superheroes.get(i-1).getWeapon().getForce());
            if (win1 > 0) {
                System.out.println("WIN 1 " + superheroes.get(i));
            } else if (win2 > 0){
                System.out.println("WIN 2 " + superheroes.get(i-1));
            } else {
                System.out.println("Оба проиграли");
            }
        }
    }
}
