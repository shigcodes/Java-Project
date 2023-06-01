package polymorphismFinalExam;

public class ONegativeBloodType extends BloodType {
    public ONegativeBloodType() {
        super("O-");
    }

    public boolean isCompatibleWith(BloodType otherType) {
        String otherTypeString = otherType.getType();
        return otherTypeString.equals("O-");
    }
}