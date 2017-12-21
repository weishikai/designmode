package com.dewei.designmode;
/**
 * 外观模式,主要为了解耦
 * @author sa
 *
 */
public class Computer {
	CPU cpu;
	Memory memory;
	Disk disk;
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup() {
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	public void turnoff() {
		cpu.turnoff();
		memory.turnoff();
		disk.turnoff();
	}
	
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.startup();
		computer1.turnoff();
	}
}
