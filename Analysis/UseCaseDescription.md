| Name: | Traffic Control Light|
|-|-|
| Actor: | Traffic Control Light |
| Description: | Traffic light switch |
| Pre-condition: | Traffic light is RED |
| Main success scenario: | 1.Traffic light wants to change to GREEN<br>2. System switches light to GREEN <br>3. Traffic light wants to change to RED<br>4.System switches light to RED|
| Result: | Traffic light switches states.|
| Extensions: | 2.1. System applies nation standard (GER standard RED to RED/YELLOW to GREEN)<br> 4.1. System applies nation standard (GER/NL standard:GREEN to YELLOW to RED)<br>


<br><br>
| Name: | Pedestrian Light switch |
|-|-|
| Actor: | Pedestrian Control Light|
| Description: | Pedestrian Light wants to complete a light switch sequence  |
| Pre-condition: | 1. The Pedestrian light shows RED|
| Main success scenario: | 1.The Pedestrian light wants to change to GREEN <br>2.The system changes the state to GREEN <br>3. The Pedestrian light wants to change to RED <br>4.The system changes the state to RED. |
| Result: | A sequence has been completed |
| Extensions: | 4.1 The system changes the state to GREEN BLINKING.<br> 4.2 The system changes the state to RED. |
| Exceptions: | - |
