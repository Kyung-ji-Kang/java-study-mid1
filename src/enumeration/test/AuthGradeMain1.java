package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();

        for(AuthGrade grs: grades){
            prn(grs);
        }
    }

    private static void prn(AuthGrade authGrade){
        System.out.println("grade= "+authGrade.name()+" level = "+authGrade.getLevel()+" 설명 = "+authGrade.getDescription());
    }
}
