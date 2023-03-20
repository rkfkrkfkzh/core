package hello.core.member;

public class Member {
    private Long id;
    private String neme;
    private Grade grade;

    public Member(Long id, String neme, Grade grade) {
        this.id = id;
        this.neme = neme;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
