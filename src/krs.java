public class krs {
    public static void main(String[] args) {
        String[] arr = {
                "AS.get(0).add(114092);",
                "AS.get(1).add(125012);",
                "AS.get(2).add(133012);",
                "AS.get(3).add(144012);",
                "AS.get(0).add(113052);",
                "AS.get(1).add(123012);",
                "AS.get(2).add(132012);",
                "AS.get(3).add(142112);",
                "API.get(0).add(215032);",
                "API.get(1).add(224012);",
                "API.get(2).add(234032);",
                "API.get(3).add(242072);",
                "API.get(0).add(214072);",
                "API.get(1).add(223052);",
                "API.get(2).add(232052);",
                "API.get(3).add(241072);",
                "IESI.get(0).add(313073);",
                "IESI.get(1).add(322073);",
                "IESI.get(2).add(331073);",
                "IESI.get(3).add(344043);",
                "KI.get(0).add(411073);",
                "KI.get(1).add(423073);",
                "KI.get(2).add(433073);",
                "KI.get(3).add(443043);",
                "PAM.get(0).add(514032);",
                "PAM.get(1).add(523112);",
                "PAM.get(2).add(535012);",
                "PAM.get(3).add(543073);",
                "PAM.get(0).add(511043);",
                "PAM.get(1).add(522103);",
                "PAM.get(2).add(532093);",
                "PAM.get(3).add(542032);",
                "TKTI.get(0).add(612073);",
                "TKTI.get(1).add(621073);",
                "TKTI.get(2).add(634073);",
                "TKTI.get(3).add(641013);",
                "TIS.get(0).add(714052);",
                "TIS.get(1).add(724032);",
                "TIS.get(2).add(731012);",
                "TIS.get(3).add(742012);",
                "BDT.get(0).add(811073);",
                "PEWLAN.get(0).add(914103);",
                "TBC.get(0).add(1015013);",
                "EA.get(0).add(1111013);",
                "EA.get(1).add(1123073);",
        };
        for (String x:arr) {
            int sks = Character.getNumericValue(x.charAt(x.length()-3));
            int start = Integer.parseInt(x.substring(x.length()-5,x.length()-3));
            for (int i = 0; i < sks; i++) {
                System.out.printf("%s%02d);\n",x.substring(0,x.length()-5),start+i);
            }
        }
    }

}
