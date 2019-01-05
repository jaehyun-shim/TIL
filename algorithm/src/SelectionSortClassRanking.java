public class SelectionSortClassRanking {
    private static String[] NAME;
    private static int KOREA[];
    private static int ENGLISH[];
    private static int MATH[];
    private static float TOTAL[] = new float[4];
    private static String AVERAGE[] = new String[4];
    private static int RANK[] = {1, 1, 1, 1};

    SelectionSortClassRanking(String[] name, int[] korean, int[] english, int[] math) {
        this.NAME = name;
        this.KOREA = korean;
        this.ENGLISH = english;
        this.MATH = math;

        for (int i = 0; i < name.length; i++) {
            this.TOTAL[i] = korean[i] + english[i] + math[i];
            this.AVERAGE[i] = String.format("%.2f", this.TOTAL[i] / 3);
        }
    }

    public static String[] getNAME() {
        return NAME;
    }

    public static int[] getKOREA() {
        return KOREA;
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

    public static void main(String args[]) {
        int spacing[] = {3, 2, 2, 4, 4, 4, 1};
        String title[] = {"이름", "국어", "영어", "수학", "총점", "평균", "석차"};
        StringBuilder titleAll = new StringBuilder();

        for (int k = 0; k < title.length; k++) {
            int spacingInt = spacing[k] + 2;
            titleAll.append(String.format("%-" + spacingInt + "s", title[k]));
        }

        new SelectionSortClassRanking(
                new String[]{"홍길동", "이몽룡", "성춘향", "김서방"},
                new int[]{90, 80, 70, 50},
                new int[]{70, 30, 70, 90},
                new int[]{80, 80, 40, 70});

        for (int i = 0; i < getNAME().length - 1; i++) {
            for (int j = i + 1; j < getNAME().length; j++) {
                if (Float.parseFloat(AVERAGE[i]) < Float.parseFloat(AVERAGE[j])) {
                    RANK[i] = RANK[i] + 1;
                } else {
                    RANK[j] = RANK[j] + 1;
                }
            }
        }

        System.out.println(titleAll);

        for (int i = 0; i < getNAME().length; i++) {
            System.out.println(String.format("%-" + 5 + "s", getNAME()[i]) +
                    String.format("%-" + 5 + "s", getKOREA()[i]) +
                    String.format("%-" + 5 + "s", getENGLISH()[i]) +
                    String.format("%-" + 5 + "s", getMATH()[i]) +
                    String.format("%-" + 7 + "s", getTOTAL()[i]) +
                    String.format("%-" + 7 + "s", getAVERAGE()[i]) +
                    String.format("%" + 3 + "s", RANK[i]));
        }
    }

}
