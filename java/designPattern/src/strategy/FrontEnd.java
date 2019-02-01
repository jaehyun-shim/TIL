package strategy;

public class FrontEnd extends Developer{
    public FrontEnd(){
        skill = new ClientSkill();
        career = new ContractCareer();
    }

    public void contents(){
        System.out.println("클라이언트개발");
    }
}
