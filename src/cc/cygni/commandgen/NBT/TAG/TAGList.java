package cc.cygni.commandgen.NBT.TAG;

import java.util.ArrayList;

public class TAGList<T extends TAG> implements TAG {
	private ArrayList<T> list;
	
	public TAGList(int size, Object... l) {
		list = new ArrayList<T>(size);
		for (Object x: l) {
			list.add((T) x);
		}
	}
	
	public void append(T val) {
		list.add(val);
	}
	
	@Override
	public String toString() {
		return list.toString().replace(" ", "");
	}
}

