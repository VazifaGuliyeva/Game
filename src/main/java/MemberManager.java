public class MemberManager implements IMemberService{

    @Override
    public void add(Member member) {
        System.out.println(member.getFirstName()+"kaydiniz tamamlandi");
    }

    @Override
    public void update(Member member) {
        System.out.println(member.getFirstName()+"bilgileriniz guncellendi");

    }

    @Override
    public void delete(Member member) {
        System.out.println(member.getFirstName()+"bilgileriniz silindi");

    }
}
