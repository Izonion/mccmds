package cc.cygni.commandgen.NBT.TAG;

public class TAGBoolean implements TAG {
	private boolean value;
	
	public TAGBoolean(boolean v) {
		value = v;
	}
	
	public String toString() {
		return Boolean.toString(value);
	}
}
