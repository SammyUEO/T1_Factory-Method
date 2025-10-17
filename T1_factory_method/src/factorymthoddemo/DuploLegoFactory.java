package factorymthoddemo;


public class DuploLegoFactory extends LegoFactory {
 @Override
 public LegoBrick createLego(int rows, int columns) {
     return new DuploLego(rows, columns);
 }
}

