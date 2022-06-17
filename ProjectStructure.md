# Proposed project structure:
Main.java: the application <br>
package view: contains view with multiple FXML files <br>
package controller: contains controller with respect to each FXML files. <br>
package model: contain data object(cell) <br>

version JAVA SE 17 <br>
Javafx version: 18.0.1 <br>

## GUI work:
The application will contain:
<ul>
 <li> Main Screen: application title and 4 buttons: prokaryotic, eukaryotic, help menu, quit. </li>
 <li> Prokaryotic: </li>
<ul>
 <li> Details in cell component and explain the function: use image for simplicity. </li>
 <li> Button to investigate amitosis: switch to new amitosis screen. </li>
 <li> Button: back to the main menu. </li>
 </ul>
 <li> Eukaryotic: Similar to Prokaryotic, but with 2 buttons are mitosis and meisosis. </li>
 <li> Help menu:  shows the basic usage and aim of the application ? </li>
 <li> Amitosis, Meiosis, Mitosis screen: in thinking progress ... </li>
</ul> 
Current work: implement above by FXML file and controller for each fxml. Try to use inheritance between controllers if possible. Skip amitosis, meisosis, mitosis for now.
