# Proposed project structure:
Main.java: the application
package view: contains view with multiple FXML files
package controller: contains controller with respect to each FXML files.
package model: contain data object(cell)

version JAVA SE 17
Javafx version: 18.0.1

## GUI work:
The application will contain:
- Main Screen: application title and 4 buttons: prokaryotic, eukaryotic, help menu, quit.
- Prokaryotic:
<ul>
+ Details in cell component and explain the function: use image for simplicity
+ Button to investigate amitosis: switch to new amitosis screen.
+ Button: back to the main menu.
 </ul>
- Eukaryotic: Similar to Prokaryotic, but with 2 buttons are mitosis and meisosis.
- Help menu:  shows the basic usage and aim of the application ?
- Amitosis, Meiosis, Mitosis screen: in thinking progress ...

Current work: implement above by FXML file and controller for each fxml. Try to use inheritance between controllers if possible. Skip amitosis, meisosis, mitosis for now.
