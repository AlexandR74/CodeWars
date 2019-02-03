package hello;
//
//public class HelloWorld {
//    public static String greet() {
//        return "hello world!";//Make it say "hello world!"
//    }
//}
public class HelloWorld {
    public static String greet() {

        String[] fancyAnsiMessage = new String[] {     // it's really just ASCII, but hey - it sounds better...

                "        __           __ __                  ",
                "       / /_   ___   / // /____              ",
                "      / __ \\/ _ \\/ // // __ \\            ",
                "     / / / //  __// // // /_/ /             ",
                "    /_/ /_/ \\__//_//_/ \\___/              ",
                "                                            ",
                "                             __     __ __,  ",
                "     _      __ ____   _____ / /____/ // /   ",
                "    | | /| / // __ \\/ ___// // __  // /    ",
                "    | |/ |/ // /_/ // /   / // /_/ //_/     ",
                "    |__/|__/ \\___//_/   /_/ \\_,_/(_)      ",
                "                                            "

        };

        String plainAndSimpleMessage = doPlainAndSimpleConversions(fancyAnsiMessage);

        return plainAndSimpleMessage;
    }

    private static String doPlainAndSimpleConversions(String[] s) {

        StringBuilder returnValue = new StringBuilder();

        int[] plainValues = new int[s.length];
        for (int i = 0; i < s.length; i++) {

            int keyNumber = 0;
            for (int j = s[i].indexOf(" "); j >= 0; j = s[i].indexOf(" ", j + 1)) {
                keyNumber ++;
            }

            plainValues[i] = plainFunction(keyNumber);
        }

        for (int i = 0; i < s.length; i++) {
            returnValue.append((char)plainValues[simpleFunction(i)]);
        }

        return returnValue.toString();
    }

    private static int plainFunction(int x) {

        return (int)Math.round(
                (49.01861d/2185045.632)*Math.pow(x, 8) - (11644.42723d/2185045.632)*Math.pow(x, 7) +
                        (1197648.27137d/2185045.632)*Math.pow(x, 6) - (13933924.33973d/437009.1264)*Math.pow(x, 5) +
                        (1253802588.79957d/1092522.816)*Math.pow(x, 4) - (841126400.34299d/32133.024)*Math.pow(x, 3) +
                        (11216242156.92349d/30347.856)*Math.pow(x, 2) - (1120616689.55387d/379.3482)*x + (1120668.61145d/0.10948));
    }

    private static int simpleFunction(int x) {

        return (int)Math.round(
                -(287d/2851200)*Math.pow(x, 11) + (11d/1800)*Math.pow(x, 10) - (5861d/36288)*Math.pow(x, 9)+(98299d/40320)*Math.pow(x, 8) -
                        (4671223d/201600)*Math.pow(x, 7) + (230561d/1600)*Math.pow(x, 6)-(955787d/1620)*Math.pow(x, 5)+(8972333d/5760)*Math.pow(x, 4)-
                        (1139681231d/453600)*Math.pow(x, 3)+(111195433d/50400)*Math.pow(x, 2)-(21778243d/27720)*x + 4);
    }
}