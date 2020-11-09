package pokemonx.movedex.special;

import ru.ifmo.se.pokemon.*;

public class Acid extends SpecialMove {

    private final String description = "pour acid on its rival";
    public Acid() {
        super(Type.POISON, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return description;
    }
}
