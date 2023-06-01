package polymorphismFinalExam;

public abstract class BloodType {
	    private String type;

	    public BloodType(String type) {
	        this.type = type;
	    }

	    public String getType() {
	        return type;
	    }

	    public abstract boolean isCompatibleWith(BloodType otherType);
	}
