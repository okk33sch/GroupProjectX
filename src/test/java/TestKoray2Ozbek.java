public class TestKoray2Ozbek {
    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport(String name, int players, boolean teams) {
        this.name = name;
        numOfPlayers = players;
        teamBased = teams;
    }

    public TestKoray2Ozbek(String name, int numOfPlayers, boolean teamBased) {
        this.name = name;
        this.numOfPlayers = numOfPlayers;
        this.teamBased = teamBased;
    }

    public String toString() {
        String msg = "The sport is " + name + " and has " +
                numOfPlayers + " players total ";
        if (teamBased) {
            msg += "divided into teams";
        } else {
            msg += "but there is no teams";
        }
        return msg;
    }

    public static void main(String[] args) {
        TestKoray2Ozbek soccer = new TestKoray2Ozbek("Ahmet", 32, false);
        //soccer.makeSport(true);
        TestKoray2Ozbek soccer2 = new TestKoray2Ozbek("Namik", 23, false);
        System.out.println(soccer);
        System.out.println(soccer2);
        System.out.println("Good night");
    }
}
