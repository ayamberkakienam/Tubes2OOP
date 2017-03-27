package Renderable.Cell.Habitat.WaterHabitat;

import Renderable.Cell.Habitat.Habitat;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
class WaterHabitat extends Habitat {
    public WaterHabitat(boolean caged, int i, int j) {
        super(caged, i, j);
        setContent('~');
    }
}
