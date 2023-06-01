package polymorphismFinalExam;

public class BPositiveBloodType extends BloodType {
    public BPositiveBloodType() {
        super("B+");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("B+") || otherTypeString.equals("B-") || 
               otherTypeString.equals("O+") || otherTypeString.equals("O-");
    }
}
