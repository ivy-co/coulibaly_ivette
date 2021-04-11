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

import org.testfx.robot.*;
import org.testfx.service.finder.*;
import org.testfx.service.support.*;


/**
 * Stores the following objects:
 * <ul>
 *     <li>a {@link WindowFinder}</li>
 *     <li>a {@link NodeFinder}</li>
 *     <li>a {@link BaseRobot}</li>
 *     <li>{@link CaptureSupport}</li>
 * </ul>
 */
public class FxServiceContext {

    private final WindowFinder windowFinder = new WindowFinderImpl();
    private final NodeFinder nodeFinder = new NodeFinderImpl(windowFinder);
    private final BaseRobot baseRobot = new BaseRobotImpl();
    private final CaptureSupport captureSupport = new CaptureSupportImpl(baseRobot);

    public WindowFinder getWindowFinder() {
        return windowFinder;
    }
    /**
     * return this node finfer
     * @return this node finfer
     */
    public NodeFinder getNodeFinder() {
        return nodeFinder;
    }
    /**
     * return this robot base
     * @return this base robot
     */
    public BaseRobot getBaseRobot() {
        return baseRobot;
    }
    /**
     * return this capture support
     * @return  this capture support
     */
    public CaptureSupport getCaptureSupport() {
        return captureSupport;
    }

}
