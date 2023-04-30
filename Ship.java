public class Ship
{
    // Instance Variables 
    private int row;
    private int col;
    private int length;
    private int direction;
    
    // Directions
    public static final int unset = -1;
    public static final int horizontal = 0;
    public static final int vertical = 1;
    
    // Constructor
    public Ship(int length)
    {
        this.length = length;
        this.row = -1;
        this.col = -1;
        this.direction = unset;
    }
    
    // checks to see if location has been set
    public boolean isLocationSet()
    {
        if (row == -1 || col == -1)
            return false;
        else
            return true;
    }
    
    public boolean isDirectionSet()
    {
        if (direction == unset)
            return false;
        else
            return true;
    }
    
    // Set the location of the ship
    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    // Set the direction of the ship
    public void setDirection(int direction)
    {
        if (direction != unset && direction != horizontal && direction != vertical)
            throw new IllegalArgumentException("your direction was invalid, gotta be -1, 0, 1");
        this.direction = direction;
    }
    
    // Gets row val
    public int getRow()
    {
        return row;
    }
    
    // Gets column val
    public int getCol()
    {
        return col;
    }
    
    // Gets ship length
    public int getLength()
    {
        return length;
    }
    
    // Gets direction
    public int getDirection()
    {
        return direction;
    }
    
    // Helper method to get a string value from the direction
    private String directionToString()
    {
        if (direction == unset)
            return "not set";
        else if (direction == horizontal)
            return "horizontal";
        else
            return "vertical";
    }
    
    // toString value for a Ship
    public String toString()
    {
        return "The Ship At: " + getRow() + ", " + getCol() + " has a length " + getLength() + " and a direction " + directionToString();
    }
}