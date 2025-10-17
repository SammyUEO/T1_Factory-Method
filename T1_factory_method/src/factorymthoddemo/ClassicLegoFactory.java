package factorymthoddemo;

public class ClassicLegoFactory extends LegoFactory {
 @Override
 public LegoBrick createLego(int rows, int columns) {
     return new ClassicLego(rows, columns);
 }
}
