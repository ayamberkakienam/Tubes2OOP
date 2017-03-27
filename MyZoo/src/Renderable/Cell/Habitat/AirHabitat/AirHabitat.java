package Renderable.Cell.Habitat.AirHabitat;

import Renderable.Cell.Habitat.Habitat;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
class AirHabitat extends Habitat {
    public AirHabitat(boolean caged, int i, int j) {
        super(caged, i, j);
        setContent('*');
    }
}
