import grade.AuthGrade;

public class Main {
    public static void main(String[] args) throws Exception{
        AuthGrade[] values = AuthGrade.values();
        for(AuthGrade value : values) {
            System.out.println("grade= " + value.name() +", level=" + value.getLevel()
            +", 설명=" + value.getDescription());
        }
    }

}