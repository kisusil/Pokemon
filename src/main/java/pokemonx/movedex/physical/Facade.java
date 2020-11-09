package pokemonx.movedex.physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    private final String description = "makes a facade attack move";

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(pokemon.getCondition() == Status.BURN ||
                pokemon.getCondition() == Status.POISON ||
                pokemon.getCondition() == Status.PARALYZE) {
            power *= 2;
        }
    }

    @Override
    protected String describe() {
        return description;
    }
}
