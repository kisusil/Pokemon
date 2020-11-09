package pokemonx.movedex.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends SpecialMove {

    private final String description = "uses the power of the swords";

    public SwordsDance() {
        this.type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK,2);
    }

    @Override
    protected String describe() {
        return description;
    }
}
