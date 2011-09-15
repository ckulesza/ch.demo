package ch.demo.bitoperations;

public class BitOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] b = { 0, 1, 2, 3, 126, 127, -128, -127, -126, -3, -2, -1, 0 };
		for (byte a : b) {
			System.out.println("Zahl:\t" + a + "\tUnsigned: "
					+ getUnsignedByte(a));
		}
	}

	/**
	 * Liefert ein unsigned Byte in Form eines Integer zurück. Zu einem
	 * negativen Byte werden einfach in einer Bitoperation 255 dazuaddiert.
	 * 
	 * @param signedByte
	 * @return unsigned Byte
	 */
	public static int getUnsignedByte(byte signedByte) {
		if (signedByte < 0) {
			return 0xFF & signedByte;
		}
		return signedByte;
	}

	/**
	 * Legt die vier Bytes eines Integers in einen Bytearray.
	 * 
	 * @param integer
	 * @return ein Array mit den vier Bytes eines Integers
	 */
	public static byte[] intToByteArray(int integer) {
		byte[] b = { (byte) (integer >>> 24), (byte) (integer >>> 16),
				(byte) (integer >>> 8), (byte) (integer) };
		return b;
	}
}