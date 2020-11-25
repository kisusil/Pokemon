package pokemonx.movedex.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {

    private final String description = "makes the focus blast";

    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE,-1);
        }
    }

    @Override
    protected String describe() {
        return description;
    }
}
