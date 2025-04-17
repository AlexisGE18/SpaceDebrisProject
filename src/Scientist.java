import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Scientist extends readFile{

    //Constructor
    public Scientist(){

    }

    /*public void assessOrbit(){
        System.out.println("Choose one of the following options");
        System.out.println("Track Objects in LEO");
        System.out.println("Asses if debris is still in orbit");

        Scanner orbStatus = new Scanner(System.in);
        String userOrb = orbStatus.nextLine();

        if(userOrb.equalsIgnoreCase("Track Objects in LEO")){
            readFile leoObj = new readFile();
            leoObj.readLeo();
        }
        if(userOrb.equalsIgnoreCase("Assess Orbit")){
            Scientist orbScientist = new Scientist();
            if(orbScientist.assessingOrbit()){
                orbScientist.calculatingOrbitalDrift();
            }
        }
    }*/

    public void classScientist (){
        System.out.println("Which option would you like to use ?");

        System.out.println("Track Object in Space");
        System.out.println("Assess Orbit Status");
        System.out.println("Back");

    }
    public void readTheDocumentScientist() {
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                values = line.split(",");
                if (values[5].equalsIgnoreCase("ROCKET BODY")) {
                    System.out.println(values[0] + values[2]
                            + values[3] + values[5] + values[6]
                            + values[7] + values[9] + values[8]
                            + values[10] + values[18]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Given");
        }
    }

    public void trackObjects(){
        System.out.println("Choose one of the following options");
        System.out.println("Rocket Body");
        System.out.println("Debris");
        System.out.println("Payload");
        System.out.println("Unknown");

        Scanner tosUser = new Scanner(System.in);
        String tosUser1 = tosUser.nextLine();

        if(tosUser1.equalsIgnoreCase("Rocket Body")){
            readFile scientistObj = new readFile();
            scientistObj.readTheDocumentScientist();
            //Keep track of time
            LocalDate rockObj = LocalDate.now();
            System.out.println(rockObj + " Scientist accessed the rocket body. ");
        }else if(tosUser1.equalsIgnoreCase("Debris")){
            readFile debrisObj = new readFile();
            debrisObj.readTheDebris();

            //Keep track of time
            LocalDate debObj = LocalDate.now();
            System.out.println(debObj + " Scientist accessed the debris object. ");
        }else if(tosUser1.equalsIgnoreCase("Payload")){
            readFile payloadObj = new readFile();
            payloadObj.readThePayload();

            LocalDate payObj = LocalDate.now();
            System.out.println(payObj + " Scientist accessed the payload object. ");
        }else if(tosUser1.equalsIgnoreCase("Unknown")){
            readFile unknownObj = new readFile();
            unknownObj.readTheUnknown();

            LocalDate unObj = LocalDate.now();
            System.out.println(unObj + " Scientist accessed the unknown object. ");
        }else{
            System.out.println("Spelled Wrong");
        }

    }


}
