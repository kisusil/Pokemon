package pokemonx.pokemondex.bellsprout;

import pokemonx.movedex.physical.PoisonJab;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int level) {
        super(name, level);

        addMove(new PoisonJab());

        setStats(80,105,65,100,70,70);
    }
}
