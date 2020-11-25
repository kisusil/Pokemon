package pokemonx.pokemondex.tapuFini;

import pokemonx.movedex.physical.BrutalSwing;
import pokemonx.movedex.physical.Facade;
import pokemonx.movedex.physical.HornAttack;
import pokemonx.movedex.special.FocusBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class TapuFini extends Pokemon {
    public TapuFini(String name, int level) {
        super(name, level);

        addType(Type.WATER);
        addType(Type.FAIRY);

        addMove(new FocusBlast());
        addMove(new HornAttack());
        addMove(new Facade());
        addMove(new BrutalSwing());

        setStats(70,75,115,95,130,85);
    }
}
