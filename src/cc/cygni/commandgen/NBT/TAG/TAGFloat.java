package cc.cygni.commandgen.NBT.TAG;

public class TAGFloat implements TAG {
	public double value;
	
	public TAGFloat(double d) {
		value = d;
	}
	
	public String toString() {
		return Double.toString(value);
	}
}
