package cc.cygni.commandgen.NBT.TAG;

import java.util.HashMap;
import java.util.Map;

public class TAGCompound implements TAG {
	private HashMap<String, TAG> contents;

	public TAGCompound() {
		contents = new HashMap<String, TAG>();
	}

	public TAGCompound put(String t, TAG v) {
		contents.put(t, v);
		return this;
	}
	
	public TAG get(String name) {
		return contents.get(name);
	}
	
	public TAG set(String key, TAG value) {
		if (contents.containsKey(key)) {
			contents.put(key, value);
		}
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		int inc = 0;
		for (Map.Entry<String, TAG> entry : contents.entrySet()) {
			sb.append(entry.getKey()).append(":").append(entry.getValue());
			if (inc <= contents.size() - 2) {
				sb.append(",");
			}
			inc++;
		}
		sb.append("}");
		return sb.toString();
	}
}
