package Member;

public class Member {
    private String username;
    private String email;
    private int age;

    // 생성자
    public Member(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // Getter 메서드들
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // Setter 메서드들 (필요한 경우에만 사용)
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // 회원 객체 생성 및 설정
        Member member = new Member("myUsername", "myemail@example.com", 25);

        // 생성된 회원 객체의 정보 출력
        System.out.println("Username: " + member.getUsername());
        System.out.println("Email: " + member.getEmail());
        System.out.println("Age: " + member.getAge());
    }
}