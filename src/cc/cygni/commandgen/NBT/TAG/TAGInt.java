package cc.cygni.commandgen.NBT.TAG;

public class TAGInt implements TAG {
	public int value;
	
	public TAGInt(int v) {
		value = v;
	}
	
	public String toString() {
		return Integer.toString(value);
	}
}
