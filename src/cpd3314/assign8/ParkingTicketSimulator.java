/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */

package cpd3314.assign8;

/* Exercise #8 - Parking Ticket Simulator
 * ======================================
 * For this assignment, you will design a set of classes that work together to 
 * simulate a police officer issuing a parking ticket. You should design the 
 * following classes (provided as internal classes below):
 * - The ParkedCar Class: This class should simulate a parked car. The class's 
 *   responsibilities are as follows:
 *   * To know the car's make, model, color, license number, and the number of 
 *     minutes that the car has been parked.
 * - The ParkingMeter Class: This class should simulate a parking meter. The 
 *   class's only responsibility is as follows:
 *   * To know the number of minutes of parking time that has been purchased.
 * - The ParkingTicket Class: This class should simulate a parking ticket. The 
 *   class's responsibilities are as follows:
 *   * To report the make, model, color, and license number of the illegally 
 *     parked car.
 *   * To report the amount of the fine, which is $25 for the first hour or part 
 *     of an hour that the car is illegally parked, plus $10 for every 
 *     additional hour or part of an hour that the car is illegally parked.
 *   * To report the name and badge number of the police officer issuing the 
 *     ticket.
 * - The PoliceOfficer Class: This class should simulate a police officer inspecting parked cars. The class's responsibilities are as follows:
 *   * To know the police officer's name and badge number.
 *   * To examine a ParkedCar object and a ParkingMeter object, and determine 
 *     whether the car's time has expired.
 *   * To issue a parking ticket (generate a ParkingTicket object) if the car's 
 *     time has expired.
 *
 * A sample program has been provided that uses these tools to ticket a car.
 *
 * - Gaddis pg. 558-9
 */
/**
 * @author <ENTER YOUR NAME HERE>
 */
public class ParkingTicketSimulator {
    /**
     * Should have:
     * - no-arg constructor
     * - getters and setters for:
     *   * make (String)
     *   * model (String)
     *   * colour (String)
     *   * licenseNumber (String)
     *   * minutesParked (int)
     */
    public class ParkedCar {
        
    }
    
    /**
     * Should have: 
     * - no-arg constructor
     * - getters and setters for:
     *   * minutesPurchased (int)
     */
    public class ParkingMeter {
        
    }
    
    /**
     * Should have: 
     * - no-arg constructor
     * - getters and setters for: 
     *   * parkedCar (ParkedCar)
     *   * parkingMeter (ParkingMeter)
     *   * policeOfficer (PoliceOfficer)
     * - toString method that accepts no arguments and returns a string that 
     *   holds a report of the following YAML pattern:
     * 
     *   License Number: xxxxxx
     *   Make: xxxxxx
     *   Model: xxxxxx
     *   Colour: xxxxxx
     *   Fine: $xxx.xx
     *   Officer: xxxxxx
     *   Badge: xxxxx
     */
    public class ParkingTicket {
        
    }
    
    /**
     * Should have: 
     * - no-arg constructor
     * - getters and setters for:
     *   * name (String)
     *   * badge (String)
     * - checkIllegallyParked method that accepts a ParkedCar object, and a 
     *   ParkingMeter object, and returns a boolean
     * - writeTicket method that accepts a ParkedCar and a ParkingMeter and 
     *   returns a ParkingTicket object
     */
    public class PoliceOfficer {
        
    }
    
    /**
     * When uncommented, the following code walks through a sample interaction 
     * with an officer and a parked car
     */
    public void simulate() {
//        // Establishes the Parked Car
//        ParkedCar car = new ParkedCar();
//        car.setMake("Buick");
//        car.setModel("LeSabre");
//        car.setColour("Silver");
//        car.setLicenseNumber("ABC 123");
//        car.setMinutesParked(134);
//        
//        // Establishes the Parking Meter
//        ParkingMeter meter = new ParkingMeter();
//        meter.setMinutesPurchased(15);
//        
//        // Establishes the Officer on the Scene
//        PoliceOfficer officer = new PoliceOfficer();
//        officer.setName("Jim Lahey");
//        officer.setBadge("AB12345");
//        
//        // The Interaction b/w Officer and Parked Car
//        if (officer.checkIllegallyParked(car, meter)) {
//            ParkingTicket ticket = officer.writeTicket(car, meter);
//            System.out.println("Ticket Generated:");
//            System.out.println(ticket);                    
//        }
//        else {
//            System.out.println("No Ticket Needed");
//        }
    }
}
