/*
 * Copyright 2013-2014 SmartBear Software
 * Copyright 2014-2020 The TestFX Contributors
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the
 * European Commission - subsequent versions of the EUPL (the "Licence"); You may
 * not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 * http://ec.europa.eu/idabc/eupl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the Licence for the
 * specific language governing permissions and limitations under the Licence.
 */
package org.testfx.api;

import javafx.geometry.Pos;

import org.testfx.robot.*;
import org.testfx.service.*;

/**
 * Stores the robot implementations, the window and node finders, position calculators, and capture support for
 * {@link FxRobot}.
 */
public class FxRobotContext {

    private final WindowFinder windowFinder;
    private final NodeFinder nodeFinder;
    private final BoundsLocator boundsLocator;
    private final PointLocator pointLocator;
    private final BaseRobot baseRobot;
    private final MouseRobot mouseRobot;
    private final KeyboardRobot keyboardRobot;
    private final MoveRobot moveRobot;
    private final SleepRobot sleepRobot;
    private final ClickRobot clickRobot;
    private final DragRobot dragRobot;
    private final ScrollRobot scrollRobot;
    private final TypeRobot typeRobot;
    private final WriteRobot writeRobot;
    private final CaptureSupport captureSupport;
    private Pos pointPosition;

    public FxRobotContext() {
        windowFinder = FxService.serviceContext().getWindowFinder();
        nodeFinder = FxService.serviceContext().getNodeFinder();
        boundsLocator = new BoundsLocatorImpl();
        pointLocator = new PointLocatorImpl(boundsLocator);
        baseRobot = new BaseRobotImpl();
        keyboardRobot = new KeyboardRobotImpl(baseRobot);
        mouseRobot = new MouseRobotImpl(baseRobot);
        sleepRobot = new SleepRobotImpl();
        typeRobot = new TypeRobotImpl(keyboardRobot, sleepRobot);
        writeRobot = new WriteRobotImpl(baseRobot, sleepRobot, windowFinder);
        moveRobot = new MoveRobotImpl(baseRobot, mouseRobot, sleepRobot);
        clickRobot = new ClickRobotImpl(mouseRobot, moveRobot, sleepRobot);
        dragRobot = new DragRobotImpl(mouseRobot, moveRobot);
        scrollRobot = new ScrollRobotImpl(mouseRobot);
        captureSupport = new CaptureSupportImpl(baseRobot);
        pointPosition = Pos.CENTER;
    }
    /**
     * return this window finder
     * @return this window finder
     */
    public WindowFinder getWindowFinder() {
        return windowFinder;
    }
    /**
     * return this node finder
     * @return this node finder 
     */
    public NodeFinder getNodeFinder() {
        return nodeFinder;
    }
    /**
     * return this  point position
     * @return this point position
     */
    public Pos getPointPosition() {
        return pointPosition;
    }
    /**
     * replaces this point position by an other 
     * @param pointPosition  the position that replaces this position
     */
    public void setPointPosition(Pos pointPosition) {
        this.pointPosition = pointPosition;
    }
    /**
     * return this bounds locator
     * @return this bounds locator
     */
    public BoundsLocator getBoundsLocator() {
        return boundsLocator;
    }
    /**
     * return this point locator 
     * @return this point locator 
     */
    public PointLocator getPointLocator() {
        return pointLocator;
    }
    /**
     * return this robot base
     * @return this base robot
     */
    public BaseRobot getBaseRobot() {
        return baseRobot;
    }
    /**
     * return this mousse  robot
     * @return this mousse robot
     */
    public MouseRobot getMouseRobot() {
        return mouseRobot;
    }
    /**
     * return this robot board key 
     * @return this robot board key 
     */
    public KeyboardRobot getKeyboardRobot() {
        return keyboardRobot;
    }
    /**
     * return this robot move
     * @return this robot move
     */
    public MoveRobot getMoveRobot() {
        return moveRobot;
    }
    /**
     * return this robot spleep
     * @return this robot sleep
     */
    public SleepRobot getSleepRobot() {
        return sleepRobot;
    }
    /**
     * return this robot click
     * @return this robot click 
     */
    public ClickRobot getClickRobot() {
        return clickRobot;
    }
    /**
     * return this robot drag
     * @return this this robot drag
     */
    public DragRobot getDragRobot() {
        return dragRobot;
    }
    /**
     * return this robot scroll
     * @return this robot srcoll 
     */
    public ScrollRobot getScrollRobot() {
        return scrollRobot;
    }
    /**
     * return this robot type
     * @return this robot type
     */
    public TypeRobot getTypeRobot() {
        return typeRobot;
    }
    /**
     * return this write robot
     * @return this robot write
     */
    public WriteRobot getWriteRobot() {
        return writeRobot;
    }
    /**
     * return this support capture
     * @return this capture support
     */
    public CaptureSupport getCaptureSupport() {
        return captureSupport;
    }

}
