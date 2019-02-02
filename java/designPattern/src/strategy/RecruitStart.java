package strategy;

public class RecruitStart {
    public static void main(String[] args){
        Developer backEnd = new BackEnd();
        backEnd.contents();
        backEnd.career.career();
        backEnd.skill.skill();
        backEnd.certificate.certificate();
        
        System.out.println("----------------");

        Developer frontEnd = new FrontEnd();
        frontEnd.contents();
        frontEnd.career.career();
        frontEnd.skill.skill();

    }
}
