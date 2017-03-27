package Renderable.Cell.Habitat.LandHabitat;

import Renderable.Cell.Habitat.Habitat;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
class LandHabitat extends Habitat {
    public LandHabitat(boolean caged, int i, int j) {
        super(caged, i, j);
        setContent('#');
    }
}
