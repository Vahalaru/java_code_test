package pro.bro_programming.application;

public final class CTestUtility {

    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    private CTestUtility() {
    }
    /**
     * Convert a byte array to a hex string separated by given separator.
     *
     * @param bytes byte array to be converted
     * @param separator the string use to separate each byte
     * @return converted hex string, or "(null)" if given byte array is null
     */
    public static String toHexString(final byte[] bytes, String separator) {

        if (bytes == null) {
            return "(null)";
        }
        if (separator == null) {
            separator = "";
        }

        int slen = bytes.length * (2 + separator.length()) - separator.length();
        StringBuilder ret = new StringBuilder(slen);
        boolean addSeparator = !separator.isEmpty();
        int byteCounter = 0;

        for (int i = 0; i < bytes.length; i++) {
            if (i > 0 && byteCounter == 4 && addSeparator) {
                    ret.append(separator);
                    byteCounter = 0;
                }
                ret.append(HEX_CHARS[(bytes[i] >> 4) & 0xF]);
                ret.append(HEX_CHARS[(bytes[i] & 0xF)]);
                byteCounter = byteCounter + 1;
        }
            return ret.toString();
        }


    public static String[] ToArrayOfPlotPoints(String hexString) {
        String[] sArray = hexString.split(",");

        String[] convertedList = new String[sArray.length];

        for (int i = 0; i < sArray.length; i++) {
            float hexConverted = (int) Long.parseLong(sArray[i], 16);
            float plotPoint = hexConverted/1000;
            convertedList[i]= String.valueOf(plotPoint);
        }
        return convertedList;
    }

}
