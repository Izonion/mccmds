package cc.cygni.commandgen.NBT.TAG;

public class TAGString implements TAG {
	public String value;
	
	public TAGString() {
		value = "";
	}
	
	public TAGString(String v) {
		value = v;
	}
	
	public String toString() {
		return '"' + value + '"';
	}
}
