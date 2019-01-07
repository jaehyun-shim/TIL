public class BubbleSortClassRanking {
    private static String[] NAME;
    private static int KOREAN[];
    private static int ENGLISH[];
    private static int MATH[];
    private static float TOTAL[] = new float[4];
    private static String AVERAGE[] = new String[4];
    private static int RANK[] = {1, 1, 1, 1};

    BubbleSortClassRanking(String[] name, int[] korean, int[] english, int[] math) {
        this.NAME = name;
        this.KOREAN = korean;
        this.ENGLISH = english;
        this.MATH = math;
    }

    public static String[] getNAME() {
        return NAME;
    }

    public static int[] getKOREAN() {
        return KOREAN;
    }

    public static int[] getENGLISH() {
        return ENGLISH;
    }

    public static int[] getMATH() {
        return MATH;
    }

    public static float[] getTOTAL() {
        return TOTAL;
    }

    public static String[] getAVERAGE() {
        return AVERAGE;
    }

    public static int[] getRANK() {
        return RANK;
    }


    public static void getTitleAll() {
        int spacing[] = {3, 2, 2, 4, 4, 4, 1};
        String title[] = {"이름", "국어", "영어", "수학", "총점", "평균", "석차"};
        StringBuilder titleAll = new StringBuilder();
        for (int k = 0; k < title.length; k++) {
            int spacingInt = spacing[k] + 2;
            titleAll.append(String.format("%-" + spacingInt + "s", title[k]));
        }
        System.out.println(titleAll);
    }

    public static void setCalculate() {
        for (int i = 0; i < NAME.length; i++) {
            TOTAL[i] = KOREAN[i] + ENGLISH[i] + MATH[i];
            AVERAGE[i] = String.format("%.2f", TOTAL[i] / 3);
        }
    }

    public static void setRanking() { // 버블정렬
        for (int i = 1; i < getNAME().length; i++) {
            for (int j = i; j < getNAME().length; j++) {
                if (Float.parseFloat(AVERAGE[i]) > Float.parseFloat(AVERAGE[j])) {
                    RANK[j] = RANK[j] + 1;
                } else {
                    RANK[i] = RANK[i] + 1;
                }
            }
        }
    }

    public static void getContentsAll() {
        for (int i = 0; i < getNAME().length; i++) {
            System.out.println(String.format("%-" + 5 + "s", getNAME()[i]) +
                    String.format("%-" + 5 + "s", getKOREAN()[i]) +
                    String.format("%-" + 5 + "s", getENGLISH()[i]) +
                    String.format("%-" + 5 + "s", getMATH()[i]) +
                    String.format("%-" + 7 + "s", getTOTAL()[i]) +
                    String.format("%-" + 7 + "s", getAVERAGE()[i]) +
                    String.format("%" + 3 + "s", getRANK()[i]));
        }
    }

    public static void main(String args[]) {
        new BubbleSortClassRanking(
                new String[]{"홍길동", "이몽룡", "성춘향", "김서방"},
                new int[]{90, 80, 70, 50},
                new int[]{70, 30, 70, 90},
                new int[]{80, 80, 40, 70});
        setCalculate();
        setRanking();
        getTitleAll();
        getContentsAll();
    }
}
