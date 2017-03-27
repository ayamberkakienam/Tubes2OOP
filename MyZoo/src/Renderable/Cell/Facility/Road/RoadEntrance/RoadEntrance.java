package Renderable.Cell.Facility.Road.RoadEntrance;

import Renderable.Cell.Facility.Road.Road;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
public class RoadEntrance extends Road {
    public RoadEntrance(int i, int j) {
        super(i, j);
        setContent('=');
        setEntrance(true);
    }
}
