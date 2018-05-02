// License: GPL. For details, see Readme.txt file.
package io.github.makbn.meemmapviewer.interfaces;

/**
 * Projected coordinates (east / north space).
 *
 * For most projections, one unit in projected space is roughly one meter, but
 * can also be degrees or feet.
 */
public interface IProjected {
    double getEast();
    double getNorth();
}

