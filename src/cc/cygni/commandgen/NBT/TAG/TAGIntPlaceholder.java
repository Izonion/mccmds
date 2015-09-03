package cc.cygni.commandgen.NBT.TAG;

public class TAGIntPlaceholder {
	private Integer value;
	
	public TAGIntPlaceholder(int v) {
		value = v;
	}
	
	public Integer getValue() {
		if (value == null) {
			return null;
		} else {
			return value;
		}
	}
}
