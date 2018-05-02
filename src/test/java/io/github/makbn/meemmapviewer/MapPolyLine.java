package io.github.makbn.meemmapviewer;

import io.github.makbn.meemmapviewer.interfaces.ICoordinate;

import java.awt.*;
import java.awt.geom.Path2D;
import java.util.List;

public class MapPolyLine extends MapPolygonImpl {
    public MapPolyLine(List<? extends ICoordinate> points) {
        super(null, null, points);
    }

    public MapPolyLine(Layer layer, List<? extends ICoordinate> points) {
        super(layer, null, points);
    }

    @Override
    public void paint(Graphics g, List<Point> points) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        Path2D path = buildPath(points);
        g2d.draw(path);
        g2d.dispose();
    }

    private Path2D buildPath(List<Point> points) {
        Path2D path = new Path2D.Double();
        if (points != null && points.size() > 0) {
            Point firstPoint = points.get(0);
            path.moveTo(firstPoint.getX(), firstPoint.getY());
            for (Point p : points) {
                path.lineTo(p.getX(), p.getY());
            }
        }
        return path;
    }
}