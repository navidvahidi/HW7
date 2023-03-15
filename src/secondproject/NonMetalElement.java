package secondproject;

public class NonMetalElement extends Element{

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Symbol :" + getSymbol() + "   Atomic Number :" + getAtomicNumber() + "     Atomic Weight  :" + getAtomicWeight() + "  >>> A metal that does not conduct electricity ");
    }
}
