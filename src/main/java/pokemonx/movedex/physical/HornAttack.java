package pokemonx.movedex.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class HornAttack extends PhysicalMove {
    private final String description = "deals damage with no additional effect";

    public HornAttack() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return description;
    }
}
