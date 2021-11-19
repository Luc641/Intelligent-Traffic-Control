# Analysis ITC



<h1>User Stories</h1>

## Pedestrian Light User

<b><i>As a pedestrian light I want to:</i></b>

* Switch signals from red to green and back to red as default behavior, to help pedestrians safely cross the street.
* Switching signals can be extended to red to green to green-blinking and back to red.

## Traffic Light User

<b><i>As a traffic light I want to:</i></b>

* Switch signals from red to green and back to red as default behavior, in order to regulate traffic.
* Switching Signals can be extended according to specific nation standards (for ex.: German standard: Red->Red/Yellow->Green->Yellow->Red)

<h1>Use Case Description</h1>

| Name: | Traffic Control Light|
|-|-|
| Actor: | Traffic Control Light |
| Description: | Traffic Light wants to complete a light switch sequence |
| Pre-condition: | Traffic light shows RED |
| Main success scenario: | 1. Traffic light wants to change to GREEN<br>2. System chnages the state to GREEN <br>3. Traffic light wants to change to RED<br>4. System changes the state to RED|
| Result: | Traffic Control Light completed a light switch sequence |
| Extensions: | 2.1 System applies nation standard (f. ex.: GER standard RED to RED/YELLOW to GREEN)<br> 4.1 System applies nation standard (GER/NL standard:GREEN to YELLOW to RED)<br>
| Exceptions: | - |

<br>

| Name: | Pedestrian Light switch |
|-|-|
| Actor: | Pedestrian Control Light|
| Description: | Pedestrian Light wants to complete a light switch sequence  |
| Pre-condition: | 1. The Pedestrian light shows RED|
| Main success scenario: | 1. The Pedestrian light wants to change to GREEN <br>2. The system changes the state to GREEN <br>3. The Pedestrian light wants to change to RED <br>4. The system changes the state to RED. |
| Result: | Pedestrian Control Light completed a light switch sequence |
| Extensions: | 4.1 The system changes the state to GREEN BLINKING.<br> 4.2 The system changes the state to RED. |
| Exceptions: | - |

<h1>Use Case Diagram</h1>
<img src = https://github.com/FontysVenlo/intelligent-traffic-control-prj3-g13-itc/blob/main/Analysis/UseCaseDiagram/PRJ3-UseCaseDiagram-TCL.svg>
