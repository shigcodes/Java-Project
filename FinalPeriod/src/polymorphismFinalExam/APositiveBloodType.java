package polymorphismFinalExam;

public class APositiveBloodType extends BloodType {
    public APositiveBloodType() {
        super("A+");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("A+") || otherTypeString.equals("A-") || 
               otherTypeString.equals("O+") || otherTypeString.equals("O-");
    }
}
