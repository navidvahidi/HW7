package secondproject;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }
    @Override
    public void describeElement() {
        System.out.println("Symbol :" + getSymbol() + "   Atomic Number :" + getAtomicNumber() + "     Atomic Weight  :" + getAtomicWeight() + "   >>> A metal that conducts electricity ");
    }
}
