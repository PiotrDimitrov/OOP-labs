public class GameObject {
    private String name;
    private String state;
    private int speed;
    private String color;

    public GameObject(String name, String state, int speed, String color) {
        this.name = name;
        this.state = state;
        this.speed = speed;
        this.color = color;
    }

    public void informState() {
        System.out.println(name + " is " + state + " with a speed of " + speed + " and color " + color);
    }

    public static void main(String[] args) {
 
        GameObject obj1 = new GameObject("Object1", "standing", 5, "red");
        GameObject obj2 = new GameObject("Object2", "moving", 10, "blue");

        
        obj1.informState();
        obj2.informState();
    }
}