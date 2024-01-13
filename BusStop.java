public class BusStop {

    public static void main(String[] args) {



        // Defining a Bus List to the length - 1 of args
        // Creating a variable to store the intended stop, the last value.

        int[] busList = new int[args.length - 1];
        int intendedStop = Integer.parseInt(args[args.length - 1]);
        int routePosition = 1000;
        


        // Taking all the values from Args BUT the last value
        // And putting them into the Bus List

        for(int i = 0; i < args.length - 1; i++){
            busList[i] = Integer.parseInt(args[i]);
        }



        // Checking all the values of the bus list to the intendedStop to see
        // If the route we want is even on the list

        for(int j = 0; j < busList.length; j++){
            if(intendedStop == busList[j]){
                routePosition = j + 1;
            }
        }

        System.out.println(routePosition);

    }
}
