package pokemonx.movedex.special;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {

    private final String description = "throws the thunderbolt";

    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.1) {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return description;
    }
}
