package polymorphismFinalExam;

public class OPositiveBloodType extends BloodType {
    public OPositiveBloodType() {
        super("O+");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("O+") || otherTypeString.equals("O-");
    }
}
