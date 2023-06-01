package polymorphismFinalExam;

public class ABNegativeBloodType extends BloodType {
    public ABNegativeBloodType() {
        super("AB-");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("A-") || otherTypeString.equals("B-") ||
               otherTypeString.equals("AB-") || otherTypeString.equals("O-");
    }
}
