public class PowerRangers {

    // CREATE VARIABLES TO STORE THE ATTRIBUTES

    String color;
    boolean has_helmet;
    String weapon;

    // CREATE A CONSTRUCTOR TO BUILD OBJECTS

    public PowerRangers(String color,boolean has_helmet,String weapon){
        this.color = color;
        this.has_helmet = has_helmet;
        this.weapon = weapon;
    }
    // CREATE METHODS
    public void spin(){
        System.out.println("PowerRangers can Spin");

    }
        public void jump(){
            System.out.println("PowerRangers Jumps");
        }

        public void punch(){
            System.out.println("PowerRangers Punches");
        }

}
