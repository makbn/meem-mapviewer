// License: GPL. For details, see Readme.txt file.
package io.github.makbn.meemmapviewer.interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;

import io.github.makbn.meemmapviewer.Layer;
import io.github.makbn.meemmapviewer.Style;

public interface MapObject {

    Layer getLayer();

    void setLayer(Layer layer);

    Style getStyle();

    Style getStyleAssigned();

    Color getColor();

    Color getBackColor();

    Stroke getStroke();

    Font getFont();

    String getName();

    boolean isVisible();
}
