package pokemonx.pokemondex.amaura;

import pokemonx.movedex.special.FlashCannon;
import pokemonx.movedex.special.Thunderbolt;
import pokemonx.movedex.status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Amaura extends Pokemon {
    public Amaura(String name, int level) {
        super(name, level);
        addType(Type.ROCK);
        addType(Type.ICE);
        addMove(new Thunderbolt());
        addMove(new ThunderWave());
        addMove(new FlashCannon());
        setStats(77, 59, 50, 67, 63, 46);
    }
}
