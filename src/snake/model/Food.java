package snake.model;


// Represents food.
public class Food {
    public static final int DECAY_AMOUNT = 10;
    public static final int INITIAL_NUTRITIONAL_VALUE = 100;



    // the position of food
    private Cell position;
    // the nutritional value of food
    private int nutritionalValue;

    // EFFECTS: food has INITIAL_NUTRITIONAL_VALUE and is located at given cell
    public Food(Cell position) {
        //TODO
    }

    // EFFECTS: food has given nutritional value and is located at given cell
    public Food(Cell position, int nutritionalValue) {
        //TODO
    }

    // EFFECTS: returns the position of food
    public Cell getPosition() {

        return new Cell(position.getRow(), position.getColumn());
    }

    // MODIFIES: this
    // EFFECTS:  reduces nutritional value of food by DECAY_AMOUNT while maintaining a minimum
    //           nutritional value of zero
    public void decay() {
        //TODO
    }

    // EFFECTS: returns the nutritional value of food
    public int getNutritionalValue() {

        return nutritionalValue;
    }
}
