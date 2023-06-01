package polymorphismFinalExam;

public class BNegativeBloodType extends BloodType {
    public BNegativeBloodType() {
        super("B-");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("B-") || otherTypeString.equals("O-");
    }
}
