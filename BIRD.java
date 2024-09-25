public class BIRD {
    // CREATE VARIABLES TO STORE THE ATTRIBUTES

    String Bird_name;
    int Lifespan;
    boolean Has_wings;

    // CREATE A CONSTRUCTOR TO BUILD OBJECTS

    public BIRD(String Bird_name,int Lifespan,boolean Has_wings){
        this.Bird_name = Bird_name;
        this.Lifespan = Lifespan;
        this.Has_wings = Has_wings;
    }
    // CREATE METHODS
    public void fly(){
        System.out.println(this.Bird_name + " can fly");
    }

    public void eat(){
        System.out.println(this.Bird_name + " eats");
    }

}
