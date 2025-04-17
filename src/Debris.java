import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Debris extends readFile{

    int [] calcDrift;

    public Debris(){

    }

    private int conjunctionCount;

    public void setConjunctionCount(int conjunctionCount){
        this.conjunctionCount = conjunctionCount;
    }
    public int getConjunctionCount(){
        return this.conjunctionCount;
    }
    public void readTheDebris() {
        try {
            br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                values = line.split(",");
                if (values[5].equalsIgnoreCase("DEBRIS")) {
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
    public boolean assessingOrbit() {
        int i = 0;
        //Checking orbit type
        try {
            br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                values = line.split(",");
                //Checking if it matches the description of whether the object is in orbit
                if(values[5].equalsIgnoreCase("DEBRIS")) {
                    if (values[4].equalsIgnoreCase("LEO") || values[4].equalsIgnoreCase("MEO") ||
                            values[4].equalsIgnoreCase("GEO")) {
                        int longitude = Integer.parseInt(values[8]);

                        if (longitude > 0) {
                            int daysOld = Integer.parseInt(values[18]);
                            if (daysOld > 15000) {
                                int conjunctionCount = Integer.parseInt(values[19]);
                                calcDrift[i] = conjunctionCount;
                                return conjunctionCount >= 1;
                            }
                        }

                    }
                }
                i++;
            }

        }catch(IOException e){
            System.out.println("Error Given");
        }
        return false;
    }

    public void calculatingOrbitalDrift(){
        int orbitalDrift;
        int i = 0;
        try {
            while ((line = br.readLine()) != null) {
                //Calculating Orbital Drift
                orbitalDrift = Integer.parseInt(values[8]) - Integer.parseInt(values[9]);
                if(orbitalDrift > 50){
                    String highRisk = "The debris is high risk";
                    calcDrift[i] = Integer.parseInt(highRisk);
                    System.out.println(highRisk);
                }else if(orbitalDrift > 10){
                    System.out.println("The debris is moderate risk. ");
                }else {
                    System.out.println("The debris is low risk. ");
                }
                i++;
            }
        }catch(IOException e){
            System.out.println("Error Given");
        }

    }
}
