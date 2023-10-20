package RPG_Game;

public class TestClient {
    public static void main(String[] args) {

        Warrior knight = new Knight();
        Wizzard wizzard = new Wizzard();
        WizzardAdapter wizzardAdapter = new WizzardAdapter(wizzard);

        System.out.println("--------Knight's Turn---------");
        knight.attack();
        knight.defend();
        knight.escape();

        System.out.println("--------Wizzard's Turn---------");
        wizzardAdapter.attack();
        wizzardAdapter.defend();
        wizzardAdapter.escape();
    }
}
