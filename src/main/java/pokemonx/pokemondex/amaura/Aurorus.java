package pokemonx.pokemondex.amaura;

import pokemonx.movedex.special.Psychic;

public class Aurorus extends Amaura {
    public Aurorus(String name, int level) {
        super(name, level);
        addMove(new Psychic());
        setStats(123,77,72,99,92,58);
    }
}
