package strategy;

public abstract class Developer {
    protected Skill skill;
    protected Career career;
    protected Certificate certificate;

    public Developer() {

    }

    public void skillInterfaceFunction(){
        skill.skill();
    }

    public void careerInterfaceFunction(){
        career.career();
    }

    public void certificateInterfaceFunction(){
        certificate.certificate();
    }

    public abstract void contents();


    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
