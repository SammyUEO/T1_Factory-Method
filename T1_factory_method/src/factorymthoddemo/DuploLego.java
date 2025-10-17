package factorymthoddemo;

public class DuploLego implements LegoBrick {
 private int rows, columns;

 public DuploLego(int rows, int columns) {
     this.rows = rows * 2;
     this.columns = columns * 2;
 }

 @Override
 public void printInfo() {
     System.out.println("Duplo Lego brick: " + rows + "x" + columns);
 }
}

