# Proposed project structure

Main.java: the application
package view: contains view with multiple FXML files
package controller: contains controller with respect to each FXML files.
package model: contain data object (cell)

## GUI work

The application will contain:
Main Screen: application title and 4 buttons: prokaryotic, eukaryotic, help menu, quit.

Prokaryotic:
Details in cell component and explain the function: use image for simplicity.
Button to investigate binary fission: switch to new binary fission screen.
Button: back to the main menu.

Eukaryotic: Similar to Prokaryotic, but with 2 buttons are mitosis and meisosis.
Help menu:  shows the basic usage and aim of the application?
Binary fission, Meiosis, Mitosis screen: in thinking progress ...

Current work: implement above by FXML file and controller for each fxml. Try to use inheritance between controllers if possible. Skip binary fission, meisosis, mitosis for now.
