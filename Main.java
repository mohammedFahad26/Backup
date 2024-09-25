//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // CREATE 3 OBJECTS FOR BIRD CLASS

        BIRD BIRD1 = new BIRD("PIGEON",11,true);
        BIRD BIRD2 = new BIRD("SPARROW",9,true);
        BIRD BIRD3 = new BIRD("PARROT",8,true);

        // CALL METHOD TO EXECUTE THE BEHAVIOR OF AN OBJECT

        BIRD1.fly();
        BIRD1.eat();


        BIRD2.fly();
        BIRD2.eat();

        BIRD3.fly();
        BIRD3.eat();

        // CREATE 3 OBJECTS FOR BIRD CLASS

        PowerRangers Pr1 = new PowerRangers("RED",true,"GUN");
        PowerRangers Pr2 = new PowerRangers("BLUE",true,"SWORD");
        PowerRangers Pr3 = new PowerRangers("YELLOW",true,"ARROW");

        // CALL METHOD TO EXECUTE THE BEHAVIOR OF AN OBJECT
        Pr1.spin();
        Pr1.jump();
        Pr1.punch();

        Pr2.spin();
        Pr2.jump();
        Pr2.punch();

        Pr3.spin();
        Pr3.jump();
        Pr3.punch();
        
    }

}