package cc.cygni.commandgen;

import java.util.Arrays;

import cc.cygni.commandgen.NBT.NBTTag;
import cc.cygni.commandgen.NBT.TAG.TAG;
import cc.cygni.commandgen.NBT.TAG.TAGCompound;
import cc.cygni.commandgen.NBT.TAG.TAGList;
import cc.cygni.commandgen.NBT.TAG.TAGString;
import cc.cygni.commandgen.commands.Entity;
import cc.cygni.commandgen.commands.Say;
import cc.cygni.commandgen.commands.Summon;
import cc.cygni.commandgen.commands.Type;

public class Main {

	public static void main(String[] args) {
		Say say = new Say("hi");
		System.out.println(say.compile());
		
		Summon sum = new Summon(Entity.Zombie, -1, 2, 3, newTagCompound().put("WEIJ", newTagString("ewjio")));
		System.out.println(sum.compile());
		
		TAGCompound tc = newTagCompound();
		tc.put("Equipment", newTagList(newTagCompound().put("1", newTagString("2")).put("23", newTagString("24")), newTagCompound().put("2", newTagString("2"))));
		System.out.println(tc);
		
		System.out.println(Arrays.toString(NBTTag.getAllThatSupport(NBTTag.ArmorItem)));
		System.out.println(Arrays.toString(NBTTag.getAllThatSupport(NBTTag.PortalCooldown)));
		System.out.println(Arrays.toString(NBTTag.getAllThatSupport(NBTTag.TameOwnerUUID)));
		System.out.println(Arrays.toString(Entity.getAllWithType(Type.Breedable)));
	}
	
	private static TAGList<TAG> newTagList(TAG... ts) {
		TAGList<TAG> ret = new TAGList<TAG>(0);
		for (TAG t: ts) {
			ret.append(t);
		}
		return ret;
	}
	
	private static TAGString newTagString(String s) {
		return new TAGString(s);
	}
	
	private static TAGCompound newTagCompound() {
		return new TAGCompound();
	}

}
