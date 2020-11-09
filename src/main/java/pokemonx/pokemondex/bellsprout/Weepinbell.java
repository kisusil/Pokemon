package pokemonx.pokemondex.bellsprout;

import pokemonx.movedex.special.Acid;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level) {
        super(name, level);

        addMove(new Acid());

        setStats(65,90,50,85,45,55);
    }
}
