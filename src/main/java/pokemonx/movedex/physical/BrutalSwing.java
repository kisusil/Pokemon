package pokemonx.movedex.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove {
    private final String description = "swings its body around violently and deals damage";

    public BrutalSwing() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe() {
        return description;
    }
}
