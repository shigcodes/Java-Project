package polymorphismFinalExam;

public class ANegativeBloodType extends BloodType {
    public ANegativeBloodType() {
        super("A-");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("A-") || otherTypeString.equals("O-");
    }
}