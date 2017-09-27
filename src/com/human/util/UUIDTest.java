package com.human.util;

import java.util.UUID;

public class UUIDTest {
	public static final UUID DEFAULT_DFU_SERVICE_UUID       = new UUID(0x0000FE5900001000L, 0x800000805F9B34FBL); // 16-bit UUID assigned by Bluetooth SIG
	public static final UUID DEFAULT_DFU_CONTROL_POINT_UUID = new UUID(0x8EC90001F3154F60L, 0x9FB8838830DAEA50L);
	public static final UUID DEFAULT_DFU_PACKET_UUID        = new UUID(0x8EC90002F3154F60L, 0x9FB8838830DAEA50L);
	public static void main(String [] args) {
		System.out.println(UUIDTest.DEFAULT_DFU_SERVICE_UUID);
		System.out.println(UUIDTest.DEFAULT_DFU_CONTROL_POINT_UUID);
		System.out.println(UUIDTest.DEFAULT_DFU_PACKET_UUID);
	}
}
