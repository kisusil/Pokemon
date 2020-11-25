package pokemonx.movedex.status;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends SpecialMove {

    private final String description = "deafens the target with the sound of the thunder";

    public ThunderWave() {
        this.type = Type.ELECTRIC;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
        if(Math.random() <= 0.25) {
            Effect.sleep(pokemon); // 25% chance of not being able to attack
        }
        pokemon.setMod(Stat.SPEED, (int) (pokemon.getStat(Stat.SPEED) / 2));
    }

    @Override
    protected String describe() {
        return description;
    }
}
