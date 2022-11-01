public class SalesManager implements ISalesService {
    @Override
    public void Sales(Member member,Game game){
        System.out.println(member.getFirstName()+"oyuncusuna ait"+game.getGameName()+"oyunnu satildi");

    }

    @Override
    public void SalesWithCampaign(Member member, Game game, Campaign campaign) {
        System.out.println(member.getFirstName()+"oyuncusuna ait"+campaign.getCampaignName()+"kampanyasiyla"
        +game.getGameName()+"oyununa"+campaign.getDiscount()+"indirimi ile"+game.getGameName()
        +"oyunu satildi");


    }

}
