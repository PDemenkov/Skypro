package OOP;

public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Myrzik");
        murzik.name = "Myrzik";
        murzik.age =3;
        murzik.meow();

        Cat begemot = new Cat("Begemot",-6);
//        begemot.age = 1;
//                begemot.name = "begemot";
                begemot.meow();
        Cat ivi = new Cat("ivi");
        ivi.meow();
                murzik.friends=null;

        System.out.println("Y kota " + murzik.name + " " + murzik.getFriends().length + " druzei");
    murzik.addFriend(begemot);
    murzik.addFriend(ivi);
        System.out.println("Y kota " + murzik.name + " " + murzik.getFriends().length + " druzei");
murzik.friends[0].meow();
    }
}
