package RPG_Game;

public class Knight implements Warrior {
    @Override
    public void attack() {
        System.out.println("RPG_Game.Knight attacks!");
    }

    @Override
    public void defend() {
        System.out.println("RPG_Game.Knight defends!");
    }

    @Override
    public void escape() {
        System.out.println("RPG_Game.Knight is running..");
    }
}
