// License: GPL. For details, see Readme.txt file.
package io.github.makbn.meemmapviewer;

/**
 * This is a rectangular range of tiles.
 */
public class TileRange {
    protected int minX;
    protected int maxX;
    protected int minY;
    protected int maxY;
    protected int zoom;

    protected TileRange() {
    }

    public TileRange(TileXY t1, TileXY t2, int zoom) {
        minX = (int) Math.floor(Math.min(t1.getX(), t2.getX()));
        minY = (int) Math.floor(Math.min(t1.getY(), t2.getY()));
        maxX = (int) Math.ceil(Math.max(t1.getX(), t2.getX()));
        maxY = (int) Math.ceil(Math.max(t1.getY(), t2.getY()));
        this.zoom = zoom;
    }

    public TileRange(TileRange r) {
        minX = r.minX;
        minY = r.minY;
        maxX = r.maxX;
        maxY = r.maxY;
        zoom = r.zoom;
    }

    protected double tilesSpanned() {
        return Math.sqrt(1.0 * this.size());
    }

    /**
     * Returns size
     * @return size
     */
    public int size() {
        int xSpan = maxX - minX + 1;
        int ySpan = maxY - minY + 1;
        return xSpan * ySpan;
    }
}

