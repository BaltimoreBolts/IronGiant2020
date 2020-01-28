/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // To import this elsewhere use import import frc.robot.Constants.OIConstants;
    public static final class OIConstants {
        //These need to be public within the class so they are accessible
        public static final int DRIVER_CONTROLLER = 0;
    }

    public static final class DriveConstants {
        public static final int LEFT_DRIVE_MOTOR = 0;
        public static final int RIGHT_DRIVE_MOTOR = 1;

    }

    // Add controller constant
    public static final class Controller {
        public static final class XBOX {
            public static final int A = 1;
            public static final int B = 2;
            public static final int X = 3;
            public static final int Y = 4;
            public static final int BACK = 7;
            public static final int START = 8;
            
            public static final class BUMPER {
                public static final int LEFT = 5;
                public static final int RIGHT = 6;
            }
            
            // handy boolean conversion
            // if (controller.getPOV() == Controller.DPAD.UP) == true
            public static final class DPAD {
                public static final int UP = 0;
                public static final int UP_RIGHT = 45;
                public static final int RIGHT = 12;
                public static final int DOWN_RIGHT = 135;
                public static final int DOWN = 180;
                public static final int DOWN_LEFT = 225;
                public static final int LEFT = 270;
                public static final int UP_LEFT = 315;
            }
            
            public static final class TRIGGER {
                public static final int LEFT = 2;
                public static final int RIGHT = 3;
            }
            
            public static final class STICK {
                public static final class LEFT {
                    public static final int X = 0;
                    public static final int Y = 1;
                }
                
                public class RIGHT {
                    public static final int X = 4;
                    public static final int Y = 5;
                }
            }
        }



    }


}
