== Club Simulation ==

Welcome to the Club Simulation repository! This repository contains a Java program that simulates a club scenario. The program simulates the behavior of clubgoers inside a club, their movement, interactions, and various activities. Below, you'll find information about the program, its features, and how to use it.

== Club Simulation Program ==

== Description ==

The ClubSimulation program simulates the behavior of clubgoers in a virtual club. It uses threads to represent individual clubgoers and models their movement, actions, and interactions within the club environment. The simulation includes features such as entering the club, heading to the bar, dancing, wandering, and leaving the club.

 == Features ==
 
    • Multi-threaded simulation of clubgoers' behavior
    • Representation of club environment as a grid of blocks
    • Simulated actions including entering, heading to the bar, dancing, and leaving
    • Display of the simulation using a graphical user interface (GUI)
    • Control buttons for starting, pausing, and quitting the simulation
    
== Usage ==

    1. Compile the program: Use a Java compiler or the Makefile to compile the ClubSimulation program.
    2. Run the program: Execute the compiled Java program to start the club simulation.
    3. GUI Interaction: The graphical user interface (GUI) displays the club environment and clubgoers' activities. You can use the "Start" button to initiate the simulation. The "Pause" button allows you to pause and resume the simulation. The "Quit" button terminates the simulation and closes the GUI.
    4. Command-Line Arguments (Optional): You can provide command-line arguments to customize the simulation. The available arguments are the total number of clubgoers, the number of grid cells in the X and Y directions, and the maximum number of people allowed in the club.
    
Example usage:
java ClubSimulation [totalClubgoers] [gridX] [gridY] [maxPeople]

== Note ==

    • The program includes a graphical display of the simulation using Swing components.
    • The simulation showcases different behaviors of clubgoers, such as dancing, wandering, and heading to the bar.
    • Threads are used to simulate individual clubgoers and their actions.
    • The program is designed to provide an illustrative example of multi-threading and simulation concepts.
    
== Credits == 

This program was developed by M. M. Kuttel (mkuttel@gmail.com).

