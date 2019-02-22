import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String NAME;
    private int KOR;
    private int ENG;
    private int MAT;

    public Student(String name, int kor, int eng, int mat) {
        this.NAME = name;
        this.KOR = kor;
        this.ENG = eng;
        this.MAT = mat;
    }

    @Override
    public int compareTo(Student object) {
        if (this.KOR > object.KOR) {
            return -1;
        } else if (this.KOR == object.KOR) {
            if (this.ENG < object.ENG) {
                return -1;
            } else if (this.ENG == object.ENG) {
                if (this.MAT > object.MAT) {
                    return -1;
                } else if (this.MAT == object.MAT) {
                    return this.NAME.compareTo(object.NAME);
                }
            }
        }
        return 1;
    }
    /*public int compareTo(Student object) {
        if (KOR == object.KOR) {
            if (ENG == object.ENG) {
                if (MAT == object.MAT) {
                    return NAME.compareTo(object.NAME);
                } else {
                    return object.MAT - MAT;
                }
            } else {
                return object.ENG - ENG;
            }
        } else {
            return object.KOR - KOR;
        }
    }*/

    /*@Override
    public String toString() {
        return NAME;
    }*/
}

public class Back10825 {

    static String[] splitArrayFormat(String strAll, String type) {
        return strAll.split(type);
    }

    static String print(List list) {
        Iterator<Student> itr = list.iterator();

        StringBuffer sb = new StringBuffer();

        while (itr.hasNext()) {
            sb.append(itr.next().toString()).append("\n");
        }

        return sb.toString();
    }

    public static String solution(String string) {
        String name;
        int kor, eng, mat;

        List<Student> studentDataList = new ArrayList<>();

        String[] studentDataArrayRow = splitArrayFormat(string, "\n");

        for (int i = 1; i < studentDataArrayRow.length; i++) {
            String[] studentDataArrayCol = splitArrayFormat(studentDataArrayRow[i], " ");
            name = studentDataArrayCol[0];
            kor = Integer.parseInt(studentDataArrayCol[1]);
            eng = Integer.parseInt(studentDataArrayCol[2]);
            mat = Integer.parseInt(studentDataArrayCol[3]);
            studentDataList.add(new Student(name, kor, eng, mat));
        }


        Collections.sort(studentDataList);
        //System.out.println(Student.class.toString());
        //print(studentDataList);
        return print(studentDataList);
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String name;
        int kor, eng, mat;

        List<Student> studentDataList = new ArrayList<>();

        *//*for (int i = 0; i < N; i++) {
            name = sc.next();
            kor = sc.nextInt();
            eng = sc.nextInt();
            mat = sc.nextInt();

            studentDataList.add(new Student(name, kor, eng, mat));
        }*//*

        *//*String string = "12\n" +
                "Junkyu 50 60 100\n" +
                "Sangkeun 80 60 50\n" +
                "Sunyoung 80 70 100\n" +
                "Soong 50 60 90\n" +
                "Haebin 50 60 100\n" +
                "Kangsoo 60 80 100\n" +
                "Donghyuk 80 60 100\n" +
                "Sei 70 70 70\n" +
                "Wonseob 70 70 90\n" +
                "Sanghyun 70 70 80\n" +
                "nsj 80 80 80\n" +
                "Taewhan 50 60 90";

        String[] studentDataArrayRow = splitArrayFormat(string, "\n");

        for (int i = 1; i < studentDataArrayRow.length; i++) {
            String[] studentDataArrayCol = splitArrayFormat(studentDataArrayRow[i], " ");
            name = studentDataArrayCol[0];
            kor = Integer.parseInt(studentDataArrayCol[1]);
            eng = Integer.parseInt(studentDataArrayCol[2]);
            mat = Integer.parseInt(studentDataArrayCol[3]);
            studentDataList.add(new Student(name, kor, eng, mat));
        }


        Collections.sort(studentDataList);

        print(studentDataList);*//*
    }*/

}
