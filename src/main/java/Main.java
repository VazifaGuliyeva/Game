public class Main {
    public static void main(String[] args) {
        Game game1=new Game(1,"Game of Thrones",23000);
        Game game2=new Game(2,"Super Mario",45000);
        Game game3=new Game(3,"Counter Strike",56000);

        Member member=new Member(1,"Vazifa","Guliyeva",0710,23479);

        Campaign campaign=new Campaign(1,"Ogrenci",20);

        MemberManager memberManager=new MemberManager();
        GameManager gameManager=new GameManager();
        CampaignManager campaignManager=new CampaignManager();
        SalesManager salesManager=new SalesManager();


        memberManager.add(member);
        gameManager.add(game1);
        campaignManager.update(campaign);
        salesManager.Sales(member,game3);
        salesManager.SalesWithCampaign(member,game2,campaign);









    }
}
