import pokemonx.pokemondex.amaura.Amaura;
import pokemonx.pokemondex.amaura.Aurorus;
import pokemonx.pokemondex.bellsprout.Bellsprout;
import pokemonx.pokemondex.bellsprout.Victreebel;
import pokemonx.pokemondex.bellsprout.Weepinbell;
import pokemonx.pokemondex.tapuFini.TapuFini;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Amaura("Amaura",100));
        pokemons.add(new Aurorus("Aurorus",18));
        pokemons.add(new Bellsprout("Bellsprout",50));
        pokemons.add(new Victreebel("Victreebel",250));
        pokemons.add(new Weepinbell("Weepinbell",30));
        pokemons.add(new TapuFini("TapuFini",140));

        for (int i = 0; i < pokemons.size(); i++) {
            if(i % 2 == 0) {
                battle.addFoe(pokemons.get(i));
            } else {
                battle.addAlly(pokemons.get(i));
            }
        }

        battle.go();
    }
}
