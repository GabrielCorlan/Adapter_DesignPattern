package RPG_Game;

public class WizzardAdapter implements Warrior {

    Wizzard wizzard;

    public WizzardAdapter(Wizzard wizzard) {
        this.wizzard = wizzard;
    }

    @Override
    public void attack() {
        wizzard.castFireballSpell();
    }

    @Override
    public void defend() {
        wizzard.castShieldSpell();
    }

    @Override
    public void escape() {
        wizzard.openPortal();
    }
}
