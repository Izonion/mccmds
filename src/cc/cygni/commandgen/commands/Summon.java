package cc.cygni.commandgen.commands;

import java.util.ArrayList;

import cc.cygni.commandgen.NBT.TAG.TAGCompound;

public class Summon extends Command {
	public String name = "summon";
	public ArrayList<String> args = new ArrayList<String>(5);
	
	public Summon(Entity entity, int x, int y, int z, TAGCompound NBT) {
		args.add(entity.toString());
		args.add(Integer.toString(x));
		args.add(Integer.toString(y));
		args.add(Integer.toString(z));
		args.add(NBT.toString());
	}
	
	public String compile() {
		return super.compile(name, args);
	}
}
