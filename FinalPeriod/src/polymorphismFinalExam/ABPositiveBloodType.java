package polymorphismFinalExam;

public class ABPositiveBloodType extends BloodType {
    public ABPositiveBloodType() {
        super("AB+");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("A+") || otherTypeString.equals("A-") || 
               otherTypeString.equals("B+") || otherTypeString.equals("B-") ||
               otherTypeString.equals("AB+") || otherTypeString.equals("AB-") ||
               otherTypeString.equals("O+") || otherTypeString.equals("O-");
    }
}