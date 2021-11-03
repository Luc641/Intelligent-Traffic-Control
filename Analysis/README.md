
# Use Cases ITC

## Pedestrian Light User
Wants to be able to switch from RED to GREEN to RED as a default behavior and can be extended <br>
->(RED to GREEN-to-GREEN BLINKING to RED) <br>

## Traffic Light User
Wants to change from RED to GREEN and from GREEN to RED with the specific nation standards included <br>
-> (German standard: RED to RED/YELLOW to GREEN to YELLOW to RED additional arrows for the control light) <br>
-> (Dutch standard: RED to GREEN to YELLOW to RED)



# Use Case Description

| Name: | Traffic Control Light|
|-|-|
| Actor: | Traffic Control Light |
| Description: | Traffic light switch |
| Pre-condition: | Traffic light is RED |
| Main success scenario: | 1. Traffic light wants to change to GREEN<br>2. System switches light to GREEN <br>3. Traffic light wants to change to RED<br>4. System switches light to RED|
| Result: | Traffic light switches states|
| Extensions: | 2.1 System applies nation standard (GER standard RED to RED/YELLOW to GREEN)<br> 4.1 System applies nation standard (GER/NL standard:GREEN to YELLOW to RED)<br>


<br><br>
| Name: | Pedestrian Light switch |
|-|-|
| Actor: | Pedestrian Control Light|
| Description: | Pedestrian Light wants to complete a light switch sequence  |
| Pre-condition: | 1. The Pedestrian light shows RED|
| Main success scenario: | 1. The Pedestrian light wants to change to GREEN <br>2. The system changes the state to GREEN <br>3. The Pedestrian light wants to change to RED <br>4. The system changes the state to RED. |
| Result: | A sequence has been completed |
| Extensions: | 4.1 The system changes the state to GREEN BLINKING.<br> 4.2 The system changes the state to RED. |
| Exceptions: | - |

<h1>User Stories</h1>

<b><i>As a traffic light I want to:</i></b>

* Switch signals from red to green and back to red, in order to regulate traffic.

<b><i>As a pedestrian light I want to:</i></b>

* Switch signals from red to green and back to red, to help pedestrians safely cross the street.

# Use Case Description
<img src = https://github.com/FontysVenlo/intelligent-traffic-control-prj3-g13-itc/blob/main/Analysis/UseCaseDiagram/PRJ3-UseCaseDiagram-TCL.svg>

## Proposition
<img src = https://github.com/FontysVenlo/intelligent-traffic-control-prj3-g13-itc/blob/main/Analysis/UseCaseDiagram/PRJ3-UseCaseDiagram-TCL-proposition.svg>

[Use Case Diagram Relationships Explained with Examples](https://creately.com/blog/diagrams/use-case-diagram-relationships/ "Title")
