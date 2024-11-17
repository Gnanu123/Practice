Overview
This Smart Home System Design Project models a sophisticated automated home environment, incorporating a variety of sensors, control devices, and integrated external systems. The project involves designing a comprehensive software architecture to manage key functionalities such as temperature regulation, home security, water leak detection, fire alarms, and energy monitoring.


Key Features
Temperature Control:

Automatically adjusts the temperature using thermostat inputs.
Controls AC/Heater based on user-defined preferences for comfortable and safe temperature levels.
Monitors temperature changes and logs adjustments for analysis.
Home Security:

Utilizes motion sensors and cameras to detect intrusions.
Sends alerts to residents and authorities (police station) when suspicious activity is detected.
Includes an alarm system integrated with a smartphone interface for real-time notifications.
Water Leak Detection:

Monitors potential water leaks using specialized sensors.
Sends notifications to the resident’s smartphone and logs the incident for maintenance.
Fire Detection:

Detects smoke or fire through smoke detectors.
Triggers fire alarms and activates sprinklers if the smoke level exceeds a predefined threshold.
Notifies the fire station and logs the event for future reference.
Energy Usage Monitoring:

Records and tracks electricity consumption using blockchain technology.
Integrates with external services like the electricity corporation for bill verification.
Provides a comprehensive view of electricity usage and applicable discounts through a user interface.
System Architecture
The Smart Home System is designed using a modular architecture comprising the following components:

Input/Output Subsystems:

Input devices: Thermostat, motion sensors, auto mileage sensor, water leak sensor, smoke detector.
Output devices: AC/Heater, lights, fire alarm, sprinkler, smartphone interface.
Control Subsystems:

State-dependent control: Manages home automation based on real-time data from sensors.
Service subsystem: Integrates with external services like police and fire stations.
Database and Data Management:

Uses both relational database wrappers and blockchain ledgers for data storage and integrity.
Manages various entity classes such as time, temperature, CO levels, gas amount, and electricity usage.
Main Use Cases
Control Temperature:

Adjusts temperature based on current and desired levels using a thermostat.
Provides energy-efficient operation by automatically turning on/off AC or heater.
Monitor Water Leak:

Detects water leaks using sensors and sends alerts to the user’s smartphone.
Records the time and place of the leak for maintenance tracking.
Detect Fire:

Uses smoke detectors to monitor air quality and activate fire alarms and sprinklers.
Notifies residents and the fire station, ensuring prompt emergency response.
Home Security Monitoring:

Analyzes camera footage for unusual activities.
Activates alarms and sends notifications to the user’s smartphone and the police station if a breach is detected.
Electricity Usage and Billing:

Tracks energy consumption and calculates bills using a blockchain ledger.
Allows users to view electricity usage, applicable discounts, and billing information through a user interface.
