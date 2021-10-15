| Name: | Traffic Control Light|
|-|-|
| Actor: | Traffic Control Light |
| Description: | -|
| Pre-condition: | - |
| Main success scenario: | 1.Sales officer ask the system for available price reductions for the registered flight.<br>2.The system outputs the available discounts to choose from, „static discount” or ”dynamic discount”<br>3.The sales officer selects which discount is available<br>4.The system add the discount to the registered flight.<br>5.The system informs the sales officer that the price reduction was made |
| Result: | The sales officer enabled the price reduction successfully for the registered flight. |
| Extensions: | 3a. the sales officer selected  ”static discounts” <br>    1.The system output available price reductions.<br>    2.Sales officer selects the available discount. Returns to step 4.<br><br>3b. the sales officer selected  ”dynamic discounts”<br>    1.The system output available price reductions.<br>    2.Sales officer selects the available discount. Returns to step 4. |
| Exceptions: | 1.System output : ”No discounts available ”.<br>  1.1 Use case ends here. |



<br><br>
| Name: | Pedestrian Light switch |
|-|-|
| Actor: | Pedestrian Control Light|
| Description: | Pedestrian Light wants to switch from RED to GREEN to RED |
| Pre-condition: | 1. The Pedestrian light shows RED|
| Main success scenario: | 1.The Pedestrian light wants to change to GREEN <br>2.The system changes the state to GREEN <br>3. The Pedestrian light wants to change to RED <br>4.The system changes the state to RED. |
| Result: | A sequence has been completed |
| Extensions: | 4.1 The system changes the state to GREEN BLINKING.<br> 5. The system changes the state to RED. |
| Exceptions: | - |
