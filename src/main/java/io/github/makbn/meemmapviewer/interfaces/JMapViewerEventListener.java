// License: GPL. For details, see Readme.txt file.
package io.github.makbn.meemmapviewer.interfaces;

import java.util.EventListener;

import io.github.makbn.meemmapviewer.events.JMVCommandEvent;

/**
 * Must be implemented for processing commands while user
 * interacts with map viewer.
 *
 * @author Jason Huntley
 *
 */
public interface JMapViewerEventListener extends EventListener {
    void processCommand(JMVCommandEvent command);
}
