import java.util.Scanner;
public abstract class HillStation {
    public abstract void location();
    public abstract void famousFor();
}

class Manali extends HillStation {
    @Override
    public void location() {
        System.out.println("Manali is a town, near Kullu town in Kullu district in the Indian state of Himachal Pradesh. It is situated in the northern end of the Kullu Valley.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is synonymous streams and birdsong, forests and orchards and grandees of snow-capped mountains.");
    }
}

class Mussoorie extends HillStation {
    @Override
    public void location() {
        System.out.println("Mussoorie is a hill station in the Dehradun district of the state of Uttarakhand in northern India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is also a Gateway to the “Gangotri” and the “Yamunotri” shrines. Mussoorie, the queen of hill stations, is famous for its scenic beauty, good social life and entertainment.");
    }
}

class Gulmarg extends HillStation {
    @Override
    public void location() {
        System.out.println("Gulmarg is a town in the Baramulla district of Jammu and Kashmir, India. It's located in the Pir Panjal Range of the Western Himalayas.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg has attracted millions of tourists throughout its existence with the scenic beauty of the Himalayan Mountains in the back drop.");
    }
}

public class Test {
    public static void main(String[] args) {
        HillStation hillStation;

        hillStation = new Manali();
        System.out.println("The reference: " + hillStation);
        hillStation.location();
        hillStation.famousFor();

        System.out.println();
        hillStation = new Mussoorie();
        System.out.println("The reference: " + hillStation);
        hillStation.location();
        hillStation.famousFor();

        System.out.println();
        hillStation = new Gulmarg();
        System.out.println("The reference: " + hillStation);
        hillStation.location();
        hillStation.famousFor();
    }
}