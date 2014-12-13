Paladins-2014-Griefcase
=======================

Team Cold Logic's fork of the Paladins' code. Current portions of interest are the rpivision

Communication may be imporved with [java.io] (http://robotics.francisparker.org/javadoc/java/io/package-summary.html). This would require to have RPi [B/B+] (http://www.raspberrypi.org/products/model-b-plus/). It would also be much more effecient to route it through the RPi camera module, rather than the network. The difficult part would be in translating the data efficiently between the cRIO/RoboRIO and the RPi.

The current alternative, since it is only transferring a boolean, would be to use the PWM interface, sending full or no voltage to the Digital Sidecar/RoboRIO. This would require the least work, but have the most potential for error, as these interfaces require adaptation that may not be entirely stable.
