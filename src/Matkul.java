import java.util.ArrayList;

public class Matkul {
    static ArrayList<ArrayList<Integer>> PAW = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> ASD = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> ADSI = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> JK = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> PDB = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> EP = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> K = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> S = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> DM = new ArrayList<>();

    public static void Data() {
        for (int i = 0; i < 5; i++) {
            PAW.add(new ArrayList<>());
            ASD.add(new ArrayList<>());
            ADSI.add(new ArrayList<>());
            JK.add(new ArrayList<>());
            PDB.add(new ArrayList<>());
            EP.add(new ArrayList<>());
            K.add(new ArrayList<>());
            S.add(new ArrayList<>());
            DM.add(new ArrayList<>());
        }

        PAW.get(0).add(11105);	PAW.get(1).add(12107);	PAW.get(2).add(13109);	PAW.get(3).add(14109);	PAW.get(4).add(15207);
        PAW.get(0).add(11106);	PAW.get(1).add(12108);	PAW.get(2).add(13110);	PAW.get(3).add(14110);	PAW.get(4).add(15208);
        PAW.get(0).add(11505);	PAW.get(1).add(12311);	PAW.get(2).add(13307);	PAW.get(3).add(14509);	PAW.get(4).add(15111);
        PAW.get(0).add(11000);	PAW.get(1).add(12312);	PAW.get(2).add(13308);	PAW.get(3).add(14510);	PAW.get(4).add(15112);
        PAW.get(0).add(11000);	PAW.get(1).add(12512);	PAW.get(2).add(13409);	PAW.get(3).add(14410);	PAW.get(4).add(15406);
        ASD.get(0).add(21311);	ASD.get(1).add(22111);	ASD.get(2).add(23105);	ASD.get(3).add(24103);	ASD.get(4).add(25403);
        ASD.get(0).add(21312);	ASD.get(1).add(22112);	ASD.get(2).add(23106);	ASD.get(3).add(24104);	ASD.get(4).add(25404);
        ASD.get(0).add(21503);	ASD.get(1).add(22407);	ASD.get(2).add(23305);	ASD.get(3).add(24501);	ASD.get(4).add(25507);
        ASD.get(0).add(21504);	ASD.get(1).add(22408);	ASD.get(2).add(23306);	ASD.get(3).add(24502);	ASD.get(4).add(25508);
        ADSI.get(0).add(31201);	ADSI.get(1).add(32307);	ADSI.get(2).add(33103);	ADSI.get(3).add(34209);	ADSI.get(4).add(35109);
        ADSI.get(0).add(31202);	ADSI.get(1).add(32308);	ADSI.get(2).add(33104);	ADSI.get(3).add(34210);	ADSI.get(4).add(35110);
        ADSI.get(0).add(31501);	ADSI.get(1).add(32411);	ADSI.get(2).add(33209);	ADSI.get(3).add(34303);	ADSI.get(4).add(35303);
        ADSI.get(0).add(31502);	ADSI.get(1).add(32412);	ADSI.get(2).add(33210);	ADSI.get(3).add(34304);	ADSI.get(4).add(35304);
        ADSI.get(0).add(31401);	ADSI.get(1).add(32504);	ADSI.get(2).add(33511);	ADSI.get(3).add(34409);	ADSI.get(4).add(35408);
        JK.get(0).add(41207);	JK.get(1).add(42403);	JK.get(2).add(43301);	JK.get(3).add(44107);	JK.get(4).add(45209);
        JK.get(0).add(41208);	JK.get(1).add(42404);	JK.get(2).add(43302);	JK.get(3).add(44108);	JK.get(4).add(45210);
        JK.get(0).add(41301);	JK.get(1).add(42509);	JK.get(2).add(43401);	JK.get(3).add(44307);	JK.get(4).add(45305);
        JK.get(0).add(41302);	JK.get(1).add(42510);	JK.get(2).add(43402);	JK.get(3).add(44308);	JK.get(4).add(45306);
        PDB.get(0).add(51211);	PDB.get(1).add(52109);	PDB.get(2).add(53207);	PDB.get(3).add(54207);	PDB.get(4).add(55309);
        PDB.get(0).add(51212);	PDB.get(1).add(52110);	PDB.get(2).add(53208);	PDB.get(3).add(54208);	PDB.get(4).add(55310);
        PDB.get(0).add(51509);	PDB.get(1).add(52502);	PDB.get(2).add(53508);	PDB.get(3).add(54408);	PDB.get(4).add(55407);
        EP.get(0).add(61211);	EP.get(1).add(62207);	EP.get(2).add(63105);	EP.get(3).add(64000);	EP.get(4).add(65000);
        EP.get(0).add(61212);	EP.get(1).add(62208);	EP.get(2).add(63106);	EP.get(3).add(64000);	EP.get(4).add(65000);
        K.get(0).add(71411);	K.get(1).add(72305);	K.get(2).add(73307);	K.get(3).add(74000);	K.get(4).add(75000);
        K.get(0).add(71412);	K.get(1).add(72306);	K.get(2).add(73308);	K.get(3).add(74000);	K.get(4).add(75000);
        S.get(0).add(81209);	S.get(1).add(82103);	S.get(2).add(83209);	S.get(3).add(84411);	S.get(4).add(85203);
        S.get(0).add(81210);	S.get(1).add(82104);	S.get(2).add(83210);	S.get(3).add(84412);	S.get(4).add(85204);
        S.get(0).add(81412);	S.get(1).add(82511);	S.get(2).add(83509);	S.get(3).add(84508);	S.get(4).add(85410);
        DM.get(0).add(91502);	DM.get(1).add(92207);	DM.get(2).add(93000);	DM.get(3).add(94000);	DM.get(4).add(95000);
        DM.get(0).add(91107);	DM.get(1).add(92403);	DM.get(2).add(93000);	DM.get(3).add(94000);	DM.get(4).add(95000);
        DM.get(0).add(91108);	DM.get(1).add(92408);	DM.get(2).add(93000);	DM.get(3).add(94000);	DM.get(4).add(95000);

    }

}

