package strategy;

public class BackEnd extends Developer{
    public BackEnd(){
        skill = new ServerSkill();
        career = new RegularCareer();
    }

    public void contents(){
        System.out.println("서버개발");
    }
}
