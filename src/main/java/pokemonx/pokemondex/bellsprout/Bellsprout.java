package pokemonx.pokemondex.bellsprout;

import pokemonx.movedex.special.EnergyBall;
import pokemonx.movedex.status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);

        addType(Type.GRASS);
        addType(Type.POISON);

        addMove(new SwordsDance());
        addMove(new EnergyBall());

        setStats(50,75,35,70,30,40);
    }
}
