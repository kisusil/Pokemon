package pokemonx.movedex.physical;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {

    private final String description = "deals damage with the horn";

    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.3) {
            Effect.poison(pokemon);
        }
    }

    @Override
    protected String describe() {
        return description;
    }
}
