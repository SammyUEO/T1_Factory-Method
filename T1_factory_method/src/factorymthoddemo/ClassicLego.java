package factorymthoddemo;

public class ClassicLego implements LegoBrick {
    private int rows, columns;

    public ClassicLego(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void printInfo() {
        System.out.println("Classic Lego brick: " + rows + "x" + columns);
    }
}
