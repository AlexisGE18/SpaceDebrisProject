import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class readFile extends Main {
    public String[] values;
    public String line = "";
    public String path = "C:\\Users\\edwar\\Downloads\\rso_metrics.csv";
    public BufferedReader br;

    public readFile() {
    }

    public void readTheDocumentScientist() {
        Scientist readScientist = new Scientist();
        readScientist.readTheDocumentScientist();

    }

    public void readTheDebris() {

        Debris userDebris = new Debris();
        userDebris.readTheDebris();

    }

    public void readTheFile(){

        

    }

    public void readThePayload() {
        try {
            br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                values = line.split(",");
                if (values[5].equalsIgnoreCase("PAYLOAD")) {
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

    public void readTheUnknown() {
        try {
            br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                values = line.split(",");
                if (values[5].equalsIgnoreCase("UNKNOWN")) {
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

    public void readLeo() {
        try {
            br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                values = line.split(",");
                if (values[4].equalsIgnoreCase("LEO")) {
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


    public void userPresent(){
        int i = 1;

        while(i != 0) {

            //Need to have a while loop here so that the user can go back into the menu
            //if they choose "back"
            System.out.println("Please enter the type of user you are ");

            System.out.println("Scientist");
            System.out.println("Space Agency Representative");
            System.out.println("Policymaker");
            System.out.println("Administrator");
            System.out.println("Exit");

            Scanner userIn = new Scanner(System.in);
            String userType = userIn.nextLine();


            if(userType.equalsIgnoreCase("Exit")){
                i = 0;
            }

            if (userType.equalsIgnoreCase("Scientist")) {
                Scientist userScientist = new Scientist();
                userScientist.classScientist();

                Scanner userOpt = new Scanner(System.in);
                String userOpt1 = userOpt.nextLine();


                switch(userOpt1){
                    //Case 1
                    case "Track Object in Space":
                        Scientist newScientist = new Scientist();
                        newScientist.trackObjects();
                        break;


                    //Case 2
                    case "Assess Orbit Status":
                        /*Scientist orbitScientist = new Scientist();
                        orbitScientist.assessOrbit();*/
                        System.out.println("Choose one of the following options");
                        System.out.println("Track Objects in LEO");
                        System.out.println("Asses if debris is still in orbit");

                        Scanner orbStatus = new Scanner(System.in);
                        String userOrb = orbStatus.nextLine();

                        if(userOrb.equalsIgnoreCase("Track Objects in LEO")){
                            readFile leoObj = new readFile();
                            leoObj.readLeo();
                            LocalDate leoDate = LocalDate.now();
                            System.out.println(leoDate + "Scientist tracked objects in LEO");

                        }
                        if(userOrb.equalsIgnoreCase("Assessing Orbit")){
                            Debris orbAs = new Debris();
                            if(orbAs.assessingOrbit()){
                                orbAs.calculatingOrbitalDrift();
                            }
                        }
                        break;


                    //Case 3
                    case "Back":
                        break;

                }



            }

            if (userType.equalsIgnoreCase("Space Agency Representative")) {
                System.out.println("Which option would you like to use? ");

                System.out.println("Analyse Long-Term Impact");
                System.out.println("Generate Density Reports");
                System.out.println("Back");

                Scanner userSpace = new Scanner(System.in);
                String userSpace1 = userSpace.nextLine();

                switch(userSpace1){

                    //Case 1
                    case "Analyse Long-Term Impact":
                        System.out.println("To be implemented");
                        //Case 2
                    case "Generate Density Reports":
                        System.out.println("To be implemented");
                        //Case 3
                    case "Back":
                        userSpace.close();
                }

            }

            if (userType.equalsIgnoreCase("Policymaker")) {
                System.out.println("Which option would you like to use ?");

                System.out.println("Review Reports on Debris Impact");
                System.out.println("Assess Risk Levels for Future Space Missions");
                System.out.println("Back");


                Scanner userPol = new Scanner(System.in);
                String userPol1 = userPol.nextLine();

                switch(userPol1){
                    //Case 1
                    case "Review Reports on Debris Impact":
                        System.out.println("To be implemented");
                        //Case 2
                    case "Assess Risk levels for Future Space Missions":
                        System.out.println("To be implemented");
                        //Case 3
                    case "Back":
                        userPol.close();
                }

            }

            if (userType.equalsIgnoreCase("Administrator ")) {
                System.out.println("Which option would you like to use ?");

                System.out.println("Create User");
                System.out.println("Manage User");
                System.out.println("Delete User");
                System.out.println("Back");



                Scanner userAdmin = new Scanner(System.in);
                String userAdmin1 = userAdmin.nextLine();

                switch(userAdmin1){
                    //Case 1
                    case "Create User":
                        User newUser = new User();
                        System.out.println("Age : " + "Name: " + "User Type: ");
                        Scanner adminUser = new Scanner(System.in);
                        int userAge = adminUser.nextInt();
                        String userName = adminUser.nextLine();
                        String userJob = adminUser.nextLine();
                        newUser.createUser(userAge, userName, userJob);
                        //Case 2
                    case "Manage User":
                        User manageUser = new User();
                        System.out.println("Enter new updated information of user. (Age, Name, User Type)");
                        Scanner manageUse = new Scanner(System.in);
                        int newAge = manageUse.nextInt();
                        String newName = manageUse.nextLine();
                        String newJob = manageUse.nextLine();
                        manageUser.manageUser(newAge, newName, newJob);
                        //Case 3
                    case "Delete User":
                        System.out.println("To be implemented");
                        //Case 4
                    case "Back":
                        userAdmin.close();


                }

                if (userAdmin1.equalsIgnoreCase("Create User")) {

                    User newUser = new User();
                    System.out.println("Age : " + "Name: " + "User Type: ");
                    Scanner adminUser = new Scanner(System.in);
                    int userAge = adminUser.nextInt();
                    String userName = adminUser.nextLine();
                    String userJob = adminUser.nextLine();
                    newUser.createUser(userAge, userName, userJob);

                }
                if (userAdmin1.equalsIgnoreCase("Manage User")) {
                    User manageUser = new User();
                    System.out.println("Enter new updated information of user. (Age, Name, User Type)");
                    Scanner manageUse = new Scanner(System.in);
                    int newAge = manageUse.nextInt();
                    String newName = manageUse.nextLine();
                    String newJob = manageUse.nextLine();
                    manageUser.manageUser(newAge, newName, newJob);

                }

                if (userAdmin1.equalsIgnoreCase("Back")) {
                    userAdmin.close();
                }

            }
        }


    }



}
